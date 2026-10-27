#!/usr/bin/env python3
"""
daikon_analysis_utility.py (alias: dau.py) - Interactive CLI for reviewing and annotating Daikon invariants.

Features:
  - Vim Modal Interface:
      * NORMAL Mode:
          - Navigate invariants with 'j' / 'k' (or Up / Down)
          - Navigate scopes with 'h' / 'l' (or PgUp / PgDn / [ / ])
          - First / last invariant with 'gg' / 'G'
          - Jump to next pending (uncommented) with 'p' (or Ctrl+P)
          - Jump to previous pending with 'P'
          - Delete comment with 'x' or 'dd'
          - Undo last modification/deletion with 'u'
          - Redo with 'r' (or Ctrl+R)
          - Instant single-key classification with '1' .. '5'
          - Enter INSERT mode with 'i', 'a', 'c', or Enter
          - Enter COMMAND mode with ':'
          - Enter SEARCH mode with '/' (or Ctrl+F)
      * INSERT Mode:
          - Interactive multiline comment editing
          - Dynamic expansion of shortcuts:
              :1 or :us  -> Correct and useful
              :2 or :tr  -> Correct but trivial
              :3 or :sp  -> Too strong / likely spurious
              :4 or :inc -> Incorrect
              :5 or :un  -> Precondition violation / Unreachable
          - SHIFT+ENTER (or Alt+Enter) inserts newline
          - ENTER saves and advances to next property
          - ESC returns to NORMAL mode
      * COMMAND Mode (:):
          - :w [file]   -> Save to daikon-output.txt and daikon-output.md
          - :q          -> Quit
          - :wq or :x   -> Save and quit
          - :q!         -> Quit discarding changes
          - :<NUM>      -> Jump directly to line <NUM> in daikon-output.txt
          - :1 .. :5    -> Classify current invariant and advance
          - :us .. :un  -> Classify current invariant and advance
          - :stats      -> Display annotation progress summary
      * SEARCH Mode (/):
          - Incremental search across lines and invariants
  - Dual Persistence & Stability:
      * Annotations are saved in BOTH daikon-output.txt (as end-of-line # comments)
        and synchronized into a rich Markdown report (daikon-output.md).
      * Line numbers in daikon-output.txt are strictly preserved.
      * Every line in the Markdown report contains a clickable link directly to the
        corresponding line in daikon-output.txt (e.g. daikon-output.txt#L111).
  - Consistency checker: if comments differ between .txt and .md, prompts the user
    to choose which file has preference to resolve conflicts.
"""

import sys
import os
import shutil
import argparse
import curses
import json
import re
from dataclasses import dataclass, field
from typing import List, Optional, Tuple, Dict


class VimMode:
    NORMAL = "NORMAL"
    INSERT = "INSERT"
    COMMAND = "COMMAND"
    SEARCH = "SEARCH"


SHORTCUTS: Dict[str, str] = {
    ":1": "Correct and useful",
    ":us": "Correct and useful",
    ":cu": "Correct and useful",
    ":2": "Correct but trivial",
    ":tr": "Correct but trivial",
    ":ct": "Correct but trivial",
    ":3": "Too strong / likely spurious",
    ":sp": "Too strong / likely spurious",
    ":4": "Incorrect",
    ":inc": "Incorrect",
    ":5": "Precondition violation / Unreachable",
    ":un": "Precondition violation / Unreachable",
}


@dataclass
class InvariantItem:
    text: str
    comments: List[str] = field(default_factory=list)
    line_number: int = 0


@dataclass
class ScopeSection:
    name: str
    invariants: List[InvariantItem] = field(default_factory=list)
    raw_comments: List[str] = field(default_factory=list)
    line_number: int = 0

    @property
    def kind(self) -> str:
        if ":::ENTER" in self.name:
            return "PRECONDITION (ENTER)"
        elif ":::EXIT" in self.name:
            return "POSTCONDITION (EXIT)"
        elif ":::OBJECT" in self.name:
            return "OBJECT INVARIANT"
        elif ":::CLASS" in self.name:
            return "CLASS INVARIANT"
        return "SCOPE"

    @property
    def short_name(self) -> str:
        parts = self.name.split(".")
        if len(parts) >= 2:
            return ".".join(parts[-2:])
        return self.name

    @property
    def commented_count(self) -> int:
        return sum(1 for inv in self.invariants if inv.comments)


def extract_prop_from_cell(cell_text: str) -> str:
    """Extracts property text from markdown table cell which may contain links or backticks."""
    cell = cell_text.strip()
    m = re.search(r"\[`?([^`\]]+)`?\]\(.*?\)", cell)
    if m:
        return m.group(1).strip()
    if cell.startswith("`") and cell.endswith("`"):
        return cell[1:-1].strip()
    return cell


def parse_md_comments(md_path: str) -> Dict[str, Dict[str, List[str]]]:
    """Parses existing comments from a generated Markdown report."""
    if not os.path.exists(md_path):
        return {}

    comments_by_scope: Dict[str, Dict[str, List[str]]] = {}
    curr_scope: Optional[str] = None
    in_table = False

    try:
        with open(md_path, "r", encoding="utf-8", errors="replace") as f:
            for line in f:
                s_line = line.strip()
                if s_line.startswith("### "):
                    fb = s_line.find("`")
                    sb = s_line.find("`", fb + 1)
                    if fb != -1 and sb != -1:
                        curr_scope = s_line[fb + 1 : sb].strip()
                        if curr_scope not in comments_by_scope:
                            comments_by_scope[curr_scope] = {}
                    in_table = False
                    continue

                if s_line.startswith("| :---") or s_line.startswith("|:---"):
                    in_table = True
                    continue

                if in_table and s_line.startswith("|") and s_line.endswith("|"):
                    parts = [p.strip() for p in s_line.split("|")[1:-1]]
                    if len(parts) == 2:
                        prop = extract_prop_from_cell(parts[0]).replace("\\|", "|")
                        comment_raw = parts[1].replace("\\|", "|")
                    elif len(parts) >= 3:
                        prop = extract_prop_from_cell(parts[1]).replace("\\|", "|")
                        comment_raw = parts[2].replace("\\|", "|")
                    else:
                        continue

                    lines = [
                        c.strip()
                        for c in re.split(r"<br\s*/?>", comment_raw)
                        if c.strip()
                    ]
                    if curr_scope and prop:
                        comments_by_scope[curr_scope][prop] = lines
    except Exception:
        pass

    return comments_by_scope


