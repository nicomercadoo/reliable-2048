# Guía de Herramientas y Scripts

Este documento explica cómo utilizar las herramientas de testing automático, medición de cobertura (JaCoCo), mutation testing (PIT) e inferencia dinámica de invariantes (Daikon) configuradas en el proyecto, así como los scripts Bash que facilitan su ejecución.

---

## EvoSuite (Generación y Ejecución de Tests)

EvoSuite requiere de Java 8 para funcionar correctamente. Para simplificar este proceso y evitar conflictos con tu entorno de desarrollo en Java 21, dispones del script `runEvosuite.sh`.

### Uso del script `runEvosuite.sh`
Este script maneja automáticamente la descarga del JAR de EvoSuite, establece el entorno a Java 8 y gestiona la ejecución. Soporta *flags* para separar la generación de la ejecución.

**Generar tests para clases específicas:**
```bash
./runEvosuite.sh --gen ar.edu.unrc.game2048.Board ar.edu.unrc.game2048.Cell
```
*Nota: Esto compilará el proyecto y generará los tests dentro de `src/test/java` sin ejecutarlos.*

**Ejecutar los tests de EvoSuite para clases específicas:**
```bash
./runEvosuite.sh --run ar.edu.unrc.game2048.Board
```

**Ejecutar TODOS los tests de EvoSuite existentes:**
```bash
./runEvosuite.sh --run
```

**Generar Y Ejecutar (Comportamiento por defecto):**
```bash
./runEvosuite.sh ar.edu.unrc.game2048.Board
```

---

## Randoop (Generación de Tests)

Para la generación de tests aleatorios con Randoop, cuentas con el script `genRandoopTests.sh`.

### Uso del script `genRandoopTests.sh`
Acepta como parámetros las clases para las que deseas generar los tests.

```bash
./genRandoopTests.sh ar.edu.unrc.game2048.Board ar.edu.unrc.game2048.Cell
```
*Características:*
- Recompila el proyecto asegurando que Randoop analice el bytecode más reciente.
- Asigna dinámicamente un límite de tiempo (10 segundos por cada clase que pases como argumento).
- Los tests generados se colocarán bajo el paquete `randoopTests` en `src/test/java`.
- Lee las exclusiones de métodos desde `omit-methods.regex` si deseas ignorar métodos específicos.

---

## Daikon (Inferencia Dinámica de Invariantes)

Daikon es un detector dinámico de invariantes que observa la ejecución del programa y deduce automáticamente precondiciones, postcondiciones e invariantes de clase que se cumplen en todas las ejecuciones observadas.

Para simplificar la captura de trazas con **Chicory**, la inferencia con **Daikon** y el formateo de los invariantes a texto legible con **PrintInvariants**, dispones del script ejecutable `runDaikon.sh`.

### Uso del script `runDaikon.sh`

La sintaxis general acepta combinaciones de acciones y suites:
```bash
./runDaikon.sh [ACCIONES] [SUITES]
```

#### Acciones disponibles (Obligatorio: especificar al menos una)
- `--gen`: Genera las trazas de ejecución (`.dtrace.gz`) instrumentando los tests con Daikon Chicory.
- `--infer`: Procesa las trazas con Daikon para inferir los invariantes en formato binario (`.inv.gz`).
- `--dump [<archivo>]`: Vuelca los invariantes a un archivo de texto legible utilizando `PrintInvariants` (por defecto `daikon-output.txt` o `daikon-output-<suite>.txt`).

#### Suites / Objetivos
- `--manual`: Aplica sobre los tests unitarios manuales (`CellTest`, `BoardTest`).
- `--randoop`: Aplica sobre los tests de regresión generados por Randoop (`RegressionTest`).
- `--evosuite`: Aplica sobre los tests generados por EvoSuite (`Cell_ESTest`, `Board_ESTest`).
- `--combined`: Aplica sobre la traza combinada de todas las suites (`daikon-traces/output.inv.gz`).
- `--all`: Aplica sobre todas las suites disponibles (comportamiento por defecto en `--gen`).

---

### Ejemplos de Uso de `runDaikon.sh`

**1. Generar trazas de ejecución (`--gen`):**
```bash
# Generar trazas para todas las suites (manual, randoop y evosuite):
./runDaikon.sh --gen --all

# Generar traza únicamente para una suite específica:
./runDaikon.sh --gen --manual      # Salida: daikon-traces/manual.dtrace.gz
./runDaikon.sh --gen --randoop     # Salida: daikon-traces/randoop.dtrace.gz
./runDaikon.sh --gen --evosuite    # Salida: daikon-traces/evosuite.dtrace.gz
```

