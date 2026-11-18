#!/usr/bin/env python3
"""
string_board_fuzzer.py

Grammar-Based Fuzzer and Test Harness for the Reliable 2048 implementation.
Follows the methodology and structure of The Fuzzing Book (Zeller et al.):
https://www.fuzzingbook.org/html/Grammars.html
https://www.fuzzingbook.org/html/GrammarFuzzer.html

"""

import argparse
import math
import random
import re
import string
import subprocess
import sys
import time
from typing import Any, Dict, List, Optional, Tuple

# ---------------------------------------------------------------------------
# Outcome constants (following The Fuzzing Book convention)
# ---------------------------------------------------------------------------
PASS = "PASS"
FAIL = "FAIL"
UNRESOLVED = "UNRESOLVED"

# ---------------------------------------------------------------------------
# Valid Game Constants
# ---------------------------------------------------------------------------
KEYS = ["w", "a", "s", "d"]
QUIT = "q"

# ---------------------------------------------------------------------------
# Grammars for 2048 Boards and Configurations
# ---------------------------------------------------------------------------


def build_grammar(size: int, win_val: int) -> Dict[str, List[str]]:
    """
    Dynamically constructs a BNF grammar for a `size x size` board
    containing '0' and powers of two strictly less than `win_val`.
    """
    tiles = ["0"]
    val = 2
    while val < win_val:
        tiles.append(str(val))
        val *= 2

    # Build the exact rule for N*N cells: "[<cell>,<cell>,...]"
    total_cells = size * size
    cells_prod = ",".join(["<cell>"] * total_cells)

    return {
        "<start>": ["<board>"],
        "<board>": [f"[{cells_prod}]"],
        "<cell>": tiles,
    }


# ---------------------------------------------------------------------------
# Grammar Fuzzer
# ---------------------------------------------------------------------------

RE_NONTERMINAL = re.compile(r"(<[^<> ]*>)")


def nonterminals(expansion: str) -> List[str]:
    """Returns all nonterminal symbols in an expansion string."""
    return RE_NONTERMINAL.findall(expansion)


def is_nonterminal(constant: str) -> bool:
    """Checks whether a given symbol is a nonterminal."""
    return RE_NONTERMINAL.match(constant) is not None


class GrammarFuzzer:
    """
    Produces strings by randomly expanding nonterminals according to a grammar.
    """

    def __init__(self, grammar: Dict[str, List[str]], start_symbol: str = "<start>"):
        self.grammar = grammar
        self.start_symbol = start_symbol

    def fuzz(self) -> str:
        """Derives a terminal string starting from start_symbol."""
        term = self.start_symbol
        while nonterminals(term):
            for nt in nonterminals(term):
                expansions = self.grammar.get(nt)
                if not expansions:
                    raise KeyError(f"Nonterminal {nt} not defined in grammar")
                replacement = random.choice(expansions)
                term = term.replace(nt, replacement, 1)
        return term


# ---------------------------------------------------------------------------
# String Mutation Function
# ---------------------------------------------------------------------------


def mutate_string(s: str, max_mutations: int = 3) -> str:
    """
    Applies between 1 and `max_mutations` random character operations
    (insert, delete, or substitute) to `s` to generate potentially invalid inputs.
    """
    if not s:
        return s

    # Convert string to a list for index-based manipulation
    s_list = list(s)
    num_mutations = random.randint(1, max_mutations)

    # Exclude newline characters (\n, \r) so stdin mode does not desynchronize
    # subsequent Scanner reads for winning_value and move commands
    safe_printable = [c for c in string.printable if c not in ("\n", "\r")]

    for _ in range(num_mutations):
        if not s_list:
            break  # Stop if deletions emptied the character list

        operation = random.choice(["insert", "delete", "substitute"])
        pos = random.randint(0, len(s_list) - 1)
        random_char = random.choice(safe_printable)

        if operation == "insert":
            s_list.insert(pos, random_char)
        elif operation == "delete":
            s_list.pop(pos)
        elif operation == "substitute":
            s_list[pos] = random_char

    return "".join(s_list)


# ---------------------------------------------------------------------------
# Generator of Board Configurations & Move Sequences
# ---------------------------------------------------------------------------