class DaikonDocument:
    def __init__(
        self,
        filepath: str,
        include_all: bool = False,
        md_path: Optional[str] = None,
        prefer_source: Optional[str] = None,
        interactive: bool = True,
    ):
        self.filepath = filepath
        self.include_all = include_all
        self.md_filepath = md_path or (os.path.splitext(filepath)[0] + ".md")
        self.all_scopes: List[ScopeSection] = []
        self.active_scopes: List[ScopeSection] = []
        self.load(filepath, prefer_source=prefer_source, interactive=interactive)

    def load(
        self,
        filepath: str,
        prefer_source: Optional[str] = None,
        interactive: bool = True,
    ):
        if not os.path.exists(filepath):
            raise FileNotFoundError(f"Daikon file '{filepath}' not found.")

        with open(filepath, "r", encoding="utf-8", errors="replace") as f:
            lines = f.read().splitlines()

        self.all_scopes = []
        curr_scope_name: Optional[str] = None
        curr_scope_line: int = 0
        curr_invariants: List[InvariantItem] = []
        curr_raw_comments: List[str] = []
        curr_inv: Optional[InvariantItem] = None
        in_section = False

        for line_idx, line in enumerate(lines, start=1):
            stripped = line.strip()
            if stripped.startswith("=========="):
                if curr_scope_name is not None:
                    self.all_scopes.append(
                        ScopeSection(
                            name=curr_scope_name,
                            invariants=curr_invariants,
                            raw_comments=curr_raw_comments,
                            line_number=curr_scope_line,
                        )
                    )
                curr_scope_name = None
                curr_scope_line = 0
                curr_invariants = []
                curr_raw_comments = []
                curr_inv = None
                in_section = True
                continue

            if not in_section or not stripped:
                continue

            if curr_scope_name is None:
                if " # " in stripped:
                    curr_scope_name, sc_comment = stripped.split(" # ", 1)
                    curr_raw_comments.append(sc_comment.strip())
                else:
                    curr_scope_name = stripped
                curr_scope_line = line_idx
                continue

            if stripped.startswith("#"):
                comment_text = stripped[1:].strip() if stripped.startswith("# ") else stripped[1:]
                if curr_inv is not None:
                    curr_inv.comments.append(comment_text)
                else:
                    curr_raw_comments.append(comment_text)
            else:
                # Invariant line: check for end-of-line comment ' # '
                if " # " in stripped:
                    inv_text, comment_str = stripped.split(" # ", 1)
                    comments = [c.strip() for c in comment_str.split(" // ") if c.strip()]
                else:
                    inv_text = stripped
                    comments = []

                curr_inv = InvariantItem(
                    text=inv_text.strip(),
                    comments=comments,
                    line_number=line_idx,
                )
                curr_invariants.append(curr_inv)

        if curr_scope_name is not None:
            self.all_scopes.append(
                ScopeSection(
                    name=curr_scope_name,
                    invariants=curr_invariants,
                    raw_comments=curr_raw_comments,
                    line_number=curr_scope_line,
                )
            )

        # Detect and resolve conflicts with .md
        self.check_and_resolve_conflicts(prefer_source=prefer_source, interactive=interactive)
        self.refresh_active_scopes()

    def check_and_resolve_conflicts(
        self,
        prefer_source: Optional[str] = None,
        interactive: bool = True,
    ):
        """Checks if comments in .txt and .md differ, and resolves conflicts according to preference."""
        if not os.path.exists(self.md_filepath):
            return

        saved_md_comments = parse_md_comments(self.md_filepath)
        if not saved_md_comments:
            return

        conflicts = []
        for s in self.all_scopes:
            scope_md = saved_md_comments.get(s.name, {})
            for inv in s.invariants:
                c_txt = [c.strip() for c in inv.comments if c.strip()]
                c_md = [c.strip() for c in scope_md.get(inv.text, []) if c.strip()]
                if c_txt and c_md and c_txt != c_md:
                    conflicts.append(
                        {
                            "scope": s.name,
                            "invariant": inv.text,
                            "line": inv.line_number,
                            "txt": c_txt,
                            "md": c_md,
                        }
                    )

        chosen_preference = prefer_source
        if conflicts and not chosen_preference:
            if interactive and sys.stdin.isatty():
                chosen_preference = prompt_conflict_resolution(
                    conflicts, self.filepath, self.md_filepath
                )
            else:
                chosen_preference = "md"

        # Apply comments according to preference
        for s in self.all_scopes:
            scope_md = saved_md_comments.get(s.name, {})
            for inv in s.invariants:
                c_txt = [c.strip() for c in inv.comments if c.strip()]
                c_md = [c.strip() for c in scope_md.get(inv.text, []) if c.strip()]

                if c_txt and c_md and c_txt != c_md:
                    # Conflict: apply chosen preference
                    inv.comments = list(c_md if chosen_preference == "md" else c_txt)
                elif not c_txt and c_md:
                    # MD has comment, TXT did not -> take MD
                    inv.comments = list(c_md)
                elif c_txt and not c_md:
                    # TXT has comment, MD did not -> keep TXT
                    inv.comments = list(c_txt)

    def refresh_active_scopes(self):
        if self.include_all:
            self.active_scopes = list(self.all_scopes)
        else:
            self.active_scopes = [s for s in self.all_scopes if s.invariants]

    def save(
        self,
        dest_txt: Optional[str] = None,
        dest_md: Optional[str] = None,
        silent: bool = True,
    ):
        """
        Saves comments to BOTH daikon-output.txt (as end-of-line # comments)
        and daikon-output.md (with line links).
        """
        target_txt = dest_txt or self.filepath
        target_md = dest_md or self.md_filepath

        # 1. Save TXT file (with end-of-line comments)
        if os.path.exists(target_txt):
            bak = target_txt + ".bak"
            if not os.path.exists(bak):
                try:
                    shutil.copyfile(target_txt, bak)
                except Exception:
                    pass

        separator = "=" * 75
        out_lines: List[str] = []
        for s in self.all_scopes:
            out_lines.append(separator)
            out_lines.append(s.name)
            for rc in s.raw_comments:
                out_lines.append(f"# {rc}" if rc else "#")
            for inv in s.invariants:
                if inv.comments:
                    comment_str = " // ".join(inv.comments)
                    out_lines.append(f"{inv.text} # {comment_str}")
                else:
                    out_lines.append(inv.text)

        temp_target = target_txt + ".tmp"
        with open(temp_target, "w", encoding="utf-8") as f:
            f.write("\n".join(out_lines) + "\n")
        os.replace(temp_target, target_txt)

        # 2. Save Markdown report (with line links to TXT)
        export_markdown(self, target_md, txt_ref_path=target_txt, silent=silent)

    def stats(self) -> dict:
        total_scopes = len(self.all_scopes)
        scopes_with_invs = len([s for s in self.all_scopes if s.invariants])
        total_invs = sum(len(s.invariants) for s in self.all_scopes)
        commented_invs = sum(
            sum(1 for inv in s.invariants if inv.comments) for s in self.all_scopes
        )
        return {
            "total_scopes": total_scopes,
            "scopes_with_invariants": scopes_with_invs,
            "total_invariants": total_invs,
            "commented_invariants": commented_invs,
            "uncommented_invariants": total_invs - commented_invs,
            "completion_pct": (commented_invs / total_invs * 100.0) if total_invs else 0.0,
        }


def prompt_conflict_resolution(conflicts: list, txt_file: str, md_file: str) -> str:
    """Interactively prompts the user to resolve conflict between TXT and MD."""
    print("\n" + "=" * 70)
    print(f" [!] DISCREPANCIA DETECTADA ENTRE COMENTARIOS ({len(conflicts)} conflicto(s)):")
    print("=" * 70)
    print(f" Se encontraron diferencias entre '{os.path.basename(txt_file)}' y '{os.path.basename(md_file)}'.")
    print("\n Ejemplos de discrepancias:")
    for idx, c in enumerate(conflicts[:3], 1):
        print(f"  {idx}. Línea {c['line']} en {c['scope']}:")
        print(f"     Propiedad: {c['invariant']}")
        print(f"     • En TXT: {c['txt']}")
        print(f"     • En MD:  {c['md']}")
    if len(conflicts) > 3:
        print(f"  ... y {len(conflicts) - 3} conflicto(s) más.")

    print("\n ¿Cuál archivo tiene preferencia para sincronizar los comentarios?")
    print("   [1] Preferir Markdown (.md) -> actualizará los comentarios en el .txt")
    print("   [2] Preferir Texto    (.txt)-> actualizará los comentarios en el .md")
    print("=" * 70)
    while True:
        try:
            choice = input(" Selecciona [1 o 2] (Enter para 1): ").strip()
            if choice in ("", "1", "md"):
                print("[*] Sincronizando tomando como base Markdown (.md)...")
                return "md"
            elif choice in ("2", "txt"):
                print("[*] Sincronizando tomando como base Texto (.txt)...")
                return "txt"
            print(" Opción no válida. Por favor ingresa 1 o 2.")
        except (KeyboardInterrupt, EOFError):
            print("\nOperación cancelada.")
            sys.exit(0)


