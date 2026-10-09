# Guía de Herramientas y Scripts

Este documento explica cómo utilizar las herramientas de testing automático, medición de cobertura (JaCoCo) y mutation testing (PIT) configuradas en el proyecto, así como los scripts Bash que facilitan su ejecución.

---

## EvoSuite (Generación y Ejecución de Tests)

EvoSuite requiere de Java 8 para funcionar correctamente. Para simplificar este proceso y evitar conflictos con tu entorno de desarrollo en Java 21, dispones del script `runEvosuite.sh`.

### Uso del script `runEvosuite.sh`
Este script maneja automáticamente la descarga del JAR de EvoSuite, establece el entorno a Java 8 y gestiona la ejecución. Soporta *flags* para separar la generación de la ejecución.

 **Generar tests para clases específicas:**
```bash
./runEvosuite.sh --gen ar.edu.unrc.game2048.{Board,Cell}
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
./genRandoopTests.sh ar.edu.unrc.game2048.{Board,Cell}
```
*Características:*
- Recompila el proyecto asegurando que Randoop analice el bytecode más reciente.
- Asigna dinámicamente un límite de tiempo (10 segundos por cada clase que pases como argumento).
- Los tests generados se colocarán bajo el paquete `randoopTests` en `src/test/java`.
- Lee las exclusiones de métodos desde `omit-methods.regex` si deseas ignorar métodos específicos.

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