**2. Inferir invariantes (`--infer`):**
```bash
# Inferir invariantes combinando todas las trazas existentes:
./runDaikon.sh --infer             # Salida: daikon-traces/output.inv.gz

# Inferir invariantes para una suite particular:
./runDaikon.sh --infer --manual    # Salida: daikon-traces/manual.inv.gz
./runDaikon.sh --infer --randoop   # Salida: daikon-traces/randoop.inv.gz
./runDaikon.sh --infer --evosuite  # Salida: daikon-traces/evosuite.inv.gz

# Inferir individualmente para cada suite y además la combinada:
./runDaikon.sh --infer --all
```

**3. Volcar invariantes a texto legible (`--dump`):**
```bash
# Volcar los invariantes combinados al archivo por defecto (daikon-output.txt):
./runDaikon.sh --dump

# Volcar los invariantes a un archivo de texto personalizado:
./runDaikon.sh --dump mis-invariantes.txt

# Volcar los invariantes de una suite en específico:
./runDaikon.sh --dump --manual               # Salida: daikon-output-manual.txt
./runDaikon.sh --dump salida.txt --manual    # Salida: salida.txt
```

**4. Ejecución en Pipeline (flujo completo):**
```bash
# Generar traza, inferir invariantes y volcarlos a texto en un solo comando:
./runDaikon.sh --gen --infer --dump --manual

# Pipeline completo combinando todas las suites:
./runDaikon.sh --gen --infer --dump
```

---

### Inspección y Comentarios Interactivos con `daikon_analysis_utility.py` (`dau.py`)

CLI interactiva para navegar, clasificar y añadir comentarios sobre cada invariante, precondición o postcondición generada por Daikon.
- **Acceso rápido**: Puede ejecutarse como `./daikon_analysis_utility.py` o mediante su alias corto `./dau.py`.
- **Sincronización dual**: Los comentarios se guardan al final de la línea en `daikon-output.txt` con el formato `# comentario` (preservando el número exacto de línea y generando un `.bak` de resguardo) y se exportan por defecto a un reporte Markdown enriquecido (`daikon-output.md`).
- **Enlaces directos a líneas**: Cada línea y propiedad en el reporte `.md` es un enlace clickeable que apunta a su línea exacta en el archivo de texto (por ejemplo `daikon-output.txt#L111`).
- **Resolución de discrepancias / conflictos**: Si al iniciar la herramienta se detectan diferencias entre los comentarios presentes en el archivo `.txt` y en el archivo `.md`, la CLI alerta al usuario y le pregunta cuál archivo tiene preferencia (o mediante la opción `--prefer md` / `--prefer txt`).

```bash
# Iniciar la interfaz interactiva (lee daikon-output.txt y guarda en daikon-output.md):
./daikon_analysis_utility.py       # o: ./dau.py

# Iniciar sobre un archivo específico y/o exportar a otro destino:
./daikon_analysis_utility.py daikon-output-manual.txt -o mi-reporte.md

# Exportar el reporte Markdown sin entrar a la TUI:
./daikon_analysis_utility.py --export-md

# Ver estadísticas de progreso de comentarios:
./daikon_analysis_utility.py --stats

# Exportar todas las propiedades y comentarios a JSON:
./daikon_analysis_utility.py --export-json daikon-data.json
```

**Modo Vim y Controles en la CLI:**

La interfaz interactiva opera con una máquina modal inspirada en Vim:

1. **Modo NORMAL (`NORMAL`)**:
   - `j` / `k` (o `DOWN` / `UP`): Moverse al invariante siguiente / anterior.
   - `h` / `l` (o `[` / `]` o `PgUp` / `PgDn`): Moverse al scope (clase o método) anterior / siguiente.
   - `gg`: Saltar al primer invariante del scope actual.
   - `G`: Saltar al último invariante del scope actual.
   - `1` .. `5`: **Clasificación instantánea con una sola tecla** (clasifica el invariante y avanza automáticamente al siguiente):
     - `1`: `Correct and useful`
     - `2`: `Correct but trivial`
     - `3`: `Too strong / likely spurious`
     - `4`: `Incorrect`
     - `5`: `Precondition violation / Unreachable`
   - `p` (o `Ctrl+P` / `Ctrl+U`): Saltar a la siguiente propiedad **p**endiente (sin comentar).
   - `P`: Saltar a la propiedad pendiente anterior.
   - `x` o `dd`: Borrar el comentario de la propiedad seleccionada.
   - `u`: **Deshacer** (*undo*) la última modificación o borrado de comentario.
   - `r` (o `Ctrl+R`): **Rehacer** (*redo*) la última modificación deshecha.
   - `i` o `Enter`: Entrar en modo **INSERT** para editar el comentario.
   - `a`: Entrar en modo **INSERT** al final del texto actual.
   - `c` o `o`: Limpiar comentario anterior y entrar en modo **INSERT**.
   - `:`: Entrar en modo **COMMAND** (línea de comandos).
   - `/` (o `Ctrl+F`): Entrar en modo **SEARCH** (búsqueda).

