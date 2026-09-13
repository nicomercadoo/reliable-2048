#!/bin/bash

# 1. Validar que se haya pasado al menos una clase como argumento
if [[ "$#" -eq 0 ]]; then
    echo "Error: Debes proporcionar al menos una clase."
    echo "Uso: ./generar_tests.sh ar.edu.unrc.game2048.Cell ar.edu.unrc.game2048.Board"
    exit 1
fi

# 2. Iterar directamente sobre todos los argumentos recibidos ($@)
for clase in "$@"; do

    # Extraer el nombre corto (ej: "Cell")
    nombre_corto="${clase##*.}"

    # Nombres base
    nombre_regresion="${nombre_corto}RegressionTest"
    nombre_error="${nombre_corto}ErrorTest"

    echo "------------------------------------------------------------"
    echo "Generando tests para: $clase"
    echo "------------------------------------------------------------"

    java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
        --testclass="$clase" \
        --time-limit=10 \
        --junit-output-dir=src/test/java \
        --junit-package-name=randoopTests \
        --regression-test-basename="$nombre_regresion" \
        --error-test-basename="$nombre_error"

done

echo "------------------------------------------------------------"
echo "Generación de tests finalizada exitosamente."
