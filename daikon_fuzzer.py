#!/usr/bin/env python3
import os
import subprocess
import time

import fuzzer

TRIALS = 50  # 30 partidas dan miles de puntos de programa sin demorar horas
TRACES_DIR = "daikon-traces/fuzzer_runs"
os.makedirs(TRACES_DIR, exist_ok=True)

# 1. Configurar el fuzzer con los rangos válidos para repOK()
rf = fuzzer.RandomFuzzer(
    min_length=20,
    max_length=100,
    min_size=3,
    max_size=5,
    min_winning_value=256,
    max_winning_value=4096,
)

print(f"[*] Iniciando campaña de fuzzing en Python: {TRIALS} partidas.")
print(f"[*] Guardando trazas intermedias en: {TRACES_DIR}/")

start_all = time.time()
successful_traces = []

for i in range(TRIALS):
    trace_file = os.path.join(TRACES_DIR, f"run_{i:03d}.dtrace.gz")

    # Si la traza ya existe de una corrida previa, la removemos
    if os.path.exists(trace_file):
        os.remove(trace_file)

    cmd = [
        "java",
        "-cp",
        "lib/daikon.jar:target/classes",
        "daikon.Chicory",
        f"--dtrace-file={trace_file}",
        "--ppt-select-pattern=ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell|ar.edu.unrc.game2048.MockRNG|ar.edu.unrc.game2048.MathUtils",
        "--ppt-omit-pattern=.*Test.*",
        "ar.edu.unrc.game2048.MainCLI",
    ]

    inp = rf.fuzz()
    t0 = time.time()

    proc = subprocess.run(cmd, input=inp, text=True, capture_output=True)
    elapsed = time.time() - t0

    if os.path.exists(trace_file) and os.path.getsize(trace_file) > 0:
        successful_traces.append(trace_file)
        print(
            f"  [+] Partida {i + 1:02d}/{TRIALS:02d} completada en {elapsed:.1f}s | Traza: {os.path.getsize(trace_file) // 1024} KB",
            flush=True,
        )
    else:
        print(
            f"  [-] Partida {i + 1:02d}/{TRIALS:02d} falló o no generó traza (exit code: {proc.returncode})",
            flush=True,
        )

total_elapsed = time.time() - start_all
print(f"\n[*] Campaña finalizada en {total_elapsed:.1f}s.")
print(f"[*] Se generaron {len(successful_traces)} trazas válidas.")
