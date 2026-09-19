#!/bin/bash

omit_method_file="omit-methods.regex"

# 1. Validar que se haya pasado al menos una clase como argumento[cite: 2]
if [[ "$#" -eq 0 ]]; then
    echo "Error: Debes proporcionar al menos una clase."
    echo "Uso: ./generar_tests.sh ar.edu.unrc.game2048.Cell ar.edu.unrc.game2048.Board"
    exit 1
fi


# 2. Re compilar el proyecto con Maven antes de generar los tests
echo ""
echo "------------------------------------------------------------"
echo "  Recompilando el proyecto con Maven..."
echo "------------------------------------------------------------"

mvn clean compile

if [[ $? -ne 0 ]]; then
    echo ""
    echo "-------------------------------------------------------------"
    echo "Error: La compilación de Maven falló. Asegúrate de que el proyecto compile correctamente antes de generar tests."
    echo "-------------------------------------------------------------"
    exit 1
fi

# 3. Acumular las clases en una variable para pasarlas juntas a Randoop
TESTCLASSES=""
for clase in "$@"; do
    TESTCLASSES="$TESTCLASSES --testclass=$clase"
done

# Calcular el límite de tiempo total (10 segundos por cada clase recibida)
TIEMPO_TOTAL=$(( 10 * $# ))

echo ""
echo "------------------------------------------------------------"
echo "  Generando tests para $# clases... ($TIEMPO_TOTAL segundos)"
echo "------------------------------------------------------------"

# 4. Ejecutar Randoop UNA sola vez fuera del bucle
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
    $TESTCLASSES \
    --time-limit=$TIEMPO_TOTAL \
    --junit-output-dir=src/test/java \
    --junit-package-name=randoopTests \
    --regression-test-basename="RegressionTest" \
    --error-test-basename="ErrorTest" \
    --omit-methods-file="$omit_method_file"

if [ $? -ne 0 ]; then
    echo ""
    echo "------------------------------------------------------------"
    echo "Error: La generación de tests con Randoop falló."
    echo "------------------------------------------------------------"
    exit 1
else
    echo ""
    echo "------------------------------------------------------------"
    echo "  Generación de tests completada para $# clases."
    echo "------------------------------------------------------------"
fi