class BoardGameGenerator:
    """
    Generates valid (size, winning_value) configurations satisfying repOK(),
    builds the corresponding dynamic grammar, and produces boards and move sequences.
    """

    def __init__(
        self,
        min_moves: int = 5,
        max_moves: int = 50,
        min_size: int = 3,
        max_size: int = 5,
        min_winning_value: int = 16,
        max_winning_value: int = 2048,
        mutate: bool = False,
        max_mutations: int = 3,
    ):
        self.min_moves = min_moves
        self.max_moves = max_moves
        self.min_size = max(1, min_size)
        self.max_size = max(self.min_size, max_size)
        self.min_winning_value = max(2, min_winning_value)
        self.max_winning_value = max(self.min_winning_value, max_winning_value)
        self.mutate = mutate
        self.max_mutations = max_mutations

        # Generate powers of two within [min_winning_value, max_winning_value]
        min_exp = max(1, math.ceil(math.log2(self.min_winning_value)))
        max_exp = max(min_exp, math.floor(math.log2(self.max_winning_value)))
        self.valid_winning_values = [2**k for k in range(min_exp, max_exp + 1)]

    def _generate_valid_config(self) -> Tuple[int, int]:
        """
        Selects a winning_value and board size that satisfy repOK():
        - winning_value > 0 and is a power of two
        - size > 0
        - size^2 >= log2(winning_value)
        """
        compatible_targets = [
            val
            for val in self.valid_winning_values
            if math.ceil(math.sqrt(math.log2(val))) <= self.max_size
        ]

        if not compatible_targets:
            raise ValueError(
                f"Cannot satisfy validSize: max_size={self.max_size} is too small "
                f"for the minimum target ({self.valid_winning_values[0]}). "
                f"Increase max_size or lower min_winning_value."
            )

        winning_val = random.choice(compatible_targets)
        min_allowed_size = max(
            self.min_size, math.ceil(math.sqrt(math.log2(winning_val)))
        )
        size = random.randint(min_allowed_size, self.max_size)

        return size, winning_val

    def generate_trial(self) -> Tuple[int, str, int, List[str]]:
        """
        Generates a tuple (size, board_str, winning_value, moves).
        """
        size, winning_val = self._generate_valid_config()

        # Build the grammar tailored to the chosen (size, winning_val)
        grammar = build_grammar(size=size, win_val=winning_val)
        fuzzer = GrammarFuzzer(grammar)
        board_str = fuzzer.fuzz()

        if self.mutate:
            board_str = mutate_string(board_str, max_mutations=self.max_mutations)

        num_moves = random.randint(self.min_moves, self.max_moves)
        moves = random.choices(KEYS, k=num_moves)

        return size, board_str, winning_val, moves


# ---------------------------------------------------------------------------
# Fuzzing Runner & Harness
# ---------------------------------------------------------------------------


class BoardCLIRunner:
    """
    Executes the 2048 CLI as a subprocess with assertions enabled (-ea).
    Supports execution via CLI arguments or via interactive stdin.
    """

    DEFAULT_COMMAND = [
        "java",
        "-ea",
        "-cp",
        "./target/classes",
        "ar.edu.unrc.game2048.MainCLI",
    ]
    TIMEOUT = 10  # seconds per trial

    def __init__(self, command: Optional[List[str]] = None, timeout: int = 10):
        self.command = command or list(self.DEFAULT_COMMAND)
        self.timeout = timeout

    def run_args_mode(
        self, board_str: str, winning_value: int, moves: List[str]
    ) -> Tuple[Optional[subprocess.CompletedProcess], str, str]:
        """
        Executes MainCLI passing board and winning_value as CLI arguments:
        MainCLI "<board_str>" "<winning_value>"
        Moves and quit command are sent via stdin.
        """
        cmd = list(self.command) + [board_str, str(winning_value)]
        stdin_input = "\n".join(moves) + f"\n{QUIT}\n"

        return self._execute(cmd, stdin_input, mode_desc="args_mode")

    def run_stdin_mode(
        self, board_str: str, winning_value: int, moves: List[str]
    ) -> Tuple[Optional[subprocess.CompletedProcess], str, str]:
        """
        Executes MainCLI with no arguments (interactive stdin mode):
        Line 1: board_str
        Line 2: winning_value
        Following lines: moves + quit
        """
        cmd = list(self.command)
        stdin_input = (
            f"{board_str}\n{winning_value}\n" + "\n".join(moves) + f"\n{QUIT}\n"
        )

        return self._execute(cmd, stdin_input, mode_desc="stdin_mode")

    def _execute(
        self, cmd: List[str], stdin_input: str, mode_desc: str
    ) -> Tuple[Optional[subprocess.CompletedProcess], str, str]:
        """Runs the subprocess command and classifies its outcome."""
        try:
            result = subprocess.run(
                cmd,
                input=stdin_input,
                capture_output=True,
                text=True,
                timeout=self.timeout,
            )
        except subprocess.TimeoutExpired:
            return None, UNRESOLVED, f"Timeout after {self.timeout}s in {mode_desc}"
        except Exception as exc:
            return None, UNRESOLVED, f"Unexpected runner error: {exc}"

        # Classify outcome
        if result.returncode != 0:
            return result, FAIL, f"Non-zero exit code ({result.returncode})"
        if "Exception" in result.stderr or "Error" in result.stderr:
            return result, FAIL, "Error/Exception detected in stderr"

        return result, PASS, "Clean execution"


# ---------------------------------------------------------------------------
# Main Campaign Runner
# ---------------------------------------------------------------------------


