#!/bin/bash
set -e

# ==============================================================================
# Script: runDaikon.sh
# Descripción: Automatiza el ciclo de vida de Daikon para Reliable 2048:
#              1. Generación de trazas (.dtrace.gz) con Chicory (--gen)
#              2. Inferencia de invariantes (.inv.gz) con Daikon (--infer)
#              3. Volcado de invariantes legibles a texto (--dump [<archivo>])
# Sintaxis: ./runDaikon.sh [--gen | --infer | --dump [<archivo>]] [--manual | --randoop | --evosuite | --combined | --all]
# ==============================================================================

DAIKON_JAR="lib/daikon.jar"
RANDOOP_JAR="lib/randoop-all-4.3.4.jar"
EVOSUITE_JAR="evosuite-1.0.6.jar"
OUTPUT_DIR="daikon-traces"

usage() {
    local exit_code="${1:-1}"
    echo "Uso: $0 [ACCIONES] [SUITES]"
    echo ""
    echo "Acciones:"
    echo "  --gen                 Genera trazas de ejecución (.dtrace.gz) con Chicory"
    echo "  --infer               Infiere invariantes (.inv.gz) con Daikon a partir de las trazas"
    echo "  --dump [<archivo>]    Vuelca los invariantes legibles a un archivo de texto"
    echo "                        (Por defecto: daikon-output.txt o daikon-output-<suite>.txt)"
    echo ""
    echo "Suites / Objetivos:"
    echo "  --manual              Aplica sobre tests manuales (CellTest, BoardTest)"
    echo "  --randoop             Aplica sobre tests de Randoop"
    echo "  --evosuite            Aplica sobre tests de EvoSuite"
    echo "  --combined            Aplica sobre la traza combinada (daikon-traces/output.inv.gz)"
    echo "  --all                 Aplica sobre todas las suites disponibles"
    echo "  -h, --help            Muestra este mensaje de ayuda"
    echo ""
    echo "Ejemplos:"
    echo "  $0 --gen --manual                  # Genera traza de tests manuales"
    echo "  $0 --gen --all                     # Genera trazas de todas las suites"
    echo "  $0 --infer --manual                # Infiere invariantes de tests manuales"
    echo "  $0 --infer                         # Infiere invariantes combinando todas las trazas"
    echo "  $0 --dump                          # Vuelca invariantes combinados a daikon-output.txt"
    echo "  $0 --dump salida.txt --manual      # Vuelca invariantes manuales a salida.txt"
    echo "  $0 --gen --infer --dump            # Ejecuta el flujo completo: generar, inferir y volcar"
    exit "$exit_code"
}

if [ "$#" -eq 0 ]; then
    usage
fi

if [ ! -f "$DAIKON_JAR" ]; then
    echo "Error: No se encontró Daikon en $DAIKON_JAR"
    exit 1
fi

# Variables de control
ACTION_GEN=false
ACTION_INFER=false
ACTION_DUMP=false
DUMP_FILE=""

TARGET_MANUAL=false
TARGET_RANDOOP=false
TARGET_EVOSUITE=false
TARGET_COMBINED=false
TARGET_ALL=false

TARGET_COUNT=0
ACTION_COUNT=0

# Parsear argumentos
while [[ "$#" -gt 0 ]]; do
    case "$1" in
        --gen)
            ACTION_GEN=true
            ACTION_COUNT=$((ACTION_COUNT + 1))
            shift
            ;;
        --infer)
            ACTION_INFER=true
            ACTION_COUNT=$((ACTION_COUNT + 1))
            shift
            ;;
        --dump)
            ACTION_DUMP=true
            ACTION_COUNT=$((ACTION_COUNT + 1))
            shift
            # Capturar archivo opcional si el siguiente argumento no es una opción
            if [[ "$#" -gt 0 && "$1" != -* ]]; then
                DUMP_FILE="$1"
                shift
            fi
            ;;
        --manual)
            TARGET_MANUAL=true
            TARGET_COUNT=$((TARGET_COUNT + 1))
            shift
            ;;
        --randoop)
            TARGET_RANDOOP=true
            TARGET_COUNT=$((TARGET_COUNT + 1))
            shift
            ;;
        --evosuite)
            TARGET_EVOSUITE=true
            TARGET_COUNT=$((TARGET_COUNT + 1))
            shift
            ;;
        --combined)
            TARGET_COMBINED=true
            TARGET_COUNT=$((TARGET_COUNT + 1))
            shift
            ;;
        --all)
            TARGET_ALL=true
            TARGET_COUNT=$((TARGET_COUNT + 1))
            shift
            ;;
        -h|--help)
            usage 0
            ;;
        *)
            echo "Error: Argumento desconocido: $1"
            echo ""
            usage
            ;;
    esac
