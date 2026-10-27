#!/usr/bin/env python3
import unittest
import os
import tempfile
import json
import curses
try:
    from daikon_analysis_utility import (
        DaikonDocument,
        DaikonAnnotatorTUI,
        ScopeSection,
        InvariantItem,
        VimMode,
        export_markdown,
        export_json,
        parse_md_comments,
    )
except ImportError:
    from dau import (
        DaikonDocument,
        DaikonAnnotatorTUI,
        ScopeSection,
        InvariantItem,
        VimMode,
        export_markdown,
        export_json,
        parse_md_comments,
    )

SAMPLE_DAIKON_TEXT = """===========================================================================
ar.edu.unrc.game2048.Board.Board():::EXIT
ar.edu.unrc.game2048.Board.DEFAULT_SIZE == this.size
# this was already commented
ar.edu.unrc.game2048.Board.DEFAULT_SIZE == size(this.grid[])
# this was already commented
# multiline note
ar.edu.unrc.game2048.Board.DEFAULT_WINNING_VALUE == this.winningValue
# this was already commented
this.grid != null
this.score == 0
this.rngStrategy != null
this.rngStrategy.getClass().getName() == ar.edu.unrc.game2048.RNG.class
===========================================================================
ar.edu.unrc.game2048.Cell:::OBJECT
this.value >= 0
this.value == 0 || this.value >= 2
===========================================================================
ar.edu.unrc.game2048.Cell:::CLASS
"""


