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

Completamos el método fuzz de la clase RandomFuzzer propuesto en el archivo `fuzzer.py`. En nuestro caso extendimos mínimamente el string generado por el fuzzer dado a que era necesario para nuestra versión modificada de game2048, debido a que empleamos un constructor que solicita como parámetros de entrada un tamaño y un valor de victoria que modifican la instancia del tablero. 

Para la generación de movimientos en `fuzz()`, determinamos de forma aleatoria la cantidad de jugadas utilizando `random.randint(self.min_length, self.max_length)`. Luego, seleccionamos las teclas mediante `random.choices(KEYS, k=...)`, permitiendo que cada dirección (`w`, `a`, `s`, `d`) tenga la misma probabilidad de ser elegida. Finalmente, concatenamos las entradas de configuración iniciales (`4\n2048\n`), la secuencia de movimientos separada por saltos de línea y el comando de salida (`q\n`), garantizando que la ejecución termine de manera controlada.

Al ejecutar la implementación no se divisaron errores dentro del código, dado que todas las ejecuciones pasaron sin problemas. Tampoco ocurrió un crash dentro de la ejecución del programa.

#### Respuestas a preguntas puntuales 

Respondiendo a las preguntas: 

- How long should the sequence be? Should the length itself be random?
- Should all keys be equally likely?

Nosotros creemos que las secuencias deberían ser de una longitud acotada con un límite inferior y superior, pero a su vez basada en una selección aleatoria dentro de ese rango. Ya que de este modo podríamos tener instancias de juego que terminan abruptamente y otras que se extienden a una mayor longitud, manteniendo una variedad de escenarios posibles con la aleatoriedad. 

En el caso de si las keys deberían ser igualmente probables creemos que esto es necesario, puesto que de otro modo estaríamos favoreciendo injustamente otro tipo de movimiento y podría ocurrir que, por constantes movimientos hacia la misma dirección, no logremos sacar resultados concluyentes (puesto que realizar un movimiento hacia la misma dirección en repetidas ocasiones tarde o temprano causaría un estancamiento en el tablero)

### Adición de repOK()

Se añadieron asserts del repOK en lugares vitales de la ejecución del código como, por ejemplo, luego de la creación del tablero y posterior a cada movimiento. Además, se configuró el runner con el flag `-ea` para asegurar que la JVM evalúe las aserciones en tiempo de ejecución.

No fue encontrada ninguna situación de crasheos o de fallas en alguna aserción.

### Conclusiones y Comparativa (EvoSuite y Randoop)

El fuzzer demuestra tener sus ventajas al ser un método de testing de caja negra, con una implementación sumamente sencilla, debido a solo tratarse de entradas al programa aleatorizadas. Aún así, nos parece prudente concluir que no es suficiente con la implementación de un fuzzer, debido a la nula noción de cobertura interna y, por ende, de cobertura de mutantes. De todas formas, sirve como una buen complemento a tests suites generadas ya sea por Randoop o por EvoSuite que son herramientas mucho más complejas y pesadas computacionalmente, pero con un resultado mucho mayor en cuanto a cobertura y testing.