done

# Compatibilidad hacia atrás: si no se indicó acción pero sí suite, asumir --gen
if [ "$ACTION_COUNT" -eq 0 ]; then
    ACTION_GEN=true
fi

# Valores por defecto de suites si no se indicó ninguna
if [ "$TARGET_COUNT" -eq 0 ]; then
    if [ "$ACTION_GEN" = true ]; then
        TARGET_ALL=true
    fi
    if [ "$ACTION_INFER" = true ]; then
        # Por defecto la inferencia procesa la traza combinada
        TARGET_COMBINED=true
    fi
    if [ "$ACTION_DUMP" = true ]; then
        TARGET_COMBINED=true
    fi
fi

PPT_SELECT="ar\.edu\.unrc\.game2048\.(Board|Cell|MockRNG|MathUtils)(\.|\:\:)"
PPT_OMIT=".*Test.*"

# ==============================================================================
# 1. FUNCIONES DE GENERACIÓN DE TRAZAS (--gen)
# ==============================================================================
init_classpath() {
    if [ -z "$CLASSPATH" ]; then
        echo "==> Compilando proyecto y suites de pruebas..."
        mvn test-compile -q
        mkdir -p "$OUTPUT_DIR"
        CLASSPATH="$DAIKON_JAR:$RANDOOP_JAR:$EVOSUITE_JAR:target/classes:target/test-classes"
        MVN_CP="$(mvn dependency:build-classpath -q -DforceStdout 2>/dev/null || true)"
        if [ -n "$MVN_CP" ]; then
            CLASSPATH="$CLASSPATH:$MVN_CP"
        fi
    fi
}

run_gen_manual() {
    init_classpath
    echo ""
    echo "======================================================================"
    echo " [GEN] Generando traza: Tests Manuales"
    echo " Archivo destino: $OUTPUT_DIR/manual.dtrace.gz"
    echo "======================================================================"
    java -cp "$CLASSPATH" \
      daikon.Chicory \
      --ppt-select-pattern="$PPT_SELECT" \
      --ppt-omit-pattern="$PPT_OMIT" \
      --output-dir="$OUTPUT_DIR" \
      --dtrace-file=manual.dtrace.gz \
      org.junit.runner.JUnitCore \
      ar.edu.unrc.game2048.CellTest ar.edu.unrc.game2048.BoardTest || true

    if [ -f "$OUTPUT_DIR/manual.dtrace.gz" ]; then
        echo "--> Traza manual generada: $OUTPUT_DIR/manual.dtrace.gz ($(du -h "$OUTPUT_DIR/manual.dtrace.gz" | cut -f1))"
    else
        echo "Error: No se pudo generar $OUTPUT_DIR/manual.dtrace.gz"
        exit 1
    fi
}

run_gen_randoop() {
    init_classpath
    echo ""
    echo "======================================================================"
    echo " [GEN] Generando traza: Tests Randoop"
    echo " Archivo destino: $OUTPUT_DIR/randoop.dtrace.gz"
    echo "======================================================================"
    RANDOOP_TARGETS="randoopTests.RegressionTest"
    if [ -f "target/test-classes/randoopTests/ErrorTest.class" ]; then
        RANDOOP_TARGETS="$RANDOOP_TARGETS randoopTests.ErrorTest"
    fi

    java -cp "$CLASSPATH" \
      daikon.Chicory \
      --ppt-select-pattern="$PPT_SELECT" \
      --ppt-omit-pattern="$PPT_OMIT" \
      --output-dir="$OUTPUT_DIR" \
      --dtrace-file=randoop.dtrace.gz \
      org.junit.runner.JUnitCore \
      $RANDOOP_TARGETS || true

    if [ -f "$OUTPUT_DIR/randoop.dtrace.gz" ]; then
        echo "--> Traza Randoop generada: $OUTPUT_DIR/randoop.dtrace.gz ($(du -h "$OUTPUT_DIR/randoop.dtrace.gz" | cut -f1))"
    else
        echo "Error: No se pudo generar $OUTPUT_DIR/randoop.dtrace.gz"
        exit 1
    fi
}