class TestDaikonCLI(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.NamedTemporaryFile("w+", delete=False, encoding="utf-8")
        self.tmp.write(SAMPLE_DAIKON_TEXT)
        self.tmp.flush()
        self.tmp.close()

    def tearDown(self):
        if os.path.exists(self.tmp.name):
            os.remove(self.tmp.name)
        bak = self.tmp.name + ".bak"
        if os.path.exists(bak):
            os.remove(bak)
        md = os.path.splitext(self.tmp.name)[0] + ".md"
        if os.path.exists(md):
            os.remove(md)

    def test_save_syncs_txt_and_md(self):
        """Verify that saving updates TXT with end-of-line comments and syncs MD with links."""
        doc = DaikonDocument(self.tmp.name, include_all=False)
        doc.active_scopes[0].invariants[3].comments = ["New test comment"]
        doc.save()

        # Check TXT has end-of-line comment and backup was made
        with open(self.tmp.name, "r", encoding="utf-8") as f:
            txt_content = f.read()
        self.assertIn("this.grid != null # New test comment", txt_content)
        self.assertTrue(os.path.exists(self.tmp.name + ".bak"))

        # Check MD has markdown link to line in TXT
        md_file = os.path.splitext(self.tmp.name)[0] + ".md"
        self.assertTrue(os.path.exists(md_file))
        with open(md_file, "r", encoding="utf-8") as f:
            md_content = f.read()
        self.assertIn("New test comment", md_content)
        base_txt = os.path.basename(self.tmp.name)
        self.assertIn(f"{base_txt}#L", md_content)

    def test_conflict_resolution_preference(self):
        """Verify conflict resolution when TXT and MD comments differ."""
        doc = DaikonDocument(self.tmp.name, include_all=False)
        doc.active_scopes[0].invariants[3].comments = ["Initial comment"]
        doc.save()

        # Manually alter the MD file to create a conflict
        md_file = os.path.splitext(self.tmp.name)[0] + ".md"
        with open(md_file, "r", encoding="utf-8") as f:
            md_text = f.read()
        md_text = md_text.replace("Initial comment", "Comment from MD")
        with open(md_file, "w", encoding="utf-8") as f:
            f.write(md_text)

        # Alter TXT to have a different comment
        with open(self.tmp.name, "r", encoding="utf-8") as f:
            txt_text = f.read()
        txt_text = txt_text.replace("Initial comment", "Comment from TXT")
        with open(self.tmp.name, "w", encoding="utf-8") as f:
            f.write(txt_text)

        # Load with prefer_source='md'
        doc_md = DaikonDocument(self.tmp.name, prefer_source="md", interactive=False)
        self.assertEqual(doc_md.active_scopes[0].invariants[3].comments, ["Comment from MD"])

        # Load with prefer_source='txt'
        doc_txt = DaikonDocument(self.tmp.name, prefer_source="txt", interactive=False)
        self.assertEqual(doc_txt.active_scopes[0].invariants[3].comments, ["Comment from TXT"])

    def test_line_numbers_recorded(self):
        doc = DaikonDocument(self.tmp.name, include_all=False)
        s0 = doc.active_scopes[0]
        self.assertEqual(s0.line_number, 2)
        inv0 = s0.invariants[0]
        self.assertEqual(inv0.line_number, 3)
        inv3 = s0.invariants[3]
        self.assertEqual(inv3.line_number, 10)

    def test_merge_comments_from_md(self):
        doc = DaikonDocument(self.tmp.name, include_all=False)
        doc.active_scopes[0].invariants[3].comments = ["Comment loaded from MD"]
        doc.save()

        doc2 = DaikonDocument(self.tmp.name, include_all=False)
        inv3 = doc2.active_scopes[0].invariants[3]
        self.assertEqual(inv3.comments, ["Comment loaded from MD"])

    def test_stats(self):
        doc = DaikonDocument(self.tmp.name, include_all=False)
        st = doc.stats()
        self.assertEqual(st["total_scopes"], 3)
        self.assertEqual(st["scopes_with_invariants"], 2)
        self.assertEqual(st["total_invariants"], 9)
        self.assertEqual(st["commented_invariants"], 3)
        self.assertEqual(st["uncommented_invariants"], 6)

    def test_export_markdown(self):
        doc = DaikonDocument(self.tmp.name, include_all=False)
        md_file = self.tmp.name + ".custom.md"
        export_markdown(doc, md_file)
        self.assertTrue(os.path.exists(md_file))
        with open(md_file, "r", encoding="utf-8") as f:
            content = f.read()
        self.assertIn("# Daikon Invariants Annotation Report", content)
        self.assertIn("ar.edu.unrc.game2048.Board.Board():::EXIT", content)
        self.assertIn("this was already commented", content)
        if os.path.exists(md_file):
            os.remove(md_file)

    def test_export_json(self):
        doc = DaikonDocument(self.tmp.name, include_all=False)
        json_file = self.tmp.name + ".json"
        export_json(doc, json_file)
        self.assertTrue(os.path.exists(json_file))
        with open(json_file, "r", encoding="utf-8") as f:
            data = json.load(f)
        self.assertEqual(len(data["scopes"]), 3)
        self.assertEqual(data["scopes"][0]["name"], "ar.edu.unrc.game2048.Board.Board():::EXIT")
        self.assertIn("line_number", data["scopes"][0])
        if os.path.exists(json_file):
            os.remove(json_file)


class TestAnnotatorTUILogic(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.NamedTemporaryFile("w+", delete=False, encoding="utf-8")
        self.tmp.write(SAMPLE_DAIKON_TEXT)
        self.tmp.flush()
        self.tmp.close()
        self.doc = DaikonDocument(self.tmp.name, include_all=False)
        self.tui = DaikonAnnotatorTUI(self.doc, self.doc.md_filepath)

    def tearDown(self):
        if os.path.exists(self.tmp.name):
            os.remove(self.tmp.name)
        bak = self.tmp.name + ".bak"
        if os.path.exists(bak):
            os.remove(bak)
        md = os.path.splitext(self.tmp.name)[0] + ".md"
        if os.path.exists(md):
            os.remove(md)

    def test_key_normalization(self):
        """Verify robust normalization for all terminal keys."""
        # Ints from curses
        self.assertEqual(self.tui.normalize_key(curses.KEY_UP), "KEY_UP")
        self.assertEqual(self.tui.normalize_key(curses.KEY_DOWN), "KEY_DOWN")
        self.assertEqual(self.tui.normalize_key(curses.KEY_PPAGE), "KEY_PGUP")
        self.assertEqual(self.tui.normalize_key(curses.KEY_NPAGE), "KEY_PGDN")
        self.assertEqual(self.tui.normalize_key(curses.KEY_ENTER), "KEY_ENTER")
        self.assertEqual(self.tui.normalize_key(10), "KEY_ENTER")
        self.assertEqual(self.tui.normalize_key(13), "KEY_ENTER")
        self.assertEqual(self.tui.normalize_key("\n"), "KEY_ENTER")
        self.assertEqual(self.tui.normalize_key("\r"), "KEY_ENTER")

        # Control characters
        self.assertEqual(self.tui.normalize_key("\x06"), "CTRL_F")
        self.assertEqual(self.tui.normalize_key("\x13"), "CTRL_S")
        self.assertEqual(self.tui.normalize_key("\x11"), "CTRL_Q")
        self.assertEqual(self.tui.normalize_key("\x15"), "CTRL_U")
        self.assertEqual(self.tui.normalize_key("\x0b"), "CTRL_K")
        self.assertEqual(self.tui.normalize_key("\x0f"), "CTRL_O")
        self.assertEqual(self.tui.normalize_key("\x1b"), "KEY_ESC")

        # Escape sequences
        self.assertEqual(self.tui.normalize_seq("[A"), "KEY_UP")
        self.assertEqual(self.tui.normalize_seq("OA"), "KEY_UP")
        self.assertEqual(self.tui.normalize_seq("[1;1A"), "KEY_UP")
        self.assertEqual(self.tui.normalize_seq("[B"), "KEY_DOWN")
        self.assertEqual(self.tui.normalize_seq("OB"), "KEY_DOWN")
        self.assertEqual(self.tui.normalize_seq("[1;1B"), "KEY_DOWN")
        self.assertEqual(self.tui.normalize_seq("[5~"), "KEY_PGUP")
        self.assertEqual(self.tui.normalize_seq("[6~"), "KEY_PGDN")
        self.assertEqual(self.tui.normalize_seq("[27u"), "KEY_ESC")
        self.assertEqual(self.tui.normalize_seq("[102;5u"), "CTRL_F")
        self.assertEqual(self.tui.normalize_seq("[115;5u"), "CTRL_S")
        self.assertEqual(self.tui.normalize_seq("[113;5u"), "CTRL_Q")

        # Shift+Enter & Alt+Enter sequences
        self.assertEqual(self.tui.normalize_seq("[13;2u"), "SHIFT_ENTER")
        self.assertEqual(self.tui.normalize_seq("[27;2;13~"), "SHIFT_ENTER")
        self.assertEqual(self.tui.normalize_seq("\n"), "ALT_ENTER")
        self.assertEqual(self.tui.normalize_seq("\r"), "ALT_ENTER")

    def test_enter_and_shift_enter_real_keys(self):
        """Verify that real terminal Enter (\\n or \\r) and Shift/Alt+Enter work in INSERT and NORMAL modes."""
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 3
        self.tui.init_comment_for_selection()
        self.assertEqual(self.tui.comment_buffer, "")

        # In NORMAL mode, pressing Enter (\n or \r) enters INSERT mode
        self.assertEqual(self.tui.mode, VimMode.NORMAL)
        self.tui.handle_main_input("\n")
        self.assertEqual(self.tui.mode, VimMode.INSERT)

        # In INSERT mode, pressing Shift+Enter or Alt+Enter inserts newline
        for ch in "line 1":
            self.tui.handle_main_input(ch)
        self.tui.handle_main_input("SHIFT_ENTER")
        for ch in "line 2":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "line 1\nline 2")

        # In INSERT mode, pressing Alt+Enter also inserts newline
        self.tui.handle_main_input("ALT_ENTER")
        for ch in "line 3":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "line 1\nline 2\nline 3")

        # In INSERT mode, pressing real Enter (\r or \n) commits and advances
        self.tui.handle_main_input("\r")
        self.assertEqual(
            self.doc.active_scopes[0].invariants[3].comments,
            ["line 1", "line 2", "line 3"],
        )
        self.assertEqual(self.tui.selected_inv_idx, 4)

    def test_shortcut_expansion_1_to_5(self):
        """In INSERT mode, typing :1 expands to 'Correct and useful', :2 expands to 'Correct but trivial', etc."""
        self.tui.selected_inv_idx = 3  # this.grid != null
        self.tui.init_comment_for_selection()
        self.assertEqual(self.tui.comment_buffer, "")

        # Enter INSERT mode
        self.tui.handle_main_input("i")
        self.assertEqual(self.tui.mode, VimMode.INSERT)

        # Type ':'
        self.tui.handle_main_input(":")
        self.assertEqual(self.tui.comment_buffer, ":")

        # Type '1' -> should expand to 'Correct and useful'
        self.tui.handle_main_input("1")
        self.assertEqual(self.tui.comment_buffer, "Correct and useful")

        # Press ENTER: saves and advances to invariant 4 (stays in INSERT mode)
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(
            self.doc.active_scopes[0].invariants[3].comments,
            ["Correct and useful"],
        )
        self.assertEqual(self.tui.selected_inv_idx, 4)
        self.assertEqual(self.tui.mode, VimMode.INSERT)

        # On invariant 4, type ':2'
        self.tui.handle_main_input(":")
        self.tui.handle_main_input("2")
        self.assertEqual(self.tui.comment_buffer, "Correct but trivial")

        # Press ENTER
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(
            self.doc.active_scopes[0].invariants[4].comments,
            ["Correct but trivial"],
        )
        self.assertEqual(self.tui.selected_inv_idx, 5)

    def test_shortcut_expansion_text_aliases(self):
        """In INSERT mode, typing :us, :tr, :sp, :inc, :un expands to corresponding classification."""
        self.tui.selected_inv_idx = 3  # this.grid != null
        self.tui.init_comment_for_selection()
        self.tui.handle_main_input("i")

        # Test :us -> Correct and useful
        for ch in ":us":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "Correct and useful")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(self.doc.active_scopes[0].invariants[3].comments, ["Correct and useful"])

        # Test :tr -> Correct but trivial
        for ch in ":tr":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "Correct but trivial")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(self.doc.active_scopes[0].invariants[4].comments, ["Correct but trivial"])

        # Test :sp -> Too strong / likely spurious
        for ch in ":sp":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "Too strong / likely spurious")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(self.doc.active_scopes[0].invariants[5].comments, ["Too strong / likely spurious"])

        # Test :inc -> Incorrect
        for ch in ":inc":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "Incorrect")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(self.doc.active_scopes[0].invariants[6].comments, ["Incorrect"])

        # Switch to scope 1, inv 0 and test :un -> Precondition violation / Unreachable
        self.tui.current_scope_idx = 1
        self.tui.selected_inv_idx = 0
        self.tui.init_comment_for_selection()
        self.tui.mode = VimMode.INSERT
        for ch in ":un":
            self.tui.handle_main_input(ch)
        self.assertEqual(self.tui.comment_buffer, "Precondition violation / Unreachable")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(self.doc.active_scopes[1].invariants[0].comments, ["Precondition violation / Unreachable"])

    def test_search_by_line_number(self):
        """Searching '10' jumps to line 10 (this.grid != null)."""
        self.tui.handle_main_input("CTRL_F")
        self.assertTrue(self.tui.is_searching)

        for char in "10":
            self.tui.handle_search_input(char)

        self.assertTrue(len(self.tui.search_matches) > 0)
        top_match = self.tui.search_matches[0]
        self.assertEqual(top_match[0], 0)
        self.assertEqual(top_match[1], 3)
        self.assertIn("[L10] this.grid != null", top_match[2])

        # Press ENTER to select
        self.tui.handle_search_input("KEY_ENTER")
        self.assertFalse(self.tui.is_searching)
        self.assertEqual(self.tui.current_scope_idx, 0)
        self.assertEqual(self.tui.selected_inv_idx, 3)

    def test_search_by_text(self):
        """Searching text across lines of daikon-output.txt."""
        self.tui.comment_buffer = ""
        self.tui.handle_main_input("/")
        self.assertTrue(self.tui.is_searching)

        for char in "rngStrategy":
            self.tui.handle_search_input(char)

        self.assertTrue(len(self.tui.search_matches) >= 2)
        # Confirm with ENTER
        self.tui.handle_search_input("KEY_ENTER")
        self.assertFalse(self.tui.is_searching)
        curr_inv = self.tui.get_current_invariant()
        self.assertIn("rngStrategy", curr_inv.text)

    def test_shift_enter_multiline(self):
        self.tui.selected_inv_idx = 3
        self.tui.init_comment_for_selection()
        self.tui.handle_main_input("i")  # Enter INSERT mode

        for char in "line 1":
            self.tui.handle_main_input(char)
        self.tui.handle_main_input("SHIFT_ENTER")
        for char in "line 2":
            self.tui.handle_main_input(char)

        self.assertEqual(self.tui.comment_buffer, "line 1\nline 2")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(
            self.doc.active_scopes[0].invariants[3].comments,
            ["line 1", "line 2"],
        )

    def test_jump_next_uncommented(self):
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 0
        self.tui.jump_next_uncommented()
        self.assertEqual(self.tui.selected_inv_idx, 3)

    def test_navigation_keys(self):
        """Test UP, DOWN, PGUP, PGDN and Vim j, k, h, l."""
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 3  # Inv 3 has empty comment
        self.tui.init_comment_for_selection()

        self.tui.handle_main_input("KEY_DOWN")
        self.assertEqual(self.tui.selected_inv_idx, 4)

        self.tui.handle_main_input("KEY_UP")
        self.assertEqual(self.tui.selected_inv_idx, 3)

        self.tui.handle_main_input("KEY_PGDN")
        self.assertEqual(self.tui.current_scope_idx, 1)

        self.tui.handle_main_input("KEY_PGUP")
        self.assertEqual(self.tui.current_scope_idx, 0)

    def test_vim_mode_transitions(self):
        """Test mode transitions between NORMAL, INSERT, COMMAND, and SEARCH."""
        self.assertEqual(self.tui.mode, VimMode.NORMAL)

        # 'i' -> INSERT
        self.tui.handle_main_input("i")
        self.assertEqual(self.tui.mode, VimMode.INSERT)

        # ESC -> NORMAL
        self.tui.handle_main_input("KEY_ESC")
        self.assertEqual(self.tui.mode, VimMode.NORMAL)

        # ':' -> COMMAND
        self.tui.handle_main_input(":")
        self.assertEqual(self.tui.mode, VimMode.COMMAND)

        # ESC -> NORMAL
        self.tui.handle_main_input("KEY_ESC")
        self.assertEqual(self.tui.mode, VimMode.NORMAL)

        # '/' -> SEARCH
        self.tui.handle_main_input("/")
        self.assertEqual(self.tui.mode, VimMode.SEARCH)

        # ESC -> NORMAL
        self.tui.handle_main_input("KEY_ESC")
        self.assertEqual(self.tui.mode, VimMode.NORMAL)

    def test_vim_normal_navigation_and_motions(self):
        """Test j, k, h, l, gg, G in NORMAL mode."""
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 0

        # 'j' moves down
        self.tui.handle_main_input("j")
        self.assertEqual(self.tui.selected_inv_idx, 1)

        # 'k' moves up
        self.tui.handle_main_input("k")
        self.assertEqual(self.tui.selected_inv_idx, 0)

        # 'G' jumps to last invariant of scope
        self.tui.handle_main_input("G")
        self.assertEqual(self.tui.selected_inv_idx, len(self.doc.active_scopes[0].invariants) - 1)

        # 'gg' jumps to first invariant
        self.tui.handle_main_input("g")
        self.assertEqual(self.tui.pending_op, "g")
        self.tui.handle_main_input("g")
        self.assertEqual(self.tui.selected_inv_idx, 0)

        # 'l' moves to next scope
        self.tui.handle_main_input("l")
        self.assertEqual(self.tui.current_scope_idx, 1)

        # 'h' moves to prev scope
        self.tui.handle_main_input("h")
        self.assertEqual(self.tui.current_scope_idx, 0)

    def test_vim_normal_single_key_classification(self):
        """Pressing 1..5 in NORMAL mode directly classifies the invariant and advances."""
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 3  # this.grid != null

        # Press '1'
        self.tui.handle_main_input("1")
        self.assertEqual(
            self.doc.active_scopes[0].invariants[3].comments,
            ["Correct and useful"],
        )
        # Automatically advanced to invariant 4
        self.assertEqual(self.tui.selected_inv_idx, 4)

        # Press '2'
        self.tui.handle_main_input("2")
        self.assertEqual(
            self.doc.active_scopes[0].invariants[4].comments,
            ["Correct but trivial"],
        )
        self.assertEqual(self.tui.selected_inv_idx, 5)

    def test_vim_normal_actions_and_undo(self):
        """Test delete (x, dd) and undo (u)."""
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 0  # has comment "this was already commented"
        self.assertTrue(len(self.doc.active_scopes[0].invariants[0].comments) > 0)

        # 'x' deletes comment
        self.tui.handle_main_input("x")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, [])

        # 'u' undoes deletion
        self.tui.handle_main_input("u")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, ["this was already commented"])

        # 'dd' deletes comment
        self.tui.handle_main_input("d")
        self.assertEqual(self.tui.pending_op, "d")
        self.tui.handle_main_input("d")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, [])

        # 'u' undoes again
        self.tui.handle_main_input("u")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, ["this was already commented"])

        # 'r' redoes the deletion
        self.tui.handle_main_input("r")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, [])

        # 'u' undoes again
        self.tui.handle_main_input("u")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, ["this was already commented"])

        # 'CTRL_R' also redoes the deletion
        self.tui.handle_main_input("CTRL_R")
        self.assertEqual(self.doc.active_scopes[0].invariants[0].comments, [])

    def test_vim_normal_pending_navigation(self):
        """Test 'p' and 'P' to jump between pending (uncommented) invariants."""
        self.tui.current_scope_idx = 0
        self.tui.selected_inv_idx = 0

        # 'p' jumps to next pending (inv 3)
        self.tui.handle_main_input("p")
        self.assertEqual(self.tui.selected_inv_idx, 3)

        # 'P' jumps to previous pending
        self.tui.handle_main_input("j")
        self.assertEqual(self.tui.selected_inv_idx, 4)
        self.tui.handle_main_input("P")
        self.assertEqual(self.tui.selected_inv_idx, 3)

    def test_vim_command_line_execution(self):
        """Test COMMAND mode commands: :w, :<line>, :stats, :q."""
        # Test :10 jumps to line 10
        self.tui.handle_main_input(":")
        for ch in "10":
            self.tui.handle_main_input(ch)
        self.tui.handle_main_input("KEY_ENTER")
        self.assertEqual(self.tui.selected_inv_idx, 3)
        self.assertEqual(self.tui.get_current_invariant().line_number, 10)

        # Test :w saves
        self.tui.handle_main_input(":")
        self.tui.handle_main_input("w")
        self.tui.handle_main_input("KEY_ENTER")
        self.assertIn("Guardado", self.tui.flash_msg)

        # Test :stats
        self.tui.handle_main_input(":")
        for ch in "stats":
            self.tui.handle_main_input(ch)
        self.tui.handle_main_input("KEY_ENTER")
        self.assertIn("Comentados", self.tui.flash_msg)

        # Test :undo and :redo in command mode
        self.tui.handle_main_input("x")  # delete comment to have an undo entry
        self.tui.handle_main_input(":")
        for ch in "undo":
            self.tui.handle_main_input(ch)
        self.tui.handle_main_input("KEY_ENTER")
        self.assertIn("Deshecho", self.tui.flash_msg)

        self.tui.handle_main_input(":")
        for ch in "redo":
            self.tui.handle_main_input(ch)
        self.tui.handle_main_input("KEY_ENTER")
        self.assertIn("Rehecho", self.tui.flash_msg)

        # Test :q returns True to exit
        self.tui.handle_main_input(":")
        self.tui.handle_main_input("q")
        should_exit = self.tui.handle_main_input("KEY_ENTER")
        self.assertTrue(should_exit)

    def test_unified_shortcuts_no_duplicates(self):
        """Verify that shortcuts across all 3 footer rows use [key] Action format and never repeat keys."""
        # 1. Test Mock rendering of draw_shortcut_bar
        class MockStdscr:
            def __init__(self):
                self.calls = []

            def addstr(self, y, x, text, attr=0):
                self.calls.append((y, x, text, attr))

        mock = MockStdscr()
        items = [("j/k", "Mover"), ("p", "Pendiente")]
        self.tui.draw_shortcut_bar(mock, 10, 0, 80, items)

        rendered_text = "".join(c[2] for c in mock.calls)
        self.assertIn("[j/k] Mover  ", rendered_text)
        self.assertIn("[p] Pendiente  ", rendered_text)

        # 2. Test that each mode has completely disjoint shortcut sets across rows (no repetitions)
        for mode in (VimMode.NORMAL, VimMode.INSERT, VimMode.COMMAND, VimMode.SEARCH):
            self.tui.mode = mode
            for width in (80, 120):
                badge, pair, l1, l2, l3 = self.tui.get_footer_shortcut_items(max_x=width)

                keys_l1 = [k for k, _ in l1]
                keys_l2 = [k for k, _ in l2]
                keys_l3 = [k for k, _ in l3]

                # No duplicate keys within the same line
                self.assertEqual(len(keys_l1), len(set(keys_l1)), f"Duplicates in line 1 of {mode}")
                self.assertEqual(len(keys_l2), len(set(keys_l2)), f"Duplicates in line 2 of {mode}")
                self.assertEqual(len(keys_l3), len(set(keys_l3)), f"Duplicates in line 3 of {mode}")

                # No overlapping keys between line 1 and line 2
                overlap_1_2 = set(keys_l1).intersection(set(keys_l2))
                self.assertEqual(overlap_1_2, set(), f"Overlap between line 1 and 2 in {mode}: {overlap_1_2}")

                # No overlapping keys between line 1 and line 3
                overlap_1_3 = set(keys_l1).intersection(set(keys_l3))
                self.assertEqual(overlap_1_3, set(), f"Overlap between line 1 and 3 in {mode}: {overlap_1_3}")

                # No overlapping keys between line 2 and line 3
                overlap_2_3 = set(keys_l2).intersection(set(keys_l3))
                self.assertEqual(overlap_2_3, set(), f"Overlap between line 2 and 3 in {mode}: {overlap_2_3}")


if __name__ == "__main__":
    unittest.main()
