set -e # Detiene el script si algún paso falla

JAVA8_HOME="/usr/lib/jvm/java-8-openjdk"

if [ ! -d "$JAVA8_HOME" ]; then
    echo "Error: No se encontró Java 8 en $JAVA8_HOME"
    echo "Revisa la ruta con: ls -d /usr/lib/jvm/*8*"
    exit 1
fi

# Validar que se haya pasado al menos una clase
if [ "$#" -eq 0 ]; then
    echo "Uso: $0 <Clase1> [Clase2 ... ClaseN]"
    exit 1
fi

EVOSUITE_JAR="evosuite-1.0.6.jar"
EVOSUITE_URL="https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar"
SEARCH_BUDGET=60

if [ ! -f "$EVOSUITE_JAR" ]; then
    echo "Descargando EvoSuite..."
    wget -O "$EVOSUITE_JAR" "$EVOSUITE_URL" || curl -L -o "$EVOSUITE_JAR" "$EVOSUITE_URL"
fi

echo "Compilando proyecto..."
JAVA_HOME="$JAVA8_HOME" mvn clean compile -Dmaven.compiler.source=1.8 -Dmaven.compiler.target=1.8

CLASS_PATH="$(pwd)/target/classes"

# Iterar sobre todas las clases pasadas por parámetro
for TARGET_CLASS in "$@"; do
    echo "--------------------------------------------------------"
    echo "Generando tests de EvoSuite para $TARGET_CLASS..."
    "$JAVA8_HOME/bin/java" -jar "$EVOSUITE_JAR" \
        -projectCP "$CLASS_PATH" \
        -class "$TARGET_CLASS" \
        -Dsearch_budget="$SEARCH_BUDGET" \
        -Dtest_dir=src/test/java

    echo "Ejecutando tests generados para ${TARGET_CLASS##*.}..."
    JAVA_HOME="$JAVA8_HOME" mvn test -Pevosuite -Dtest="${TARGET_CLASS##*.}*ESTest"
done
