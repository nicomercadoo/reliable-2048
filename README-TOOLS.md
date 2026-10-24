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