def run_fuzzing_campaign(
    trials: int = 500,
    min_moves: int = 5,
    max_moves: int = 40,
    min_size: int = 3,
    max_size: int = 5,
    min_win: int = 16,
    max_win: int = 2048,
    mutate: bool = False,
    max_mutations: int = 3,
    report_every: int = 50,
) -> Dict[str, Any]:
    """
    Executes a fuzzing campaign of `trials` games and aggregates outcomes.
    """
    generator = BoardGameGenerator(
        min_moves=min_moves,
        max_moves=max_moves,
        min_size=min_size,
        max_size=max_size,
        min_winning_value=min_win,
        max_winning_value=max_win,
        mutate=mutate,
        max_mutations=max_mutations,
    )
    runner = BoardCLIRunner()

    outcomes = {PASS: 0, FAIL: 0, UNRESOLVED: 0}
    failures: List[Dict[str, Any]] = []

    campaign_type = (
        "Mutation-Based (Invalid Boards)" if mutate else "Grammar-Based (Valid Boards)"
    )
    print("==================================================")
    print(f" Starting {campaign_type} Fuzzing Campaign")
    print(" Target : ar.edu.unrc.game2048.MainCLI (with -ea)")
    print(
        f" Trials : {trials} | Sizes: {min_size}..{max_size} | Win: {min_win}..{max_win}"
    )
    print("==================================================\n")

    t_start = time.time()

    for i in range(1, trials + 1):
        size, board_str, winning_val, moves = generator.generate_trial()

        # Alternate between args_mode and stdin_mode
        mode = "args" if (i % 2 == 1) else "stdin"
        if mode == "args":
            proc, outcome, reason = runner.run_args_mode(board_str, winning_val, moves)
        else:
            proc, outcome, reason = runner.run_stdin_mode(board_str, winning_val, moves)

        outcomes[outcome] += 1

        if outcome != PASS:
            fail_info = {
                "trial": i,
                "mode": mode,
                "size": size,
                "winning_value": winning_val,
                "board_str": board_str,
                "moves": moves,
                "reason": reason,
                "returncode": proc.returncode if proc else None,
                "stderr": proc.stderr if proc else "",
                "stdout": proc.stdout if proc else "",
            }
            failures.append(fail_info)
            print(f"❌ [TRIAL {i:4d}] FAIL ({mode}) - {reason}")
            print(f"   Size: {size} | Win: {winning_val} | Board: {board_str!r}")
            if proc and proc.stderr:
                print(f"   Stderr: {proc.stderr.strip()[:250]}")
        elif i % report_every == 0 or i == trials:
            elapsed = time.time() - t_start
            rate = i / elapsed if elapsed > 0 else 0
            print(
                f"⏳ [TRIAL {i:4d}/{trials}] Progress: PASS={outcomes[PASS]} FAIL={outcomes[FAIL]} ({rate:.1f} trials/s)"
            )

    total_time = time.time() - t_start

    print("\n" + "=" * 50)
    print(" Fuzzing Campaign Summary")
    print("=" * 50)
    print(f" Total Trials : {trials}")
    print(f" PASS         : {outcomes[PASS]} ({outcomes[PASS] / trials * 100:.1f}%)")
    print(f" FAIL         : {outcomes[FAIL]} ({outcomes[FAIL] / trials * 100:.1f}%)")
    print(
        f" UNRESOLVED   : {outcomes[UNRESOLVED]} ({outcomes[UNRESOLVED] / trials * 100:.1f}%)"
    )
    print(f" Total Time   : {total_time:.2f}s")
    print("=" * 50)

    return {
        "trials": trials,
        "outcomes": outcomes,
        "failures": failures,
        "total_time": total_time,
    }


def main():
    """Parses CLI flags and launches the fuzzing campaign."""
    parser = argparse.ArgumentParser(
        description="Grammar-based and mutation-based fuzzer for 2048 initial boards."
    )
    parser.add_argument(
        "--trials",
        type=int,
        default=500,
        help="Number of fuzzing trials (default: 500)",
    )
    parser.add_argument(
        "--min-moves", type=int, default=5, help="Minimum moves per trial (default: 5)"
    )
    parser.add_argument(
        "--max-moves",
        type=int,
        default=40,
        help="Maximum moves per trial (default: 40)",
    )
    parser.add_argument(
        "--min-size", type=int, default=3, help="Minimum board size (default: 3)"
    )
    parser.add_argument(
        "--max-size", type=int, default=5, help="Maximum board size (default: 5)"
    )
    parser.add_argument(
        "--min-win", type=int, default=16, help="Minimum winning value (default: 16)"
    )
    parser.add_argument(
        "--max-win",
        type=int,
        default=2048,
        help="Maximum winning value (default: 2048)",
    )
    parser.add_argument(
        "--mutate",
        action="store_true",
        help="Enable string mutation to test invalid board rejection",
    )
    parser.add_argument(
        "--max-mutations",
        type=int,
        default=3,
        help="Max character mutations per board when --mutate is enabled (default: 3)",
    )
    args = parser.parse_args()

    results = run_fuzzing_campaign(
        trials=args.trials,
        min_moves=args.min_moves,
        max_moves=args.max_moves,
        min_size=args.min_size,
        max_size=args.max_size,
        min_win=args.min_win,
        max_win=args.max_win,
        mutate=args.mutate,
        max_mutations=args.max_mutations,
    )

    if results["outcomes"][FAIL] > 0 or results["outcomes"][UNRESOLVED] > 0:
        sys.exit(1)
    sys.exit(0)


if __name__ == "__main__":
    main()
