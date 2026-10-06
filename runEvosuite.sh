#!/bin/bash
set -e # Detiene el script si algún paso falla

JAVA8_HOME="/usr/lib/jvm/java-8-openjdk"

if [ ! -d "$JAVA8_HOME" ]; then
    echo "Error: No se encontró Java 8 en $JAVA8_HOME"
    echo "Revisa la ruta con: ls -d /usr/lib/jvm/*8*"
    exit 1
fi

# Exportar variables globalmente
export JAVA_HOME="$JAVA8_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

ACTION="both"

# 1. Parsear los argumentos buscando los flags
while [[ "$#" -gt 0 ]]; do
    case $1 in
        --gen) ACTION="gen"; shift ;;
        --run) ACTION="run"; shift ;;
        -*) echo "Argumento desconocido: $1"; exit 1 ;;
        *) break ;; # A partir de aquí asumimos que son nombres de clases
    esac
done

# 2. Validar que se haya pasado al menos una clase si vamos a generar
if [[ ("$ACTION" == "gen" || "$ACTION" == "both") && "$#" -eq 0 ]]; then
    echo "Uso: $0 [--gen | --run] <Clase1> [Clase2 ... ClaseN]"
    echo "Tip: Para correr todos los tests existentes, usa: $0 --run"
    exit 1
fi

# 3. Fase de Generación (Descarga y Generación con el JAR)
if [[ "$ACTION" == "gen" || "$ACTION" == "both" ]]; then
    EVOSUITE_JAR="evosuite-1.0.6.jar"
    EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"
    SEARCH_BUDGET=120

    if [ ! -f "$EVOSUITE_JAR" ]; then
        echo "Descargando EvoSuite..."
        wget -O "$EVOSUITE_JAR" "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
    fi

    echo "Compilando proyecto..."
    mvn clean compile -Pevosuite

    CLASS_PATH="$(pwd)/target/classes"
fi

# 4. Caso especial: si se indicó --run y no se pasaron clases, correr TODO
if [ "$#" -eq 0 ] && [ "$ACTION" == "run" ]; then
    echo "Ejecutando TODOS los tests generados por EvoSuite..."
    rm -rf target/test-classes/*
    mvn clean test -Pevosuite
    exit 0
fi

# 5. Bucle por cada clase (aplica si hay clases específicas)
for TARGET_CLASS in "$@"; do
    echo "--------------------------------------------------------"

    if [[ "$ACTION" == "gen" || "$ACTION" == "both" ]]; then
        echo "Generando tests de EvoSuite para $TARGET_CLASS..."
        java -jar "$EVOSUITE_JAR" \
            -projectCP "$CLASS_PATH" \
            -class "$TARGET_CLASS" \
            -Dsearch_budget="$SEARCH_BUDGET" \
            -Dtest_dir=src/test/java
    fi

    if [[ "$ACTION" == "run" || "$ACTION" == "both" ]]; then
        echo "Ejecutando tests generados para ${TARGET_CLASS##*.}..."
        rm -rf target/test-classes/*
        mvn clean test -Pevosuite -Dtest="${TARGET_CLASS##*.}*ESTest"
    fi
done
