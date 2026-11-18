"""
Fuzzer for the Reliable 2048 CLI.

Structure follows the Fuzzing Book (Zeller et al.):
  https://www.fuzzingbook.org/

A Fuzzer generates inputs; a Runner executes the program under test and
classifies the outcome.  The two are kept separate so that different fuzzers
can be combined with the same runner, and vice-versa.
"""

import math
import random
import subprocess
from typing import Tuple

# ---------------------------------------------------------------------------
# Outcome constants  (mirrors the Fuzzing Book convention)
# ---------------------------------------------------------------------------

PASS = "PASS"       # program exited normally, no errors reported
FAIL = "FAIL"       # program signalled a bug (non-zero exit, assertion error)
UNRESOLVED = "UNRESOLVED"  # e.g. timeout or unexpected error in the runner

# ---------------------------------------------------------------------------
# Valid input alphabet
# ---------------------------------------------------------------------------

KEYS = ['a', 's', 'w', 'd']   # left, down, up, right
QUIT = 'q'                     # graceful exit

# ---------------------------------------------------------------------------
# Runner
# ---------------------------------------------------------------------------

class Runner:
    """Runs the program under test and returns (output, outcome)."""

    def run(self, inp: str) -> Tuple[subprocess.CompletedProcess, str]:
        raise NotImplementedError


class CLIRunner(Runner):
    """
    Runs the 2048 CLI as a subprocess, feeding `inp` to its stdin.

    Returns a (CompletedProcess, outcome) pair where outcome is one of
    PASS, FAIL, or UNRESOLVED.
    """

    COMMAND = ['java', '-ea', '-cp', './target/classes', 'ar.edu.unrc.game2048.MainCLI']
    TIMEOUT = 10  # seconds

    def run(self, inp: str) -> Tuple[subprocess.CompletedProcess, str]:
        try:
            result = subprocess.run(
                self.COMMAND,
                input=inp,
                capture_output=True,
                text=True,
                timeout=self.TIMEOUT
            )
        except subprocess.TimeoutExpired:
            return None, UNRESOLVED

        if result.returncode != 0 or result.stderr:
            return result, FAIL

        return result, PASS


# ---------------------------------------------------------------------------
# Fuzzer base class
# ---------------------------------------------------------------------------

class Fuzzer:
    """Base class: subclasses implement fuzz() to produce one input string."""

    def fuzz(self) -> str:
        """Return a single fuzzed input string."""
        raise NotImplementedError

    def run(self, runner: Runner) -> Tuple[subprocess.CompletedProcess, str]:
        """Fuzz once and run the result through *runner*."""
        return runner.run(self.fuzz())

    def runs(self, runner: Runner, trials: int = 10):
        """Fuzz *trials* times and return a list of (result, outcome) pairs."""
        return [self.run(runner) for _ in range(trials)]


# ---------------------------------------------------------------------------
# RandomFuzzer
# ---------------------------------------------------------------------------

class RandomFuzzer(Fuzzer):
    """
    Generates valid board configurations respecting repOK() and a sequence
    of random game moves followed by a quit command.

    Parameters
    ----------
    min_length : int
        Minimum number of move keys in the sequence.
    max_length : int
        Maximum number of move keys in the sequence.
    min_size : int
        Minimum board size (must be >= 1).
    max_size : int
        Maximum board size.
    min_winning_value : int
        Minimum winning value (must be >= 2).
    max_winning_value : int
        Maximum winning value.
    """

    def __init__(
        self,
        min_length: int = 10,
        max_length: int = 50,
        min_size: int = 3,
        max_size: int = 6,
        min_winning_value: int = 128,
        max_winning_value: int = 2048
    ):
        self.min_length = min_length
        self.max_length = max_length
        self.min_size = max(1, min_size)
        self.max_size = max(self.min_size, max_size)
        self.min_winning_value = max(2, min_winning_value)
        self.max_winning_value = max(self.min_winning_value, max_winning_value)

        # Generar las potencias de 2 disponibles en el rango [min_winning_value, max_winning_value]
        min_exp = max(1, math.ceil(math.log2(self.min_winning_value)))
        max_exp = max(min_exp, math.floor(math.log2(self.max_winning_value)))
        self.valid_winning_values = [2 ** k for k in range(min_exp, max_exp + 1)]

    def _generate_valid_config(self) -> Tuple[int, int]:
        """
        Selecciona un winning_value y un size que satisfacen repOK():
        - winning_value > 0 y potencia de 2
        - size > 0
        - size^2 >= log2(winning_value)
        """
        # Filtramos qué winning_values son compatibles con max_size
        compatible_targets = [
            val for val in self.valid_winning_values
            if math.ceil(math.sqrt(math.log2(val))) <= self.max_size
        ]

        if not compatible_targets:
            raise ValueError(
                f"No es posible cumplir validSize: max_size={self.max_size} no alcanza "
                f"para la meta mínima ({self.valid_winning_values[0]}). Aumenta max_size o baja min_winning_value."
            )

        winning_val = random.choice(compatible_targets)
        min_allowed_size = max(self.min_size, math.ceil(math.sqrt(math.log2(winning_val))))
        size = random.randint(min_allowed_size, self.max_size)

        return size, winning_val

    def fuzz(self) -> str:
        """
        Devuelve el input completo para el CLI:
        size -> winningValue -> movimientos -> quit.
        """
        size, winning_value = self._generate_valid_config()
        moves = random.choices(KEYS, k=random.randint(self.min_length, self.max_length))

        output = f"{size}\n{winning_value}\n" + "\n".join(moves) + f"\n{QUIT}\n"
        return output


# ---------------------------------------------------------------------------
# Main: run the fuzzer and report results
# ---------------------------------------------------------------------------

def main():
    runner = CLIRunner()
    fuzzer = RandomFuzzer(
        min_length=10,
        max_length=50,
        min_size=3,
        max_size=6,
        min_winning_value=128,
        max_winning_value=2048
    )

    trials = 20
    outcomes = {PASS: 0, FAIL: 0, UNRESOLVED: 0}

    print(f"Running {trials} fuzzing trials...\n")

    for i in range(trials):
        inp = fuzzer.fuzz()
        result, outcome = runner.run(inp)

        outcomes[outcome] += 1

        print(f"--- Trial {i + 1:>3} | {outcome} ---")
        print(f"Input : {inp.replace(chr(10), ' ').strip()}")

        if result is not None:
            print(f"Exit  : {result.returncode}")
            if result.stdout:
                print(f"Output: {result.stdout.strip()}")
            if result.stderr:
                print(f"Stderr: {result.stderr.strip()}")

        print()

    print("=" * 50)
    print("Summary:")
    for outcome, count in outcomes.items():
        print(f"  {outcome:<12}: {count}/{trials}")


if __name__ == "__main__":
    main()
