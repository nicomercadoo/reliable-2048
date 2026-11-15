#!/usr/bin/env python3
"""
string_board_fuzzer.py

Grammar-Based Fuzzer and Test Harness for the Reliable 2048 implementation.
Follows the methodology and structure of The Fuzzing Book (Zeller et al.):
https://www.fuzzingbook.org/html/Grammars.html
https://www.fuzzingbook.org/html/GrammarFuzzer.html

Features:
- Grammar-based generation of valid 2048 boards (3x3, 4x4, 5x5) using BNF expansion rules.
- Compatible winning value generation and random move sequences.
- Subprocess runner testing Java MainCLI with assertions enabled (-ea).
- Tests both CLI arguments mode and interactive stdin mode.
- Identifies, logs, and classifies failures (repOK violations, crashes, timeouts).
"""

import argparse
import math
import os
import random
import re
import subprocess
import sys
import time
from typing import Dict, List, Optional, Tuple

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


BOARD_GRAMMAR: Dict[str, List[str]] = {
    "<start>": ["<board"],
    "<board>": ["<"]
}

BOARD_GRAMMAR_4X4: Dict[str, List[str]] = {
    "<start>": ["<board>"],
    "<board>": ["<open><row><close>"],
    "<open>": ["[", "[ ", " [ "],
    "<close>": ["]", " ]", " ] "],
    "<row>": ["<cell>,<cell>,<cell>,<cell>"],
    "<cell>": [
        "0", "0", "0", "0", "0", "0",  # Weighted towards 0 to have realistic boards
        "2", "2", "2", "2",
        "4", "4", "4",
        "8", "8",
        "16", "32", "64", "128", "256", "512", "1024", "2048", "4096"
    ],
}



BOARD_GRAMMAR_3X3: Dict[str, List[str]] = {
    "<start>": ["<board>"],
    "<board>": ["<open><row>,<row>,<row><close>"],
    "<open>": ["[", "[ "],
    "<close>": ["]", " ]"],
    "<row>": ["<cell>,<cell>,<cell>"],
    "<cell>": [
        "0", "0", "0", "0", "0",
        "2", "2", "2",
        "4", "4",
        "8", "16", "32", "64", "128", "256", "512"
    ],
}

