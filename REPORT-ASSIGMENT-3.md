# Reporte de Tareas del Assignment 3

## Phase 1: Automated Test Generation with EvoSuite

Generamos tests usando EvoSuite usando el script [runEvousuite.sh](./runEvosuite.sh).

```sh
./runEvosuite.sh --gen ar.edu.unrc.game2048.{Cell,Board}
```

Observamos los siguientes inputs generados por evosuite. 

Para `Cell`:
- Valores válidos normales: potencias de 2 y 0.
- Valores inválidos: negativos y números que no son potencia de 2 para disparar `IllegalArgumentException`.
- Valores extremos: `Cell.EMPTY`, `null` como argumento en `mergeWith(null)` y `canMergeWith(null)`.
- Valores de tipos incompatibles: `""` y `null` en `equals()`.

Para `Board`:
- Tamaños de tablero: válidos e inválidos.
- Winning values: válidos e inválidos (0 y números que no son potencia de 2).
- Índices fuera de rango para `getCell`/`setCell`: pares (x,y) tal que son inválidos para el tamaño del tablero.
- Valores negativos para `Position`: pares (x,y) tal que alguna componente es negativa. 
- Mock de RNG: algunas veces usa `MockRNG` con valores 0.0, 0.9, 1.0 para inicializar el constructor de `Board`.
- `null` como argumento: principalmente se usa en los constructores y métodos que toman objetos como parámetros.

Los tests generados tienen mayoritariamente ascerciones de regresión. Si bien EvoSuite genera tests con mocks (`MockRNG`), no hace un uso muy inteligente de los mismos, por ejemplo, genera un board determinista, pero no hace ascerciones sobre el valor de las celdas para una posición determinada luego de ejecutarse un movimiento. 

Solo en los tests para la clase `Cell` pueden llegar a encontrarse algunos tests interesantes donde se verifican ciertos invariantes de la clase, por lo general relacionados a `Cell.EMPTY`.

Además hay bastantes tests redundantes, sin utilidad practica o incluso tests que podrían llegar a fallar dependiendo la ejecución. Por ejemplo: 
- Tests donde se producen invocaciones sucesivas a métodos como `Board.initializeEmptyTest()` lo cual no tiene mucho sentido ya que su invocación repetida es idempotente respecto del estado de la instancia (lo cambiá una sola vez y el resto de invocaciones lo dejan igual).
- Tests donde declaran objetos y nunca se utilizan.
- Tests cuyas sentencias son casi identicas, o tests que comparten parte de las sentencias y uno subsume al otro.
- Tests difíciles de comprender, ya sea por su longitud o por tener sentencias complejas. 
- Tests potencialmente flaky donde se encuentran secuencias como la siguiente:
    ```java
        Random.setNextRandom(13);
        board0.moveRight();
        // Undeclared exception!
        board0.moveLeft()
    ```


## Phase 2: Fuzzing