## Comandos

### Automatización Integral con `runDaikon.sh`

El script `runDaikon.sh` unifica y automatiza el ciclo de vida completo de análisis dinámico con Daikon:

1. **Generación de trazas (`--gen`)**: Ejecuta suites de pruebas bajo Chicory para generar archivos `.dtrace.gz`.
2. **Inferencia de invariantes (`--infer`)**: Ejecuta Daikon sobre las trazas generadas para obtener modelos `.inv.gz`.
3. **Volcado a texto legible (`--dump [<archivo>]`)**: Extrae los invariantes con `daikon.PrintInvariants` hacia un archivo de texto.

```bash
./runDaikon.sh [ACCIONES] [SUITES]
```

#### Opciones de Acción (Obligatorio: especificar al menos una)

- `--gen`: Genera trazas de ejecución (`.dtrace.gz`).
- `--infer`: Infiere invariantes a partir de las trazas (`.inv.gz`).
- `--dump [<archivo>]`: Vuelca invariantes legibles a un archivo de texto (por defecto `daikon-output.txt` o `daikon-output-<suite>.txt`).

#### Opciones de Suite / Objetivo

- `--manual`: Aplica sobre tests manuales (`CellTest`, `BoardTest`).
- `--randoop`: Aplica sobre tests de Randoop (`RegressionTest`).
- `--evosuite`: Aplica sobre tests de EvoSuite (`Cell_ESTest`, `Board_ESTest`).
- `--combined`: Aplica sobre la traza combinada (`daikon-traces/output.inv.gz`).
- `--all`: Aplica sobre todas las suites disponibles (por defecto en `--gen`).

---

### Ejemplos de Uso

#### 1. Generación de Trazas (`--gen`)

```bash
# Generar todas las trazas por separado de forma secuencial
./runDaikon.sh --gen --all

# Generar traza únicamente para tests manuales (daikon-traces/manual.dtrace.gz)
./runDaikon.sh --gen --manual

# Generar traza únicamente para Randoop (daikon-traces/randoop.dtrace.gz)
./runDaikon.sh --gen --randoop

# Generar traza únicamente para EvoSuite (daikon-traces/evosuite.dtrace.gz)
./runDaikon.sh --gen --evosuite
```

#### 2. Inferencia de Invariantes (`--infer`)

```bash
# Inferir combinando todas las trazas existentes (daikon-traces/output.inv.gz)
./runDaikon.sh --infer

# Inferir invariantes para una suite específica
./runDaikon.sh --infer --manual      # Salida: daikon-traces/manual.inv.gz
./runDaikon.sh --infer --randoop     # Salida: daikon-traces/randoop.inv.gz
./runDaikon.sh --infer --evosuite    # Salida: daikon-traces/evosuite.inv.gz

# Inferir individualmente para cada suite y además la combinada
./runDaikon.sh --infer --all
```

#### 3. Volcado de Invariantes a Texto (`--dump`)

```bash
# Volcar invariantes combinados a daikon-output.txt por defecto
./runDaikon.sh --dump

# Volcar invariantes combinados a un archivo específico
./runDaikon.sh --dump mis-invariantes.txt

# Volcar invariantes de una suite particular
./runDaikon.sh --dump --manual               # Salida: daikon-output-manual.txt
./runDaikon.sh --dump salida.txt --manual    # Salida: salida.txt
```

#### 4. Ejecución en Cadena (Pipeline)

```bash
# Generar trazas, inferir y volcar invariantes en un solo paso para tests manuales
./runDaikon.sh --gen --infer --dump --manual

# Pipeline completo para todas las trazas combinadas
./runDaikon.sh --gen --infer --dump
```

---

### Comandos Individuales Subyacentes

#### 1. Generación con Chicory

- **Tests Manuales**:
  ```bash
  java -cp "lib/daikon.jar:lib/randoop-all-4.3.4.jar:evosuite-1.0.6.jar:target/classes:target/test-classes:$(mvn dependency:build-classpath -q -DforceStdout)" \
    daikon.Chicory \
    --ppt-select-pattern="ar\.edu\.unrc\.game2048\.(Board|Cell|MockRNG|MathUtils)(\.|\:\:)" \
    --ppt-omit-pattern=".*Test.*" \
    --output-dir=daikon-traces \
    --dtrace-file=manual.dtrace.gz \
    org.junit.runner.JUnitCore \
    ar.edu.unrc.game2048.CellTest ar.edu.unrc.game2048.BoardTest
  ```
- **Tests de Randoop**:
  ```bash
  java -cp "lib/daikon.jar:lib/randoop-all-4.3.4.jar:evosuite-1.0.6.jar:target/classes:target/test-classes:$(mvn dependency:build-classpath -q -DforceStdout)" \
    daikon.Chicory \
    --ppt-select-pattern="ar\.edu\.unrc\.game2048\.(Board|Cell|MockRNG|MathUtils)(\.|\:\:)" \
    --ppt-omit-pattern=".*Test.*" \
    --output-dir=daikon-traces \
    --dtrace-file=randoop.dtrace.gz \
    org.junit.runner.JUnitCore \
    randoopTests.RegressionTest
  ```
- **Tests de EvoSuite**:

  ```bash
  JDK_JAVA_OPTIONS="-Djava.security.manager=allow --add-opens java.desktop/java.awt=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.net=ALL-UNNAMED --add-exports java.base/sun.net.util=ALL-UNNAMED" \
  java -cp "lib/daikon.jar:lib/randoop-all-4.3.4.jar:evosuite-1.0.6.jar:target/classes:target/test-classes:$(mvn dependency:build-classpath -q -DforceStdout)" \
    daikon.Chicory \
    --ppt-select-pattern="ar\.edu\.unrc\.game2048\.(Board|Cell|MockRNG|MathUtils)(\.|\:\:)" \
    --ppt-omit-pattern=".*Test.*" \
    --output-dir=daikon-traces \
    --dtrace-file=evosuite.dtrace.gz \
    ar.edu.unrc.game2048.EvoSuiteTestRunner
  ```

- **Tests de Fuzzer**
  ```bash
  python daikon_fuzzer.py
  ```

#### 2. Inferencia con Daikon

- **Combinada**:
  ```bash
  java -Xmx4g -cp lib/daikon.jar daikon.Daikon \
       -o daikon-traces/output.inv.gz \
       daikon-traces/*.dtrace.gz \
       daikon-traces/fuzzer_runs/*.dtrace.gz
  ```
- **Específica (ej. manual)**:
  ```bash
  java -Xmx4g -cp lib/daikon.jar daikon.Daikon \
       -o daikon-traces/manual.inv.gz \
       daikon-traces/manual.dtrace.gz
  ```

#### 3. Volcado con PrintInvariants

```bash
java -cp lib/daikon.jar daikon.PrintInvariants daikon-traces/output.inv.gz > daikon-output.txt
```