run_gen_evosuite() {
    init_classpath
    echo ""
    echo "======================================================================"
    echo " [GEN] Generando traza: Tests EvoSuite"
    echo " Archivo destino: $OUTPUT_DIR/evosuite.dtrace.gz"
    echo "======================================================================"
    JDK_JAVA_OPTIONS="-Djava.security.manager=allow --add-opens java.desktop/java.awt=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.net=ALL-UNNAMED --add-exports java.base/sun.net.util=ALL-UNNAMED" \
    java -cp "$CLASSPATH" \
      daikon.Chicory \
      --ppt-select-pattern="$PPT_SELECT" \
      --ppt-omit-pattern="$PPT_OMIT" \
      --output-dir="$OUTPUT_DIR" \
      --dtrace-file=evosuite.dtrace.gz \
      ar.edu.unrc.game2048.EvoSuiteTestRunner || true

    if [ -f "$OUTPUT_DIR/evosuite.dtrace.gz" ]; then
        echo "--> Traza EvoSuite generada: $OUTPUT_DIR/evosuite.dtrace.gz ($(du -h "$OUTPUT_DIR/evosuite.dtrace.gz" | cut -f1))"
    else
        echo "Error: No se pudo generar $OUTPUT_DIR/evosuite.dtrace.gz"
        exit 1
    fi
}

# ==============================================================================
# 2. FUNCIONES DE INFERENCIA DE INVARIANTES (--infer)
# ==============================================================================
run_infer_file() {
    local name="$1"
    local output_inv="$2"
    shift 2
    local input_traces=("$@")

    echo ""
    echo "======================================================================"
    echo " [INFER] Infiriendo invariantes: $name"
    echo " Archivo(s) de traza: ${input_traces[*]}"
    echo " Archivo destino: $output_inv"
    echo "======================================================================"

    mkdir -p "$OUTPUT_DIR"
    java -Xmx4g -cp "$DAIKON_JAR" daikon.Daikon -o "$output_inv" "${input_traces[@]}"

    if [ -f "$output_inv" ]; then
        echo "--> Invariantes inferidos exitosamente: $output_inv ($(du -h "$output_inv" | cut -f1))"
    else
        echo "Error: No se pudo generar el archivo de invariantes $output_inv"
        exit 1
    fi
}

run_infer_manual() {
    if [ ! -f "$OUTPUT_DIR/manual.dtrace.gz" ]; then
        echo "Error: No se encontró la traza '$OUTPUT_DIR/manual.dtrace.gz'."
        echo "Ejecuta primero: $0 --gen --manual"
        exit 1
    fi
    run_infer_file "Tests Manuales" "$OUTPUT_DIR/manual.inv.gz" "$OUTPUT_DIR/manual.dtrace.gz"
}

run_infer_randoop() {
    if [ ! -f "$OUTPUT_DIR/randoop.dtrace.gz" ]; then
        echo "Error: No se encontró la traza '$OUTPUT_DIR/randoop.dtrace.gz'."
        echo "Ejecuta primero: $0 --gen --randoop"
        exit 1
    fi
    run_infer_file "Tests Randoop" "$OUTPUT_DIR/randoop.inv.gz" "$OUTPUT_DIR/randoop.dtrace.gz"
}

run_infer_evosuite() {
    if [ ! -f "$OUTPUT_DIR/evosuite.dtrace.gz" ]; then
        echo "Error: No se encontró la traza '$OUTPUT_DIR/evosuite.dtrace.gz'."
        echo "Ejecuta primero: $0 --gen --evosuite"
        exit 1
    fi
    run_infer_file "Tests EvoSuite" "$OUTPUT_DIR/evosuite.inv.gz" "$OUTPUT_DIR/evosuite.dtrace.gz"
}