class DaikonAnnotatorTUI:
    def __init__(self, doc: DaikonDocument, output_md: str, output_txt: Optional[str] = None):
        self.doc = doc
        self.output_md = output_md
        self.output_txt = output_txt or doc.filepath
        self.current_scope_idx = 0
        self.selected_inv_idx = 0
        self.scroll_y = 0

        self.mode = VimMode.NORMAL
        self.cmd_buffer = ""
        self.cmd_cursor = 0
        self.pending_op = ""
        self.undo_stack: List[Tuple[int, int, List[str]]] = []
        self.redo_stack: List[Tuple[int, int, List[str]]] = []

        self.comment_buffer = ""
        self.cursor_pos = 0

        self.flash_msg = ""
        self.flash_is_error = False

        self.search_query = ""
        self.search_matches: List[Tuple[int, int, str]] = []
        self.search_selected_match = 0

        self.init_comment_for_selection()

    @property
    def is_searching(self) -> bool:
        return self.mode == VimMode.SEARCH

    @is_searching.setter
    def is_searching(self, val: bool):
        if val:
            self.mode = VimMode.SEARCH
        else:
            if self.mode == VimMode.SEARCH:
                self.mode = VimMode.NORMAL

    def push_undo(self, s_idx: int, i_idx: int):
        if 0 <= s_idx < len(self.doc.active_scopes):
            scope = self.doc.active_scopes[s_idx]
            if 0 <= i_idx < len(scope.invariants):
                self.undo_stack.append((s_idx, i_idx, list(scope.invariants[i_idx].comments)))
                self.redo_stack.clear()

    def undo(self):
        if not self.undo_stack:
            self.flash_msg = "Ya estás en el cambio más antiguo (nada que deshacer)"
            self.flash_is_error = False
            return
        s_idx, i_idx, old_comments = self.undo_stack.pop()
        if 0 <= s_idx < len(self.doc.active_scopes):
            scope = self.doc.active_scopes[s_idx]
            if 0 <= i_idx < len(scope.invariants):
                inv = scope.invariants[i_idx]
                self.redo_stack.append((s_idx, i_idx, list(inv.comments)))
                inv.comments = list(old_comments)
                self.current_scope_idx = s_idx
                self.selected_inv_idx = i_idx
                self.init_comment_for_selection()
                self.doc.save(self.output_txt, self.output_md, silent=True)
                self.flash_msg = "Deshecho (Undo)"
                self.flash_is_error = False

    def redo(self):
        if not self.redo_stack:
            self.flash_msg = "Ya estás en el cambio más reciente (nada que rehacer)"
            self.flash_is_error = False
            return
        s_idx, i_idx, future_comments = self.redo_stack.pop()
        if 0 <= s_idx < len(self.doc.active_scopes):
            scope = self.doc.active_scopes[s_idx]
            if 0 <= i_idx < len(scope.invariants):
                inv = scope.invariants[i_idx]
                self.undo_stack.append((s_idx, i_idx, list(inv.comments)))
                inv.comments = list(future_comments)
                self.current_scope_idx = s_idx
                self.selected_inv_idx = i_idx
                self.init_comment_for_selection()
                self.doc.save(self.output_txt, self.output_md, silent=True)
                self.flash_msg = "Rehecho (Redo)"
                self.flash_is_error = False

    def jump_to_line(self, target_line: int):
        self.commit_current_comment()
        best_diff = None
        best_s_idx = 0
        best_i_idx = 0
        found_exact = False

        for s_idx, s in enumerate(self.doc.active_scopes):
            if s.line_number == target_line:
                best_s_idx = s_idx
                best_i_idx = 0
                found_exact = True
                break
            for i_idx, inv in enumerate(s.invariants):
                if inv.line_number == target_line:
                    best_s_idx = s_idx
                    best_i_idx = i_idx
                    found_exact = True
                    break
                diff = abs(inv.line_number - target_line)
                if best_diff is None or diff < best_diff:
                    best_diff = diff
                    best_s_idx = s_idx
                    best_i_idx = i_idx
            if found_exact:
                break

        self.current_scope_idx = best_s_idx
        self.selected_inv_idx = best_i_idx
        self.init_comment_for_selection()
        scope = self.get_current_scope()
        inv = self.get_current_invariant()
        if inv and inv.line_number == target_line:
            self.flash_msg = f"Saltó a línea {target_line}: {inv.text[:40]}"
        elif scope and scope.line_number == target_line:
            self.flash_msg = f"Saltó a scope línea {target_line}: {scope.short_name}"
        elif inv:
            self.flash_msg = f"Línea más cercana: L{inv.line_number} en {scope.short_name if scope else ''}"
        else:
            self.flash_msg = f"Línea {target_line}"
        self.flash_is_error = False

    def advance_next_invariant(self):
        scope = self.get_current_scope()
        if scope and self.selected_inv_idx < len(scope.invariants) - 1:
            self.selected_inv_idx += 1
        else:
            if self.current_scope_idx < len(self.doc.active_scopes) - 1:
                self.current_scope_idx += 1
                self.selected_inv_idx = 0
                self.flash_msg = (
                    f"Scope {self.current_scope_idx + 1}/{len(self.doc.active_scopes)}: "
                    f"{self.doc.active_scopes[self.current_scope_idx].short_name}"
                )
            else:
                self.flash_msg = "Fin de todas las propiedades alcanzado."
        self.init_comment_for_selection()

    def get_current_scope(self) -> Optional[ScopeSection]:
        if 0 <= self.current_scope_idx < len(self.doc.active_scopes):
            return self.doc.active_scopes[self.current_scope_idx]
        return None

    def get_current_invariant(self) -> Optional[InvariantItem]:
        scope = self.get_current_scope()
        if scope and 0 <= self.selected_inv_idx < len(scope.invariants):
            return scope.invariants[self.selected_inv_idx]
        return None

    def init_comment_for_selection(self):
        inv = self.get_current_invariant()
        if inv and inv.comments:
            self.comment_buffer = "\n".join(inv.comments)
        else:
            self.comment_buffer = ""
        self.cursor_pos = len(self.comment_buffer)

    def commit_current_comment(self):
        inv = self.get_current_invariant()
        if inv is not None:
            trimmed = self.comment_buffer.strip()
            if trimmed in SHORTCUTS:
                self.comment_buffer = SHORTCUTS[trimmed]

            raw_lines = self.comment_buffer.split("\n")
            if not self.comment_buffer.strip():
                inv.comments = []
            else:
                inv.comments = [l.strip() for l in raw_lines if l.strip()]

    def check_shortcut_expansion(self) -> Tuple[str, int, Optional[str]]:
        for shortcut, expansion in sorted(
            SHORTCUTS.items(), key=lambda item: len(item[0]), reverse=True
        ):
            if self.comment_buffer[: self.cursor_pos].endswith(shortcut):
                start_pos = self.cursor_pos - len(shortcut)
                new_buf = (
                    self.comment_buffer[:start_pos]
                    + expansion
                    + self.comment_buffer[self.cursor_pos :]
                )
                new_pos = start_pos + len(expansion)
                return new_buf, new_pos, expansion
        return self.comment_buffer, self.cursor_pos, None

    def run(self, stdscr):
        if os.environ.get("TERM") in (None, "", "dumb"):
            os.environ["TERM"] = "xterm-256color"

        curses.use_default_colors()
        curses.start_color()
        curses.curs_set(1)

        # Disable flow control (IXON/IXOFF) so Ctrl+S and Ctrl+Q reach the app
        try:
            import termios
            fd = sys.stdin.fileno()
            attrs = termios.tcgetattr(fd)
            attrs[0] &= ~(termios.IXON | termios.IXOFF)
            termios.tcsetattr(fd, termios.TCSANOW, attrs)
        except Exception:
            pass

        try:
            curses.raw()
        except Exception:
            pass

        try:
            curses.set_escdelay(25)
        except Exception:
            pass

        # Color pairs
        curses.init_pair(1, curses.COLOR_WHITE, -1)
        curses.init_pair(2, curses.COLOR_CYAN, -1)
        curses.init_pair(3, curses.COLOR_YELLOW, -1)
        curses.init_pair(4, curses.COLOR_GREEN, -1)
        curses.init_pair(5, curses.COLOR_CYAN, -1)
        curses.init_pair(6, curses.COLOR_MAGENTA, -1)
        curses.init_pair(7, curses.COLOR_WHITE, -1)
        curses.init_pair(8, curses.COLOR_RED, -1)
        curses.init_pair(9, curses.COLOR_GREEN, -1)
        try:
            curses.init_pair(10, curses.COLOR_BLACK, curses.COLOR_CYAN)    # NORMAL badge
            curses.init_pair(11, curses.COLOR_BLACK, curses.COLOR_GREEN)   # INSERT badge
            curses.init_pair(12, curses.COLOR_BLACK, curses.COLOR_YELLOW)  # COMMAND badge
            curses.init_pair(13, curses.COLOR_BLACK, curses.COLOR_MAGENTA) # SEARCH badge
        except Exception:
            pass

        stdscr.keypad(True)
        try:
            curses.noecho()
            curses.nonl()
        except Exception:
            pass

        # Enable xterm modifyOtherKeys (mode 1: disambiguates modified keys like Shift+Enter)
        try:
            sys.stdout.write("\x1b[>4;1m")
            sys.stdout.flush()
        except Exception:
            pass

        try:
            while True:
                self.draw(stdscr)
                key = self.read_key(stdscr)

                if key is None:
                    continue

                if self.handle_main_input(key):
                    break
        finally:
            try:
                sys.stdout.write("\x1b[>4;0m")
                sys.stdout.flush()
            except Exception:
                pass

    def normalize_seq(self, s: str) -> Optional[str]:
        if s in ("[A", "OA", "[1;1A", "[1;2A", "[1;5A"):
            return "KEY_UP"
        if s in ("[B", "OB", "[1;1B", "[1;2B", "[1;5B"):
            return "KEY_DOWN"
        if s in ("[D", "OD", "[1;1D", "[1;2D", "[1;5D"):
            return "KEY_LEFT"
        if s in ("[C", "OC", "[1;1C", "[1;2C", "[1;5C"):
            return "KEY_RIGHT"
        if s in ("[5~", "[5;1~", "[5;2~", "[5;5~", "[[5~"):
            return "KEY_PGUP"
        if s in ("[6~", "[6;1~", "[6;2~", "[6;5~", "[[6~"):
            return "KEY_PGDN"
        if s in ("[H", "OH", "[1~", "[7~"):
            return "KEY_HOME"
        if s in ("[F", "OF", "[4~", "[8~"):
            return "KEY_END"
        if s in ("[27u", "[27;1u", ""):
            return "KEY_ESC"
        if s in ("[102;5u", "[102;1u"):
            return "CTRL_F"
        if s in ("[115;5u", "[115;1u"):
            return "CTRL_S"
        if s in ("[113;5u", "[113;1u"):
            return "CTRL_Q"
        if s in ("[117;5u", "[117;1u"):
            return "CTRL_U"
        if s in ("[107;5u", "[107;1u"):
            return "CTRL_K"
        if s in ("[97;5u", "[97;1u"):
            return "CTRL_A"
        if s in ("[101;5u", "[101;1u"):
            return "CTRL_E"
        if s in ("[114;5u", "[114;1u"):
            return "CTRL_R"

        # Shift+Enter variants
        if s in (
            "[13;2u",
            "[10;2u",
            "[27;2;13~",
            "[27;2;10~",
            "[13;2~",
            "[10;2~",
            "OM",
            "[OM",
            "[E",
            "[13^",
        ):
            return "SHIFT_ENTER"

        # Alt+Enter / Meta+Enter / Ctrl+Enter variants
        if s in (
            "\r",
            "\n",
            "10",
            "13",
            "[13;5u",
            "[10;5u",
            "[13;3u",
            "[10;3u",
            "[27;5;13~",
            "[27;3;13~",
            "[27;5;10~",
            "[27;3;10~",
            "[13;7u",
            "[13;8u",
            "[27;7;13~",
            "[27;8;13~",
        ):
            return "ALT_ENTER"
        return None

    def normalize_key(self, ch: any) -> any:
        if ch == curses.KEY_UP:
            return "KEY_UP"
        if ch == curses.KEY_DOWN:
            return "KEY_DOWN"
        if ch == curses.KEY_LEFT:
            return "KEY_LEFT"
        if ch == curses.KEY_RIGHT:
            return "KEY_RIGHT"
        if ch == curses.KEY_PPAGE:
            return "KEY_PGUP"
        if ch == curses.KEY_NPAGE:
            return "KEY_PGDN"
        if ch == curses.KEY_HOME:
            return "KEY_HOME"
        if ch == curses.KEY_END:
            return "KEY_END"
        if ch in (curses.KEY_ENTER, 10, 13, 343, "\n", "\r"):
            return "KEY_ENTER"
        if ch in (curses.KEY_BACKSPACE, 127, 8, "\x7f", "\b"):
            return "KEY_BACKSPACE"
        if ch in (curses.KEY_DC, "\x1b[3~"):
            return "KEY_DELETE"
        if hasattr(curses, "KEY_F2") and ch == curses.KEY_F2:
            return "CTRL_S"
        if hasattr(curses, "KEY_F3") and ch == curses.KEY_F3:
            return "CTRL_U"
        if hasattr(curses, "KEY_F10") and ch == curses.KEY_F10:
            return "CTRL_Q"

        code = (
            ord(ch)
            if isinstance(ch, str) and len(ch) == 1
            else (ch if isinstance(ch, int) else None)
        )
        if code in (10, 13):
            return "KEY_ENTER"
        if code == 6:
            return "CTRL_F"
        if code == 19:
            return "CTRL_S"
        if code in (17, 3, 4):  # Ctrl+Q, Ctrl+C, Ctrl+D
            return "CTRL_Q"
        if code == 21:
            return "CTRL_U"
        if code == 11:
            return "CTRL_K"
        if code == 15:
            return "CTRL_O"
        if code == 1:
            return "CTRL_A"
        if code == 5:
            return "CTRL_E"
        if code == 16:
            return "CTRL_P"
        if code == 18:
            return "CTRL_R"
        if code == 14:
            return "CTRL_N"
        if code == 27:
            return "KEY_ESC"

        return ch

    def read_key(self, stdscr) -> any:
        try:
            ch = stdscr.get_wch()
        except curses.error:
            return None

        if ch == "\x1b" or ch == 27:
            stdscr.timeout(25)
            try:
                nxt = stdscr.get_wch()
            except curses.error:
                nxt = None
            stdscr.timeout(-1)

            if nxt is None:
                return "KEY_ESC"

            # If nxt is '[' or 'O', it is an ANSI / VT100 / CSI escape sequence
            if nxt in ("[", "O"):
                seq = [nxt]
                stdscr.timeout(35)
                while True:
                    try:
                        c = stdscr.get_wch()
                        seq.append(c)
                        if isinstance(c, str) and (c.isalpha() or c in ("~", "u", "\r", "\n")):
                            break
                        elif isinstance(c, int):
                            break
                    except curses.error:
                        break
                stdscr.timeout(-1)
                seq_str = "".join(str(s) for s in seq)
                norm = self.normalize_seq(seq_str)
                if norm:
                    return norm
                return "KEY_ESC"

            # Alt+Enter / Meta+Enter (ESC followed by CR/LF)
            if nxt in ("\r", "\n", 10, 13):
                return "ALT_ENTER"

            # If nxt was another key pressed shortly after ESC, put it back in queue!
            try:
                curses.unget_wch(nxt)
            except Exception:
                try:
                    curses.ungetch(ord(nxt) if isinstance(nxt, str) else nxt)
                except Exception:
                    pass
            return "KEY_ESC"

        return self.normalize_key(ch)

    def handle_main_input(self, key) -> bool:
        if self.mode == VimMode.SEARCH:
            return self.handle_search_input(key)
        elif self.mode == VimMode.COMMAND:
            return self.handle_command_input(key)
        elif self.mode == VimMode.INSERT:
            return self.handle_insert_input(key)
        else:
            return self.handle_normal_input(key)

    def handle_normal_input(self, key) -> bool:
        self.flash_msg = ""
        self.flash_is_error = False
        scope = self.get_current_scope()

        # Handle pending multi-key operations (gg, dd)
        if self.pending_op == "g":
            self.pending_op = ""
            if key == "g":
                self.selected_inv_idx = 0
                self.init_comment_for_selection()
                self.flash_msg = "Primer invariante (gg)"
                return False
        elif self.pending_op == "d":
            self.pending_op = ""
            if key == "d":
                self.push_undo(self.current_scope_idx, self.selected_inv_idx)
                inv = self.get_current_invariant()
                if inv:
                    inv.comments = []
                self.comment_buffer = ""
                self.doc.save(self.output_txt, self.output_md, silent=True)
                self.flash_msg = "Comentario eliminado (dd)"
                return False

        if key == "g":
            self.pending_op = "g"
            return False

        if key == "d":
            self.pending_op = "d"
            return False

        # Undo (u)
        if key == "u":
            self.undo()
            return False

        # Redo (r or Ctrl+R)
        if key in ("r", "CTRL_R"):
            self.redo()
            return False

        # Delete comment (x)
        if key == "x":
            self.push_undo(self.current_scope_idx, self.selected_inv_idx)
            inv = self.get_current_invariant()
            if inv:
                inv.comments = []
            self.comment_buffer = ""
            self.doc.save(self.output_txt, self.output_md, silent=True)
            self.flash_msg = "Comentario eliminado (x)"
            return False

        # Jump pending: p (next), P (previous)
        if key in ("p", "CTRL_P", "CTRL_U"):
            self.jump_next_uncommented()
            return False

        if key == "P":
            self.jump_prev_uncommented()
            return False

        # Jump last (G)
        if key == "G":
            if scope and scope.invariants:
                self.selected_inv_idx = len(scope.invariants) - 1
                self.init_comment_for_selection()
                self.flash_msg = "Último invariante (G)"
            return False

        # Navigation: j/k, Down/Up
        if key in ("j", "KEY_DOWN"):
            if scope and self.selected_inv_idx < len(scope.invariants) - 1:
                self.selected_inv_idx += 1
            else:
                if self.current_scope_idx < len(self.doc.active_scopes) - 1:
                    self.current_scope_idx += 1
                    self.selected_inv_idx = 0
            self.init_comment_for_selection()
            return False

        if key in ("k", "KEY_UP"):
            if self.selected_inv_idx > 0:
                self.selected_inv_idx -= 1
            else:
                if self.current_scope_idx > 0:
                    self.current_scope_idx -= 1
                    prev_scope = self.doc.active_scopes[self.current_scope_idx]
                    self.selected_inv_idx = max(0, len(prev_scope.invariants) - 1)
            self.init_comment_for_selection()
            return False

        # Scope navigation: h/l, Left/Right, PgUp/PgDn, [/]
        if key in ("h", "KEY_LEFT", "KEY_PGUP", "["):
            if self.current_scope_idx > 0:
                self.current_scope_idx -= 1
                self.selected_inv_idx = 0
                self.init_comment_for_selection()
            return False

        if key in ("l", "KEY_RIGHT", "KEY_PGDN", "]", "\t"):
            if self.current_scope_idx < len(self.doc.active_scopes) - 1:
                self.current_scope_idx += 1
                self.selected_inv_idx = 0
                self.init_comment_for_selection()
            return False

        # Quick 1..5 classification directly in NORMAL mode!
        if key in ("1", "2", "3", "4", "5"):
            expansion = SHORTCUTS[f":{key}"]
            self.push_undo(self.current_scope_idx, self.selected_inv_idx)
            inv = self.get_current_invariant()
            if inv:
                inv.comments = [expansion]
            self.doc.save(self.output_txt, self.output_md, silent=True)
            self.advance_next_invariant()
            self.flash_msg = f"Clasificado ({key}): {expansion}"
            return False

        # Enter INSERT mode
        if key in ("i", "KEY_ENTER", "\n", "\r", 10, 13):
            self.mode = VimMode.INSERT
            self.flash_msg = "-- INSERT --"
            return False

        if key == "a":
            self.mode = VimMode.INSERT
            self.cursor_pos = len(self.comment_buffer)
            self.flash_msg = "-- INSERT --"
            return False

        if key in ("c", "o"):
            self.push_undo(self.current_scope_idx, self.selected_inv_idx)
            self.comment_buffer = ""
            self.cursor_pos = 0
            self.mode = VimMode.INSERT
            self.flash_msg = "-- INSERT (Nuevo comentario) --"
            return False

        # Enter COMMAND mode
        if key == ":":
            self.mode = VimMode.COMMAND
            self.cmd_buffer = ""
            self.cmd_cursor = 0
            return False

        # Enter SEARCH mode
        if key in ("/", "CTRL_F"):
            self.mode = VimMode.SEARCH
            self.search_query = ""
            self.update_search_matches()
            return False

        # Direct shortcuts in normal mode
        if key == "CTRL_S":
            self.commit_current_comment()
            self.doc.save(self.output_txt, self.output_md, silent=True)
            self.flash_msg = "Sincronizado: TXT y MD actualizados"
            return False

        if key in ("CTRL_Q", "KEY_ESC"):
            self.commit_current_comment()
            self.doc.save(self.output_txt, self.output_md, silent=True)
            return True

        return False

    def handle_insert_input(self, key) -> bool:
        self.flash_msg = ""
        self.flash_is_error = False

        # ESC: Return to normal mode
        if key == "KEY_ESC":
            self.commit_current_comment()
            self.mode = VimMode.NORMAL
            self.flash_msg = "-- NORMAL --"
            return False

        # Ctrl+Q: Save and quit
        if key == "CTRL_Q":
            self.commit_current_comment()
            self.doc.save(self.output_txt, self.output_md, silent=True)
            return True

        # Ctrl+S: Save
        if key == "CTRL_S":
            self.commit_current_comment()
            self.doc.save(self.output_txt, self.output_md, silent=True)
            self.flash_msg = "Sincronizado: TXT y MD actualizados"
            return False

        # SHIFT+ENTER / ALT+ENTER / Ctrl+O: Insert newline
        if key in ("SHIFT_ENTER", "ALT_ENTER", "\x0f", "CTRL_O"):
            self.comment_buffer = (
                self.comment_buffer[: self.cursor_pos]
                + "\n"
                + self.comment_buffer[self.cursor_pos :]
            )
            self.cursor_pos += 1
            return False

        # ENTER: Save comment and advance to next invariant (stays in INSERT mode)
        if key in ("KEY_ENTER", "\n", "\r", 10, 13):
            self.push_undo(self.current_scope_idx, self.selected_inv_idx)
            self.commit_current_comment()
            self.doc.save(self.output_txt, self.output_md, silent=True)
            self.advance_next_invariant()
            return False

        # Clear comment: Ctrl+K
        if key == "CTRL_K":
            self.comment_buffer = ""
            self.cursor_pos = 0
            return False

        # Arrow navigation & cursor movement inside comment editor
        lines = self.comment_buffer.split("\n")
        cur_line, cur_col = self.get_cursor_line_col()

        if key == "KEY_UP":
            if len(lines) > 1 and cur_line > 0:
                prev_line_len = len(lines[cur_line - 1])
                target_col = min(cur_col, prev_line_len)
                start_of_prev = sum(len(l) + 1 for l in lines[: cur_line - 1])
                self.cursor_pos = start_of_prev + target_col
            return False

        if key == "KEY_DOWN":
            if len(lines) > 1 and cur_line < len(lines) - 1:
                next_line_len = len(lines[cur_line + 1])
                target_col = min(cur_col, next_line_len)
                start_of_next = sum(len(l) + 1 for l in lines[: cur_line + 1])
                self.cursor_pos = start_of_next + target_col
            return False

        if key == "KEY_LEFT":
            self.cursor_pos = max(0, self.cursor_pos - 1)
            return False

        if key == "KEY_RIGHT":
            self.cursor_pos = min(len(self.comment_buffer), self.cursor_pos + 1)
            return False

        if key == "KEY_BACKSPACE":
            if self.cursor_pos > 0:
                self.comment_buffer = (
                    self.comment_buffer[: self.cursor_pos - 1]
                    + self.comment_buffer[self.cursor_pos :]
                )
                self.cursor_pos -= 1
            return False

        if key == "KEY_DELETE":
            if self.cursor_pos < len(self.comment_buffer):
                self.comment_buffer = (
                    self.comment_buffer[: self.cursor_pos]
                    + self.comment_buffer[self.cursor_pos + 1 :]
                )
            return False

        if key in ("KEY_HOME", "CTRL_A"):
            start_of_line = sum(len(l) + 1 for l in lines[:cur_line])
            self.cursor_pos = start_of_line
            return False

        if key in ("KEY_END", "CTRL_E"):
            start_of_line = sum(len(l) + 1 for l in lines[:cur_line])
            self.cursor_pos = start_of_line + len(lines[cur_line])
            return False

        # Normal printable characters
        if isinstance(key, str) and len(key) == 1 and ord(key) >= 32:
            self.comment_buffer = (
                self.comment_buffer[: self.cursor_pos]
                + key
                + self.comment_buffer[self.cursor_pos :]
            )
            self.cursor_pos += 1

            new_buf, new_pos, expanded = self.check_shortcut_expansion()
            if expanded:
                self.comment_buffer = new_buf
                self.cursor_pos = new_pos
                self.flash_msg = f"Clasificación: {expanded}"
                self.flash_is_error = False
            return False

        return False

    def handle_command_input(self, key) -> bool:
        self.flash_msg = ""
        self.flash_is_error = False

        if key in ("KEY_ESC", "CTRL_Q"):
            self.mode = VimMode.NORMAL
            self.cmd_buffer = ""
            return False

        if key in ("KEY_ENTER", "\n", "\r", 10, 13):
            cmd = self.cmd_buffer.strip()
            self.mode = VimMode.NORMAL
            self.cmd_buffer = ""

            if not cmd:
                return False

            # :w or :w <filename>
            if cmd == "w" or cmd.startswith("w "):
                self.commit_current_comment()
                if cmd.startswith("w "):
                    target = cmd[2:].strip()
                    if target.endswith(".md"):
                        export_markdown(self.doc, target, txt_ref_path=self.output_txt, silent=True)
                    else:
                        self.doc.save(dest_txt=target, dest_md=self.output_md, silent=True)
                    self.flash_msg = f"[+] Guardado en {target}"
                else:
                    self.doc.save(self.output_txt, self.output_md, silent=True)
                    self.flash_msg = f"[+] Guardado en {os.path.basename(self.output_txt)} y {os.path.basename(self.output_md)}"
                return False

            # :q
            if cmd in ("q", "quit"):
                return True

            # :wq or :x
            if cmd in ("wq", "x"):
                self.commit_current_comment()
                self.doc.save(self.output_txt, self.output_md, silent=True)
                return True

            # :q!
            if cmd in ("q!", "quit!"):
                return True

            # Jump to line number (:123 or :l123)
            num_part = (
                cmd[1:]
                if cmd.startswith("l") and cmd[1:].isdigit()
                else (cmd if cmd.isdigit() else None)
            )
            if num_part is not None:
                self.jump_to_line(int(num_part))
                return False

            # Classification shortcuts (:1, :2, :3, :4, :5, :us, :tr, :sp, :inc, :un)
            shortcut_key = cmd if cmd.startswith(":") else f":{cmd}"
            if shortcut_key in SHORTCUTS:
                expansion = SHORTCUTS[shortcut_key]
                self.push_undo(self.current_scope_idx, self.selected_inv_idx)
                inv = self.get_current_invariant()
                if inv:
                    inv.comments = [expansion]
                self.doc.save(self.output_txt, self.output_md, silent=True)
                self.advance_next_invariant()
                self.flash_msg = f"Clasificado ({cmd}): {expansion}"
                return False

            # :undo and :redo
            if cmd in ("undo", "und"):
                self.undo()
                return False

            if cmd in ("redo", "red"):
                self.redo()
                return False

            # :stats
            if cmd == "stats":
                st = self.doc.stats()
                self.flash_msg = (
                    f"Comentados: {st['commented_invariants']}/{st['total_invariants']} "
                    f"({st['completion_pct']:.1f}%) | Pendientes: {st['uncommented_invariants']}"
                )
                return False

            # :help or :h
            if cmd in ("help", "h"):
                self.flash_msg = (
                    "[:w] Guardar  [:q] Salir  [:wq] Guardar y salir  "
                    "[:<NUM>] Ir a línea  [:1..:5] Clasificar  [:stats] Stats"
                )
                return False

            # Unknown command
            self.flash_msg = f"E492: No es un comando del editor: :{cmd}"
            self.flash_is_error = True
            return False

        if key == "KEY_BACKSPACE":
            if self.cmd_cursor > 0:
                self.cmd_buffer = (
                    self.cmd_buffer[: self.cmd_cursor - 1]
                    + self.cmd_buffer[self.cmd_cursor :]
                )
                self.cmd_cursor -= 1
            else:
                self.mode = VimMode.NORMAL
            return False

        if key == "KEY_LEFT":
            self.cmd_cursor = max(0, self.cmd_cursor - 1)
            return False

        if key == "KEY_RIGHT":
            self.cmd_cursor = min(len(self.cmd_buffer), self.cmd_cursor + 1)
            return False

        if key in ("KEY_HOME", "CTRL_A"):
            self.cmd_cursor = 0
            return False

        if key in ("KEY_END", "CTRL_E"):
            self.cmd_cursor = len(self.cmd_buffer)
            return False

        if isinstance(key, str) and len(key) == 1 and ord(key) >= 32:
            self.cmd_buffer = (
                self.cmd_buffer[: self.cmd_cursor]
                + key
                + self.cmd_buffer[self.cmd_cursor :]
            )
            self.cmd_cursor += 1
            return False

        return False

    def handle_search_input(self, key) -> bool:
        if key in ("KEY_ESC", "CTRL_Q"):
            self.mode = VimMode.NORMAL
            return False

        if key in ("KEY_ENTER", "\n", "\r", 10, 13):
            if self.search_matches and 0 <= self.search_selected_match < len(self.search_matches):
                chosen_s_idx, chosen_i_idx, _ = self.search_matches[self.search_selected_match]
                self.commit_current_comment()
                self.current_scope_idx = chosen_s_idx
                self.selected_inv_idx = chosen_i_idx
                self.init_comment_for_selection()
            self.mode = VimMode.NORMAL
            return False

        if key in ("KEY_UP", "k"):
            if self.search_selected_match > 0:
                self.search_selected_match -= 1
            return False

        if key in ("KEY_DOWN", "j"):
            if self.search_selected_match < len(self.search_matches) - 1:
                self.search_selected_match += 1
            return False

        if key == "KEY_BACKSPACE":
            if self.search_query:
                self.search_query = self.search_query[:-1]
                self.update_search_matches()
            else:
                self.mode = VimMode.NORMAL
            return False

        if isinstance(key, str) and len(key) == 1 and ord(key) >= 32:
            self.search_query += key
            self.update_search_matches()
            return False

        return False

    def jump_prev_uncommented(self):
        self.commit_current_comment()
        total_scopes = len(self.doc.active_scopes)
        start_s = self.current_scope_idx
        start_i = self.selected_inv_idx - 1

        for offset in range(total_scopes):
            s_idx = (start_s - offset) % total_scopes
            scope = self.doc.active_scopes[s_idx]
            last_inv = start_i if offset == 0 else len(scope.invariants) - 1
            for i_idx in range(last_inv, -1, -1):
                if not scope.invariants[i_idx].comments:
                    self.current_scope_idx = s_idx
                    self.selected_inv_idx = i_idx
                    self.init_comment_for_selection()
                    self.flash_msg = f"Saltó a propiedad pendiente anterior en {scope.short_name}"
                    return

        self.flash_msg = "No se encontraron propiedades pendientes anteriores."

    def update_search_matches(self):
        query = self.search_query.lower().strip()
        if not query:
            self.search_matches = []
            return

        num_str = None
        if query.isdigit():
            num_str = query
        elif (query.startswith(":") or query.startswith("l")) and query[1:].isdigit():
            num_str = query[1:]

        matches = []
        if num_str is not None:
            target_line = int(num_str)
            items = []
            for s_idx, s in enumerate(self.doc.active_scopes):
                dist = abs(s.line_number - target_line)
                items.append((dist, s_idx, 0, f"[L{s.line_number}] Scope: {s.name}"))
                for i_idx, inv in enumerate(s.invariants):
                    dist_inv = abs(inv.line_number - target_line)
                    items.append(
                        (
                            dist_inv,
                            s_idx,
                            i_idx,
                            f"[L{inv.line_number}] {inv.text} ({s.short_name})",
                        )
                    )
            items.sort(key=lambda x: x[0])
            matches = [(s_idx, i_idx, desc) for _, s_idx, i_idx, desc in items[:10]]
        else:
            for s_idx, s in enumerate(self.doc.active_scopes):
                if query in s.name.lower():
                    matches.append((s_idx, 0, f"[L{s.line_number}] Scope: {s.name}"))
                for i_idx, inv in enumerate(s.invariants):
                    if query in inv.text.lower() or any(query in c.lower() for c in inv.comments):
                        matches.append(
                            (
                                s_idx,
                                i_idx,
                                f"[L{inv.line_number}] {inv.text} ({s.short_name})",
                            )
                        )
                    if len(matches) >= 15:
                        break
                if len(matches) >= 15:
                    break

        self.search_matches = matches[:10]
        self.search_selected_match = 0

    def jump_next_uncommented(self):
        self.commit_current_comment()
        total_scopes = len(self.doc.active_scopes)
        start_s = self.current_scope_idx
        start_i = self.selected_inv_idx + 1

        for offset in range(total_scopes):
            s_idx = (start_s + offset) % total_scopes
            scope = self.doc.active_scopes[s_idx]
            first_inv = start_i if offset == 0 else 0
            for i_idx in range(first_inv, len(scope.invariants)):
                if not scope.invariants[i_idx].comments:
                    self.current_scope_idx = s_idx
                    self.selected_inv_idx = i_idx
                    self.init_comment_for_selection()
                    self.flash_msg = f"Saltó a propiedad pendiente en {scope.short_name}"
                    return

        self.flash_msg = "¡Todas las propiedades tienen comentarios!"

    def get_cursor_line_col(self) -> Tuple[int, int]:
        lines = self.comment_buffer.split("\n")
        pos = 0
        for i, l in enumerate(lines):
            line_len = len(l)
            if pos <= self.cursor_pos <= pos + line_len:
                return i, self.cursor_pos - pos
            pos += line_len + 1
        return max(0, len(lines) - 1), len(lines[-1]) if lines else 0

    def get_footer_shortcut_items(
        self, max_x: int = 120
    ) -> Tuple[str, int, List[Tuple[str, str]], List[Tuple[str, str]], List[Tuple[str, str]]]:
        if self.mode == VimMode.NORMAL:
            mode_badge = " NORMAL "
            mode_pair = 10
            line1_items = [
                ("j/k", "Mover"),
                ("p/P", "Pendiente"),
                ("i", "Editar"),
                ("u", "Undo"),
                ("r", "Redo"),
                ("x", "Borrar"),
            ]
            if max_x >= 105:
                line2_items = [
                    ("1/:us", "Useful"),
                    ("2/:tr", "Trivial"),
                    ("3/:sp", "Spurious"),
                    ("4/:inc", "Incorrect"),
                    ("5/:un", "Unreachable"),
                ]
            else:
                line2_items = [
                    ("1", "Useful"),
                    ("2", "Trivial"),
                    ("3", "Spurious"),
                    ("4", "Incorrect"),
                    ("5", "Unreach"),
                ]
            line3_items = [
                ("h/l", "Scope"),
                ("gg/G", "Inicio/Fin"),
                ("/", "Buscar"),
                (":", "Comandos"),
                (":w", "Guardar"),
                (":q", "Salir"),
            ]
        elif self.mode == VimMode.INSERT:
            mode_badge = " INSERT "
            mode_pair = 11
            line1_items = [
                ("ENTER", "Guardar y sig"),
                ("ESC", "Normal"),
                ("Ctrl+S", "Guardar"),
                ("Ctrl+Q", "Salir"),
            ]
            if max_x >= 105:
                line2_items = [
                    (":1/:us", "Useful"),
                    (":2/:tr", "Trivial"),
                    (":3/:sp", "Spurious"),
                    (":4/:inc", "Incorrect"),
                    (":5/:un", "Unreachable"),
                ]
            else:
                line2_items = [
                    (":1", "Useful"),
                    (":2", "Trivial"),
                    (":3", "Spurious"),
                    (":4", "Incorrect"),
                    (":5", "Unreach"),
                ]
            line3_items = [
                ("Shift+Enter", "Nueva línea"),
                ("Alt+Enter", "Nueva línea"),
                ("//", "Separador"),
            ]
        elif self.mode == VimMode.COMMAND:
            mode_badge = " COMMAND "
            mode_pair = 12
            line1_items = [
                (":w", "Guardar"),
                (":q", "Salir"),
                (":wq", "Guardar y salir"),
                (":q!", "Salir sin guardar"),
                ("ESC", "Cancelar"),
            ]
            if max_x >= 105:
                line2_items = [
                    (":<NUM>", "Ir a línea"),
                    (":1..:5", "Clasificar"),
                    (":undo", "Deshacer"),
                    (":redo", "Rehacer"),
                    (":stats", "Estadísticas"),
                ]
            else:
                line2_items = [
                    (":<NUM>", "Ir a línea"),
                    (":1..:5", "Clasificar"),
                    (":undo", "Deshacer"),
                    (":redo", "Rehacer"),
                    (":stats", "Stats"),
                ]
            line3_items = []
        else:  # VimMode.SEARCH
            mode_badge = " SEARCH "
            mode_pair = 13
            line1_items = [
                ("j/k", "Navegar"),
                ("ENTER", "Ir a selección"),
                ("ESC", "Cancelar"),
            ]
            line2_items = [
                ("Texto", "Filtrar propiedades"),
                ("<NUM>", "Ir a línea exacta"),
            ]
            line3_items = []

        return mode_badge, mode_pair, line1_items, line2_items, line3_items

    def draw_shortcut_bar(
        self,
        stdscr,
        y: int,
        start_x: int,
        max_x: int,
        items: List[Tuple[str, str]],
    ):
        try:
            bracket_attr = curses.color_pair(5)
            key_attr = curses.color_pair(3) | curses.A_BOLD
            desc_attr = curses.color_pair(1)
        except Exception:
            bracket_attr = 0
            key_attr = curses.A_BOLD if hasattr(curses, "A_BOLD") else 0
            desc_attr = 0

        cur_x = start_x
        for key, desc in items:
            key_bracket = f"[{key}]"
            if cur_x + len(key_bracket) >= max_x - 1:
                break
            try:
                # Bracket '['
                stdscr.addstr(y, cur_x, "[", bracket_attr)
                cur_x += 1

                # Key text
                k_draw = key[: max(0, max_x - 2 - cur_x)]
                if k_draw:
                    stdscr.addstr(y, cur_x, k_draw, key_attr)
                    cur_x += len(k_draw)

                # Bracket ']'
                if cur_x < max_x - 1:
                    stdscr.addstr(y, cur_x, "]", bracket_attr)
                    cur_x += 1

                # Description and trailing spaces
                if cur_x < max_x - 1:
                    d_draw = f" {desc}  "[: max(0, max_x - 1 - cur_x)]
                    stdscr.addstr(y, cur_x, d_draw, desc_attr)
                    cur_x += len(d_draw)
            except curses.error:
                break

    def draw(self, stdscr):
        stdscr.erase()
        max_y, max_x = stdscr.getmaxyx()

        if max_y < 12 or max_x < 45:
            msg = "Terminal muy pequeña. Amplíe la ventana."
            stdscr.addstr(0, 0, msg[: max_x - 1], curses.color_pair(8))
            stdscr.refresh()
            return

        scope = self.get_current_scope()

        # ----------------- Top Header -----------------
        scope_name = scope.name if scope else "No scopes loaded"
        scope_line_info = f"[L{scope.line_number}]" if scope and scope.line_number else ""
        scope_counter = (
            f"[{self.current_scope_idx + 1}/{len(self.doc.active_scopes)}]"
            if self.doc.active_scopes
            else "[0/0]"
        )

        stdscr.attron(curses.color_pair(2) | curses.A_BOLD)
        stdscr.addstr(0, 0, f"{scope_name} {scope_line_info}"[: max_x - len(scope_counter) - 2])
        stdscr.attroff(curses.color_pair(2) | curses.A_BOLD)

        if max_x > len(scope_name) + len(scope_counter) + 4:
            stdscr.addstr(
                0,
                max_x - len(scope_counter) - 1,
                scope_counter,
                curses.color_pair(6) | curses.A_BOLD,
            )

        if scope:
            kind_badge = f"{scope.kind}"
            comment_prog = f"Comentados: {scope.commented_count}/{len(scope.invariants)}"
            stdscr.addstr(1, 0, kind_badge, curses.color_pair(6))
            if max_x > len(kind_badge) + len(comment_prog) + 4:
                stdscr.addstr(
                    1,
                    max_x - len(comment_prog) - 1,
                    comment_prog,
                    curses.color_pair(4),
                )

        # ----------------- Bottom Layout Sizing -----------------
        comment_box_height = 3
        sep2_y = max_y - 4
        comment_box_y = sep2_y - comment_box_height
        sep1_y = comment_box_y - 1

        inv_area_start_y = 2
        inv_area_height = max(1, sep1_y - inv_area_start_y)

        # ----------------- Invariants List -----------------
        visual_lines = []
        target_visual_line = 0

        if scope and scope.invariants:
            for idx, inv in enumerate(scope.invariants):
                is_selected = idx == self.selected_inv_idx
                if is_selected:
                    target_visual_line = len(visual_lines)

                prefix = "> " if is_selected else "  "
                line_tag = f"[L{inv.line_number}] " if inv.line_number else ""
                visual_lines.append(
                    (prefix + line_tag + inv.text, 3 if is_selected else 1, is_selected)
                )

                for c in inv.comments:
                    visual_lines.append((f"  # {c}", 4, False))
        else:
            visual_lines.append(("  (No hay invariantes en este scope)", 7, False))

        if target_visual_line < self.scroll_y:
            self.scroll_y = target_visual_line
        elif target_visual_line >= self.scroll_y + inv_area_height:
            self.scroll_y = target_visual_line - inv_area_height + 1

        max_scroll = max(0, len(visual_lines) - inv_area_height)
        self.scroll_y = max(0, min(self.scroll_y, max_scroll))

        for row_i in range(inv_area_height):
            v_idx = self.scroll_y + row_i
            draw_y = inv_area_start_y + row_i
            if v_idx < len(visual_lines):
                text, color_id, is_bold = visual_lines[v_idx]
                attr = curses.color_pair(color_id)
                if is_bold:
                    attr |= curses.A_BOLD
                stdscr.addstr(draw_y, 0, text[: max_x - 1], attr)

        # ----------------- Separator 1 -----------------
        sep_char = "-"
        sep_str = sep_char * min(75, max_x - 1)
        stdscr.addstr(sep1_y, 0, sep_str, curses.color_pair(5))

        # ----------------- Comment Input Area -----------------
        lines = self.comment_buffer.split("\n")
        cur_line, cur_col = self.get_cursor_line_col()

        if not self.comment_buffer:
            stdscr.addstr(comment_box_y, 0, "Comment...", curses.color_pair(7) | curses.A_DIM)
        else:
            for l_idx in range(comment_box_height):
                draw_y = comment_box_y + l_idx
                if l_idx < len(lines):
                    line_txt = lines[l_idx]
                    stdscr.addstr(draw_y, 0, line_txt[: max_x - 1], curses.color_pair(1))

        # ----------------- Separator 2 -----------------
        stdscr.addstr(sep2_y, 0, sep_str, curses.color_pair(5))

        # ----------------- Footer / Instructions -----------------
        mode_badge, mode_pair, line1_items, line2_items, line3_items = (
            self.get_footer_shortcut_items(max_x)
        )

        # Draw line max_y - 3 (Mode badge + Line 1 shortcuts)
        badge_attr = curses.color_pair(mode_pair) | curses.A_BOLD
        stdscr.addstr(max_y - 3, 0, mode_badge, badge_attr)
        badge_len = len(mode_badge) + 1
        self.draw_shortcut_bar(stdscr, max_y - 3, badge_len, max_x, line1_items)

        # Draw line max_y - 2 (Line 2 shortcuts)
        self.draw_shortcut_bar(stdscr, max_y - 2, 0, max_x, line2_items)

        # Draw line max_y - 1 (Flash message, active prompt, or Line 3 shortcuts)
        if self.mode == VimMode.COMMAND:
            prompt_str = f":{self.cmd_buffer}"
            stdscr.addstr(max_y - 1, 0, prompt_str[: max_x - 1], curses.color_pair(3) | curses.A_BOLD)
        elif self.mode == VimMode.SEARCH:
            prompt_str = f"/{self.search_query}"
            stdscr.addstr(max_y - 1, 0, prompt_str[: max_x - 1], curses.color_pair(3) | curses.A_BOLD)
        elif self.flash_msg:
            flash_attr = curses.color_pair(8 if self.flash_is_error else 9) | curses.A_BOLD
            stdscr.addstr(max_y - 1, 0, f"★ {self.flash_msg}"[: max_x - 1], flash_attr)
        else:
            self.draw_shortcut_bar(stdscr, max_y - 1, 0, max_x, line3_items)

        # ----------------- Cursor & Modal Positioning -----------------
        if self.mode == VimMode.SEARCH:
            self.draw_search_modal(stdscr, max_y, max_x)
        elif self.mode == VimMode.COMMAND:
            cmd_cursor_x = min(1 + self.cmd_cursor, max_x - 2)
            try:
                curses.curs_set(1)
                stdscr.move(max_y - 1, cmd_cursor_x)
            except curses.error:
                pass
        elif self.mode == VimMode.INSERT:
            target_cursor_y = comment_box_y + min(cur_line, comment_box_height - 1)
            target_cursor_x = min(cur_col, max_x - 2)
            try:
                curses.curs_set(1)
                stdscr.move(target_cursor_y, target_cursor_x)
            except curses.error:
                pass
        else:  # VimMode.NORMAL
            try:
                target_cursor_y = inv_area_start_y + (target_visual_line - self.scroll_y)
                if inv_area_start_y <= target_cursor_y < sep1_y:
                    curses.curs_set(1)
                    stdscr.move(target_cursor_y, 0)
                else:
                    curses.curs_set(0)
            except curses.error:
                pass

        stdscr.refresh()

    def draw_search_modal(self, stdscr, max_y, max_x):
        modal_w = min(max_x - 4, 80)
        modal_h = min(max_y - 4, 14)
        start_y = max(1, (max_y - modal_h) // 2)
        start_x = max(1, (max_x - modal_w) // 2)

        for y in range(start_y, start_y + modal_h):
            stdscr.addstr(y, start_x, " " * modal_w, curses.color_pair(2) | curses.A_REVERSE)

        title = " BUSCAR EN DAIKON-OUTPUT.TXT (Nº de línea ej: 111, o texto) "
        stdscr.addstr(start_y, start_x + 2, title[: modal_w - 4], curses.color_pair(3) | curses.A_BOLD)

        prompt = f"Buscar: {self.search_query}"
        stdscr.addstr(start_y + 1, start_x + 2, prompt[: modal_w - 4], curses.A_BOLD)

        if not self.search_matches and self.search_query:
            stdscr.addstr(start_y + 3, start_x + 2, "(Sin coincidencias)", curses.A_NORMAL)
        elif not self.search_query:
            stdscr.addstr(
                start_y + 3,
                start_x + 2,
                "Escribe un número de línea (ej: 111) o texto para buscar...",
                curses.A_DIM,
            )

        for idx, (s_idx, i_idx, desc) in enumerate(self.search_matches):
            draw_y = start_y + 3 + idx
            if draw_y >= start_y + modal_h - 1:
                break
            is_sel = idx == self.search_selected_match
            prefix = "> " if is_sel else "  "
            item_text = f"{prefix}{desc}"
            attr = curses.A_BOLD if is_sel else curses.A_NORMAL
            stdscr.addstr(draw_y, start_x + 2, item_text[: modal_w - 4], attr)

        try:
            curses.curs_set(1)
            stdscr.move(start_y + 1, start_x + 2 + len(prompt))
        except curses.error:
            pass


def print_stats(doc: DaikonDocument):
    st = doc.stats()
    print("=" * 65)
    print(" Daikon Invariant Annotations Summary")
    print("=" * 65)
    print(f" Source Daikon text file: {doc.filepath}")
    print(f" Target Markdown report:  {doc.md_filepath}")
    print(f" Total scopes:            {st['total_scopes']}")
    print(f" Scopes with invariants:  {st['scopes_with_invariants']}")
    print(f" Total invariants:        {st['total_invariants']}")
    print(
        f" Commented invariants:    {st['commented_invariants']} ({st['completion_pct']:.1f}%)"
    )
    print(f" Uncommented invariants:  {st['uncommented_invariants']}")
    print("-" * 65)
    print(" Breakdown by Scope Category:")
    categories = {"OBJECT": 0, "CLASS": 0, "ENTER": 0, "EXIT": 0}
    cat_commented = {"OBJECT": 0, "CLASS": 0, "ENTER": 0, "EXIT": 0}
    for s in doc.all_scopes:
        key = "OTHER"
        if ":::OBJECT" in s.name:
            key = "OBJECT"
        elif ":::CLASS" in s.name:
            key = "CLASS"
        elif ":::ENTER" in s.name:
            key = "ENTER"
        elif ":::EXIT" in s.name:
            key = "EXIT"

        if key in categories:
            categories[key] += len(s.invariants)
            cat_commented[key] += s.commented_count

    for cat in ("OBJECT", "CLASS", "ENTER", "EXIT"):
        tot = categories[cat]
        com = cat_commented[cat]
        pct = (com / tot * 100.0) if tot else 0.0
        label = {
            "OBJECT": "Object Invariants",
            "CLASS": "Class Invariants",
            "ENTER": "Preconditions (ENTER)",
            "EXIT": "Postconditions (EXIT)",
        }[cat]
        print(f"  • {label:<25} {com:4d} / {tot:4d} commented ({pct:5.1f}%)")
    print("=" * 65)


def export_markdown(
    doc: DaikonDocument,
    output_file: str,
    txt_ref_path: Optional[str] = None,
    silent: bool = False,
):
    """
    Exports comments to Markdown report with links to the corresponding lines in the TXT file.
    """
    target_txt = txt_ref_path or doc.filepath
    out_dir = os.path.dirname(output_file) or "."
    try:
        rel_txt = os.path.relpath(target_txt, out_dir)
    except Exception:
        rel_txt = os.path.basename(target_txt)

    lines = [
        "# Daikon Invariants Annotation Report",
        "",
        f"Generated from [`{os.path.basename(target_txt)}`]({rel_txt}).",
        "",
        "## Summary",
        "",
    ]
    st = doc.stats()
    lines.append(f"- **Total Invariants**: {st['total_invariants']}")
    lines.append(
        f"- **Commented**: {st['commented_invariants']} ({st['completion_pct']:.1f}%)"
    )
    lines.append(f"- **Pending**: {st['uncommented_invariants']}")
    lines.append("")
    lines.append("### Breakdown by Scope Category")
    lines.append("")

    categories = {"OBJECT": 0, "CLASS": 0, "ENTER": 0, "EXIT": 0}
    cat_commented = {"OBJECT": 0, "CLASS": 0, "ENTER": 0, "EXIT": 0}
    for s in doc.all_scopes:
        key = "OTHER"
        if ":::OBJECT" in s.name:
            key = "OBJECT"
        elif ":::CLASS" in s.name:
            key = "CLASS"
        elif ":::ENTER" in s.name:
            key = "ENTER"
        elif ":::EXIT" in s.name:
            key = "EXIT"

        if key in categories:
            categories[key] += len(s.invariants)
            cat_commented[key] += s.commented_count

    for cat in ("OBJECT", "CLASS", "ENTER", "EXIT"):
        tot = categories[cat]
        com = cat_commented[cat]
        pct = (com / tot * 100.0) if tot else 0.0
        label = {
            "OBJECT": "Object Invariants",
            "CLASS": "Class Invariants",
            "ENTER": "Preconditions (ENTER)",
            "EXIT": "Postconditions (EXIT)",
        }[cat]
        lines.append(f"- **{label}**: {com} / {tot} commented ({pct:.1f}%)")

    lines.append("")
    lines.append("## Annotated Invariants by Scope")
    lines.append("")

    has_any_commented = False
    for s in doc.all_scopes:
        commented = [inv for inv in s.invariants if inv.comments]
        if not commented:
            continue

        has_any_commented = True
        line_ref = f"#{rel_txt}#L{s.line_number}" if s.line_number else ""
        if s.line_number:
            lines.append(f"### [`{s.name}`]({rel_txt}#L{s.line_number})")
        else:
            lines.append(f"### `{s.name}`")

        lines.append(f"**Kind:** {s.kind}")
        lines.append("")
        lines.append("| Line | Invariant Property | Comment / Analysis |")
        lines.append("| :---: | :--- | :--- |")
        for inv in commented:
            inv_text = inv.text.replace("|", "\\|")
            comment_text = "<br>".join(c.replace("|", "\\|") for c in inv.comments)
            if inv.line_number:
                line_link = f"[{inv.line_number}]({rel_txt}#L{inv.line_number})"
                prop_link = f"[`{inv_text}`]({rel_txt}#L{inv.line_number})"
            else:
                line_link = "-"
                prop_link = f"`{inv_text}`"
            lines.append(f"| {line_link} | {prop_link} | {comment_text} |")
        lines.append("")

    if not has_any_commented:
        lines.append("*No invariants commented yet. Use `./daikon_analysis_utility.py` (or `./dau.py`) to inspect and annotate.*")
        lines.append("")

    with open(output_file, "w", encoding="utf-8") as f:
        f.write("\n".join(lines) + "\n")
    if not silent:
        print(f"[+] Markdown report successfully exported to: {output_file}")


def export_json(doc: DaikonDocument, output_file: str):
    data = {
        "file": doc.filepath,
        "md_file": doc.md_filepath,
        "stats": doc.stats(),
        "scopes": [],
    }
    for s in doc.all_scopes:
        scope_data = {
            "name": s.name,
            "kind": s.kind,
            "line_number": s.line_number,
            "invariants": [
                {
                    "property": inv.text,
                    "line_number": inv.line_number,
                    "comments": inv.comments,
                }
                for inv in s.invariants
            ],
        }
        data["scopes"].append(scope_data)

    with open(output_file, "w", encoding="utf-8") as f:
        json.dump(data, f, indent=2, ensure_ascii=False)
    print(f"[+] JSON data successfully exported to: {output_file}")


def main():
    parser = argparse.ArgumentParser(
        description="Interactive CLI tool to inspect and comment on Daikon invariants."
    )
    parser.add_argument(
        "file",
        nargs="?",
        default="daikon-output.txt",
        help="Path to the input Daikon output text file (default: daikon-output.txt)",
    )
    parser.add_argument(
        "-o",
        "--output",
        default=None,
        help="Path for exported report (default: <file>.md).",
    )
    parser.add_argument(
        "--prefer",
        choices=["md", "txt"],
        default=None,
        help="If comments differ between .txt and .md, specify preference ('md' or 'txt') non-interactively.",
    )
    parser.add_argument(
        "--all",
        action="store_true",
        help="Include empty scopes that have 0 invariants (default: only scopes with invariants)",
    )
    parser.add_argument(
        "--stats",
        action="store_true",
        help="Show statistics on comments and exit without opening the interactive UI",
    )
    parser.add_argument(
        "--export-md",
        nargs="?",
        const=True,
        default=None,
        metavar="FILE",
        help="Export all annotated invariants to a Markdown report and exit (default: <file>.md)",
    )
    parser.add_argument(
        "--export-json",
        metavar="FILE",
        help="Export all scopes, invariants, and comments to JSON and exit",
    )

    args = parser.parse_args()

    if not os.path.exists(args.file):
        print(f"Error: Daikon output file '{args.file}' not found.", file=sys.stderr)
        print("Please specify a valid daikon output file.", file=sys.stderr)
        sys.exit(1)

    default_md = os.path.splitext(args.file)[0] + ".md"
    output_md_path = args.output if (args.output and args.output.endswith(".md")) else default_md
    output_txt_path = args.output if (args.output and args.output.endswith(".txt")) else args.file

    doc = DaikonDocument(
        args.file,
        include_all=args.all,
        md_path=output_md_path,
        prefer_source=args.prefer,
        interactive=True,
    )

    if args.stats:
        print_stats(doc)
        sys.exit(0)

    if args.export_md is not None:
        md_dest = (
            args.export_md
            if isinstance(args.export_md, str)
            else output_md_path
        )
        export_markdown(doc, md_dest, txt_ref_path=output_txt_path, silent=False)
        sys.exit(0)

    if args.export_json:
        export_json(doc, args.export_json)
        sys.exit(0)

    if not doc.active_scopes:
        print("No invariant scopes found to inspect in this file.", file=sys.stderr)
        sys.exit(0)

    annotator = DaikonAnnotatorTUI(doc, output_md_path, output_txt=output_txt_path)

    try:
        curses.wrapper(annotator.run)
    except KeyboardInterrupt:
        annotator.commit_current_comment()
        doc.save(output_txt_path, output_md_path, silent=True)
    finally:
        print(f"\n[+] Archivo Daikon sincronizado: {output_txt_path}")
        print(f"[+] Reporte Markdown con enlaces a líneas generado: {output_md_path}")


if __name__ == "__main__":
    main()
