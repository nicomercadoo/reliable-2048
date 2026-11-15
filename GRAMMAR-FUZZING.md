# Reporte de Grammar-Based Fuzzing (Assignment 5 - Ejercicio 1.a)

## 1. Introducción y Objetivos
En el marco del Ejercicio 1.a de la Asignación 5, se desarrolló e implementó un **fuzzer basado en gramáticas** (*grammar-based fuzzer*) y un **arnés de pruebas** (*fuzzing harness*) automatizado en Python (`string_board_fuzzer.py`), diseñado para evaluar la robustez y la corrección de la implementación del juego 2048 (`Board` y `MainCLI`) cuando se inicializa desde cadenas de caracteres.

El fuzzer sigue los lineamientos de *The Fuzzing Book* (Zeller et al.), separando limpiamente la generación sintáctica de entradas mediante gramáticas BNF del arnés de ejecución y clasificación de resultados.

---

## 2. Diseño de la Gramática y Generador
Se formalizó la estructura sintáctica de los tableros en formato de diccionario de expansiones BNF:

```python
BOARD_GRAMMAR_4X4 = {
    "<start>": ["<board>"],
    "<board>": ["<open><row>,<row>,<row>,<row><close>"],
    "<open>": ["[", "[ ", " [ "],
    "<close>": ["]", " ]", " ] "],
    "<row>": ["<cell>,<cell>,<cell>,<cell>"],
    "<cell>": [
        "0", "0", "0", "0", "0", "0",
        "2", "2", "2", "2",
        "4", "4", "4",
        "8", "8",
        "16", "32", "64", "128", "256", "512", "1024", "2048", "4096"
    ],
}
```

### Características del Generador (`BoardGameGenerator`):
- **Soporte multidimensional**: Se crearon gramáticas dedicadas para tableros 3x3 (9 celdas), 4x4 (16 celdas) y 5x5 (25 celdas).
- **Valores ganadores compatibles**: Genera metas ($2^k$) que satisfacen formalmente el invariante de tamaño $size^2 \ge \log_2(winningValue)$:
  - Para 3x3: valores entre 16 y 512.
  - Para 4x4: valores entre 16 y 65536.
  - Para 5x5: valores entre 32 y 33554432.
- **Secuencias de juego**: Genera de 5 a 40 movimientos aleatorios (`w`, `a`, `s`, `d`) seguidos de la orden de salida `q`.

---

## 3. Arquitectura del Arnés de Fuzzing (`BoardCLIRunner`)
El arnés ejecuta el juego como subproceso bajo Java con aserciones habilitadas de la máquina virtual (`-ea`):

```bash
java -ea -cp ./target/classes ar.edu.unrc.game2048.MainCLI ...
```

### Modos de Ejecución Evaluados:
1. **Modo Argumentos de Consola (`args_mode`)**:
   Invoca `MainCLI "<board>" "<winning_value>"`, enviando los movimientos por `stdin`.
2. **Modo Interactivo (`stdin_mode`)**:
   Invoca `MainCLI` sin argumentos, enviando el tablero en la primera línea de `stdin`, la meta ganadora en la segunda, y a continuación los movimientos.

### Oráculos y Clasificación:
- **`PASS`**: El proceso finaliza con código de retorno `0` sin excepciones no controladas ni aserciones fallidas.
- **`FAIL`**: Violación de invariantes (`AssertionError` en `repOK()`), crasheos (`Exception`), o código de salida distinto de `0`.
- **`UNRESOLVED`**: Cuelgues por tiempo límite (`timeout > 10s`) o fallas del runner.

---

## 4. Errores Encontrados y Correcciones

### Error 1: Incompatibilidad de Tableros 3x3 en Modo Interactivo por Stdin
- **Síntoma**: Durante las primeras 50 pruebas, 10 ejecuciones fallaron con:
  ```
  java.lang.IllegalArgumentException: Board size must be greater or equals than 4.0
  ```
- **Causa Raíz**: En `MainCLI.java`, al detectar un tablero inicial por `stdin` (`sizeInput.startsWith("[")`), se instanciaba `new Board(sizeInput)` sin solicitar la meta ganadora, asignando `DEFAULT_WINNING_VALUE = 2048`. Dado que un tablero 3x3 requiere $size \ge 4$ para una meta de 2048 ($3^2 = 9 < \log_2(2048) = 11$), el constructor rechazaba el tablero.
- **Corrección**: Se actualizó `MainCLI` para solicitar interactivamente la meta ganadora (`winningValue`) cuando se ingresa un tablero por `stdin` (permitiendo presionar Enter para usar la meta por defecto si las dimensiones lo permiten). Asimismo, el arnés suministra la meta correspondiente en la segunda línea de entrada.

### Error 2: Mensaje de Victoria con Meta Fija ("2048")
- **Síntoma**: En `MainCLI.java`, la rutina de verificación de victoria imprimía de forma estática:
  ```java
  System.out.println("🎉 Congratulations! You reached 2048! 🎉");
  ```
  incluso cuando el juego se configuraba con metas personalizadas (ej. 512, 1024 o 4096).
- **Corrección**: Se parametrizó el mensaje para reflejar la meta real de la instancia:
  ```java
  System.out.println("🎉 Congratulations! You reached " + board.winningValue + "! 🎉");
  ```

---

## 5. Resultados de la Campaña de Fuzzing (500 Partidas)

Tras aplicar las correcciones, se ejecutó la campaña completa de 500 partidas:

```bash
python3 string_board_fuzzer.py --trials 500
```

### Métricas Obtenidas:
| Métrica | Valor | Porcentaje |
| :--- | :---: | :---: |
| **Total de Partidas Evaluadas** | **500** | 100.0% |
| **Partidas Exitosas (`PASS`)** | **500** | **100.0%** |
| **Partidas Fallidas (`FAIL`)** | **0** | **0.0%** |
| **Partidas No Resueltas (`UNRESOLVED`)** | **0** | **0.0%** |
| **Tiempo Total de Ejecución** | **32.40s** | ~15.4 partidas/s |

### Verificación de Regresión:
- **Suite Maven completa**: `mvn test` ejecutó 3.244 tests con 0 fallos y 0 errores.
- **Fuzzer existente**: `python3 fuzzer.py` ejecutó 20/20 partidas con resultado `PASS`.