run_infer_combined() {
    shopt -s nullglob
    local traces=("$OUTPUT_DIR"/*.dtrace.gz)
    shopt -u nullglob

    if [ "${#traces[@]}" -eq 0 ]; then
        echo "Error: No se encontraron archivos de traza (*.dtrace.gz) en '$OUTPUT_DIR/'."
        echo "Ejecuta primero: $0 --gen"
        exit 1
    fi
    run_infer_file "Traza Combinada" "$OUTPUT_DIR/output.inv.gz" "${traces[@]}"
}

# ==============================================================================
# 3. FUNCIONES DE VOLCADO DE INVARIANTES (--dump)
# ==============================================================================
run_dump_file() {
    local src_inv="$1"
    local dest_txt="$2"

    if [ ! -f "$src_inv" ]; then
        echo "Error: No se encontró el archivo de invariantes '$src_inv'."
        echo "Ejecuta primero la inferencia con: $0 --infer"
        exit 1
    fi

    echo ""
    echo "======================================================================"
    echo " [DUMP] Volcando invariantes a texto"
    echo " Archivo fuente: $src_inv"
    echo " Archivo destino: $dest_txt"
    echo "======================================================================"

    java -cp "$DAIKON_JAR" daikon.PrintInvariants "$src_inv" > "$dest_txt"

    if [ -f "$dest_txt" ]; then
        echo "--> Invariantes volcados exitosamente en: $dest_txt ($(du -h "$dest_txt" | cut -f1), $(wc -l < "$dest_txt") líneas)"
    else
        echo "Error: No se pudo generar $dest_txt"
        exit 1
    fi
}

# ==============================================================================
# EJECUCIÓN SECUENCIAL SEGÚN ACCIONES
# ==============================================================================

# Paso 1: Generación de Trazas (--gen)
if [ "$ACTION_GEN" = true ]; then
    if [ "$TARGET_MANUAL" = true ] || [ "$TARGET_ALL" = true ]; then
        run_gen_manual
    fi
    if [ "$TARGET_RANDOOP" = true ] || [ "$TARGET_ALL" = true ]; then
        run_gen_randoop
    fi
    if [ "$TARGET_EVOSUITE" = true ] || [ "$TARGET_ALL" = true ]; then
        run_gen_evosuite
    fi
fi

# Paso 2: Inferencia de Invariantes (--infer)
if [ "$ACTION_INFER" = true ]; then
    if [ "$TARGET_MANUAL" = true ]; then
        run_infer_manual
    fi
    if [ "$TARGET_RANDOOP" = true ]; then
        run_infer_randoop
    fi
    if [ "$TARGET_EVOSUITE" = true ]; then
        run_infer_evosuite
    fi
    if [ "$TARGET_COMBINED" = true ]; then
        run_infer_combined
    fi
    if [ "$TARGET_ALL" = true ]; then
        run_infer_manual
        run_infer_randoop
        run_infer_evosuite
        run_infer_combined
    fi
fi

# Paso 3: Volcado de Invariantes a Texto (--dump)
if [ "$ACTION_DUMP" = true ]; then
    # Determinar qué archivo(s) volcar
    if [ "$TARGET_MANUAL" = true ]; then
        target_dest="${DUMP_FILE:-daikon-output-manual.txt}"
        run_dump_file "$OUTPUT_DIR/manual.inv.gz" "$target_dest"
    elif [ "$TARGET_RANDOOP" = true ]; then
        target_dest="${DUMP_FILE:-daikon-output-randoop.txt}"
        run_dump_file "$OUTPUT_DIR/randoop.inv.gz" "$target_dest"
    elif [ "$TARGET_EVOSUITE" = true ]; then
        target_dest="${DUMP_FILE:-daikon-output-evosuite.txt}"
        run_dump_file "$OUTPUT_DIR/evosuite.inv.gz" "$target_dest"
    elif [ "$TARGET_ALL" = true ] && [ -z "$DUMP_FILE" ]; then
        # Volcar todas las disponibles con sus nombres respectivos
        if [ -f "$OUTPUT_DIR/manual.inv.gz" ]; then
            run_dump_file "$OUTPUT_DIR/manual.inv.gz" "daikon-output-manual.txt"
        fi
        if [ -f "$OUTPUT_DIR/randoop.inv.gz" ]; then
            run_dump_file "$OUTPUT_DIR/randoop.inv.gz" "daikon-output-randoop.txt"
        fi
        if [ -f "$OUTPUT_DIR/evosuite.inv.gz" ]; then
            run_dump_file "$OUTPUT_DIR/evosuite.inv.gz" "daikon-output-evosuite.txt"
        fi
        if [ -f "$OUTPUT_DIR/output.inv.gz" ]; then
            run_dump_file "$OUTPUT_DIR/output.inv.gz" "daikon-output.txt"
        fi
    else
        # Por defecto volcar output.inv.gz (o el primer .inv.gz disponible si output no existe)
        src_inv="$OUTPUT_DIR/output.inv.gz"
        if [ ! -f "$src_inv" ]; then
            shopt -s nullglob
            any_inv=("$OUTPUT_DIR"/*.inv.gz)
            shopt -u nullglob
            if [ "${#any_inv[@]}" -gt 0 ]; then
                src_inv="${any_inv[0]}"
            fi
        fi
        target_dest="${DUMP_FILE:-daikon-output.txt}"
        run_dump_file "$src_inv" "$target_dest"
    fi
fi

echo ""
echo "Operación completada con éxito."