BOARD_GRAMMAR_5X5: Dict[str, List[str]] = {
    "<start>": ["<board>"],
    "<board>": ["<open><row>,<row>,<row>,<row>,<row><close>"],
    "<open>": ["[", "[ "],
    "<close>": ["]", " ]"],
    "<row>": ["<cell>,<cell>,<cell>,<cell>,<cell>"],
    "<cell>": [
        "0", "0", "0", "0", "0", "0", "0",
        "2", "2", "2", "2",
        "4", "4", "4",
        "8", "8",
        "16", "32", "64", "128", "256", "512", "1024", "2048", "4096"
    ],
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
# Generator of Board Configurations & Move Sequences
# ---------------------------------------------------------------------------

class BoardGameGenerator:
    """
    Coordinates grammar fuzzers for different board dimensions and generates
    compatible winning values and random moves sequences.
    """

    def __init__(
        self,
        min_moves: int = 5,
        max_moves: int = 50,
        allowed_sizes: Optional[List[int]] = None
    ):
        self.min_moves = min_moves
        self.max_moves = max_moves
        self.allowed_sizes = allowed_sizes or [4, 3, 5]

        self.fuzzers = {
            3: GrammarFuzzer(BOARD_GRAMMAR_3X3),
            4: GrammarFuzzer(BOARD_GRAMMAR_4X4),
            5: GrammarFuzzer(BOARD_GRAMMAR_5X5),
        }

        # Compatible powers of two winning values satisfying validSize(size):
        # size^2 >= log2(winningValue)
        self.winning_values_by_size = {
            3: [2**k for k in range(4, 10)],    # 16 to 512 (log2 <= 9)
            4: [2**k for k in range(4, 17)],   # 16 to 65536 (log2 <= 16)
            5: [2**k for k in range(5, 26)],   # 32 to 33554432 (log2 <= 25)
        }

    def generate_trial(self) -> Tuple[int, str, int, List[str]]:
        """
        Generates a tuple (size, board_str, winning_value, moves).
        """
        size = random.choice(self.allowed_sizes)
        fuzzer = self.fuzzers[size]
        board_str = fuzzer.fuzz()

        winning_val = random.choice(self.winning_values_by_size[size])

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

    DEFAULT_COMMAND = ["java", "-ea", "-cp", "./target/classes", "ar.edu.unrc.game2048.MainCLI"]
    TIMEOUT = 10  # seconds per trial

    def __init__(self, command: Optional[List[str]] = None, timeout: int = 10):
        self.command = command or list(self.DEFAULT_COMMAND)
        self.timeout = timeout

    def run_args_mode(
        self,
        board_str: str,
        winning_value: int,
        moves: List[str]
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
        self,
        board_str: str,
        winning_value: int,
        moves: List[str]
    ) -> Tuple[Optional[subprocess.CompletedProcess], str, str]:
        """
        Executes MainCLI with no arguments (interactive stdin mode):
        Line 1: board_str
        Line 2: winning_value
        Following lines: moves + quit
        """
        cmd = list(self.command)
        stdin_input = f"{board_str}\n{winning_value}\n" + "\n".join(moves) + f"\n{QUIT}\n"

        return self._execute(cmd, stdin_input, mode_desc="stdin_mode")

    def _execute(
        self,
        cmd: List[str],
        stdin_input: str,
        mode_desc: str
    ) -> Tuple[Optional[subprocess.CompletedProcess], str, str]:
        try:
            result = subprocess.run(
                cmd,
                input=stdin_input,
                capture_output=True,
                text=True,
                timeout=self.timeout
            )
        except subprocess.TimeoutExpired as exc:
            return None, UNRESOLVED, f"Timeout after {self.timeout}s in {mode_desc}"
        except Exception as exc:
            return None, UNRESOLVED, f"Unexpected runner error: {exc}"

        # Classify outcome
        if result.returncode != 0:
            return result, FAIL, f"Non-zero exit code ({result.returncode})"
        if "Exception" in result.stderr or "Error" in result.stderr:
            return result, FAIL, f"Error/Exception detected in stderr"

        return result, PASS, "Clean execution"


# ---------------------------------------------------------------------------
# Main Campaign Runner
# ---------------------------------------------------------------------------

def run_fuzzing_campaign(
    trials: int = 500,
    min_moves: int = 5,
    max_moves: int = 40,
    report_every: int = 50
) -> Dict[str, any]:
    """
    Executes a fuzzing campaign of `trials` games and aggregates outcomes.
    """
    generator = BoardGameGenerator(min_moves=min_moves, max_moves=max_moves)
    runner = BoardCLIRunner()

    outcomes = {PASS: 0, FAIL: 0, UNRESOLVED: 0}
    failures: List[Dict[str, any]] = []

    print(f"==================================================")
    print(f" Starting Grammar-Based Fuzzing Campaign")
    print(f" Target : ar.edu.unrc.game2048.MainCLI (with -ea)")
    print(f" Trials : {trials}")
    print(f"==================================================\n")

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
            print(f"   Board: {board_str}")
            if proc and proc.stderr:
                print(f"   Stderr: {proc.stderr.strip()[:200]}")
        elif i % report_every == 0 or i == trials:
            elapsed = time.time() - t_start
            rate = i / elapsed if elapsed > 0 else 0
            print(f"⏳ [TRIAL {i:4d}/{trials}] Progress: PASS={outcomes[PASS]} FAIL={outcomes[FAIL]} ({rate:.1f} trials/s)")

    total_time = time.time() - t_start

    print("\n" + "=" * 50)
    print(" Fuzzing Campaign Summary")
    print("=" * 50)
    print(f" Total Trials : {trials}")
    print(f" PASS         : {outcomes[PASS]} ({outcomes[PASS]/trials*100:.1f}%)")
    print(f" FAIL         : {outcomes[FAIL]} ({outcomes[FAIL]/trials*100:.1f}%)")
    print(f" UNRESOLVED   : {outcomes[UNRESOLVED]} ({outcomes[UNRESOLVED]/trials*100:.1f}%)")
    print(f" Total Time   : {total_time:.2f}s")
    print("=" * 50)

    return {
        "trials": trials,
        "outcomes": outcomes,
        "failures": failures,
        "total_time": total_time,
    }


def main():
    parser = argparse.ArgumentParser(description="Grammar-based fuzzer for 2048 initial boards.")
    parser.add_argument("--trials", type=int, default=500, help="Number of fuzzing trials (default: 500)")
    parser.add_argument("--min-moves", type=int, default=5, help="Minimum moves per trial (default: 5)")
    parser.add_argument("--max-moves", type=int, default=40, help="Maximum moves per trial (default: 40)")
    args = parser.parse_args()

    results = run_fuzzing_campaign(
        trials=args.trials,
        min_moves=args.min_moves,
        max_moves=args.max_moves
    )

    if results["outcomes"][FAIL] > 0 or results["outcomes"][UNRESOLVED] > 0:
        sys.exit(1)
    sys.exit(0)


if __name__ == "__main__":
    main()