2. **Modo Edición (`INSERT`)**:
   - Escritura de texto para el comentario de la propiedad seleccionada.
   - Atajos de autoexpansión inline: tipear `:1`..`:5` o `:us`, `:tr`, `:sp`, `:inc`, `:un` se expande instantáneamente al texto de la clasificación.
   - `ENTER`: Guardar comentario actual en `.txt` y `.md`, y avanzar al siguiente invariante (manteniéndose en modo `INSERT` para permitir comentar en ráfaga).
   - `SHIFT+ENTER` (o `Alt+Enter`): Insertar salto de línea dentro del comentario.
   - `ESC`: Volver a modo **NORMAL**.

3. **Modo Comandos (`COMMAND`, `:`)**:
   - `:w`: Guardar cambios sincronizados en `daikon-output.txt` y `daikon-output.md`.
   - `:w <archivo>`: Guardar en un archivo alternativo.
   - `:q`: Salir de la CLI.
   - `:wq` o `:x`: Guardar y salir.
   - `:q!`: Salir descartando cambios pendientes en memoria.
   - `:<NUM>` (ej: `:120`): Saltar directamente a la línea `<NUM>` en `daikon-output.txt`.
   - `:1` .. `:5` o `:us` .. `:un`: Clasificar el invariante actual y avanzar.
   - `:undo` / `:redo`: Deshacer y rehacer cambios desde la barra de comandos.
   - `:stats`: Ver resumen de progreso y estadísticas.
   - `ESC`: Cancelar comando y volver a modo **NORMAL**.

4. **Modo Búsqueda (`SEARCH`, `/`)**:
   - `/` seguido del término de búsqueda o número de línea.
   - `j` / `k` (o `DOWN` / `UP`): Navegar entre los resultados coincidentes.
   - `ENTER`: Saltar al invariante seleccionado y volver a modo **NORMAL**.
   - `ESC`: Cancelar búsqueda y volver a modo **NORMAL**.


---

## Ejecución de Tests con Maven (Surefire)

El proyecto utiliza **Maven Surefire** configurado en distintos perfiles (*profiles*) para no cruzar dependencias.

**Correr Tests Manuales y de Randoop (Modo Desarrollo en Java 21):**
```bash
mvn clean test
```
*En este modo, los tests de EvoSuite son ignorados automáticamente para no causar errores de compilación/ejecución con Java 21.*

**Correr Tests de EvoSuite manualmente:**
Asegúrate de correrlo con Java 8. El perfil de Maven se encargará del resto:
```bash
JAVA_HOME=/usr/lib/jvm/java-8-openjdk mvn clean test -Pevosuite
```

---

## Análisis de Cobertura (JaCoCo)

JaCoCo está configurado en el ciclo de vida por defecto de Maven. Al correr tus tests, JaCoCo instrumentará el código para medir qué líneas y ramas han sido ejecutadas.

**Generar el reporte de cobertura (Tests generales):**
```bash
mvn clean test jacoco:report
```
*El reporte en formato HTML se generará en `target/site/jacoco/index.html`.*

**Generar reporte solo para los tests de Randoop:**
Puedes usar el perfil específico de Randoop, el cual configurará JaCoCo para enfocarse solo en esos tests:
```bash
mvn clean test -Prandoop_coverage
```

---

## Mutation Testing (PIT)

PIT realiza testing de mutaciones, alterando el código fuente para comprobar si los tests existentes son capaces de detectar (matar) dichas mutaciones.

**Correr PIT en todos los tests soportados:**
```bash
mvn pitest:mutationCoverage
```
*El reporte se generará en `target/pit-reports/index.html`.*

**Correr PIT exclusivamente con tests de Randoop:**
```bash
mvn verify -Prandoop_coverage
```
*Este comando ejecuta la fase `verify` que invoca a PIT únicamente evaluando el comportamiento de las clases bajo los `RegressionTest` de Randoop.*
