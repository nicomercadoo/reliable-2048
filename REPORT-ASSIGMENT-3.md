# Reporte de Tareas del Assignment 3

## Phase 1: Automated Test Generation with EvoSuite

Generamos tests usando EvoSuite usando el script [runEvousuite.sh](./runEvosuite.sh).

> [!NOTE]
> Ver [README-TOOLS.md](./README-TOOLS.md) para entender como correr los tests generales vs. los de Evouite.

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

## Conclusiones y Comparativa

### Cobertura y Mutation Scores por Técnica

A continuación se presenta la comparativa integral de las técnicas de prueba empleadas a lo largo de los assignments: **pruebas manuales** (iniciales y mejoradas), **generación aleatoria con Randoop** (con y sin invariantes `repOK`), la **suite consolidada final** de Assignment 2, **generación evolutiva con EvoSuite** (Assignment 3, Fase 1) y **fuzzing de interfaz CLI** (Assignment 3, Fase 2).

#### Tabla Comparativa General del Proyecto

| Técnica / Enfoque | Herramienta | Cobertura de Líneas (Line Cov) | Cobertura de Ramas (Branch Cov) | Mutation Score (Mutation Cov) | Test Strength |
| :--- | :--- | :---: | :---: | :---: | :---: |
| **Tests Manuales (Inicial - A1/A2 P1)** | JaCoCo + PITest | 82% (279/340) | 81% (142/174) | **69%** (148/216) | 82% (148/180) |
| **Tests Manuales (Mejorados - A2 P2)** | JaCoCo + PITest | 79% (227/286) | 87% (180/205) | **83%** (203/245) | 94% (203/215) |
| **Randoop Base (Sin repOK - A2 P3)** | JaCoCo + PITest | 65% (205/317) | 58% (134/229) | **51%** (140/272) | 79% (140/177) |
| **Randoop + repOK + MockRNG (A2 P3)** | JaCoCo + PITest | 68% (219/321) | 67% (159/235) | **65%** (180/277) | 92% (180/196) |
| **Suite Consolidada (Manual + Randoop)** | JaCoCo + PITest | 80% (256/321) | 86% (204/235) | **84%** (232/277) | 95% (232/243) |
| **EvoSuite (Genético/Evolutivo - A3 P1)** | JaCoCo + EvoSuite Stats | **80%** (256/319) | **83%** (196/235) | **>91% - 94%** *(Weak Mutation)* | N/A *(PIT incompatible)* |
| **Fuzzer CLI + repOK (A3 P2)** | `fuzzer.py` + JVM `-ea` | N/A *(Caja negra CLI)* | N/A *(Caja negra CLI)* | N/A *(Dinámico)* | N/A *(Dinámico)* |

---

#### Análisis Comparativo

**Tests Manuales vs. Generación Automática**:
- Los **tests manuales** alcanzaron un Mutation Score elevado (83% en PIT con un Test Strength del 94%), ya que las aserciones fueron diseñadas intencionalmente para validar la semántica del juego.  Sin embargo, requirieron un esfuerzo considerable de diseño para alcanzar las ramas menos transitadas.
- **Randoop** generó tests rápidamente, pero sin `repOK` su cobertura de ramas fue baja (58%) y su Mutation Score fue el más pobre de todos (51%). Al incorporar `repOK` y `MockRNG`, el Mutation Score subió al 65% y la cobertura de ramas al 67%.
- **EvoSuite** superó ampliamente a Randoop en cobertura de código sobre las clases objetivo: alcanzó un 96% de líneas y 89% de ramas en `Board`, y un 93% de líneas y 93% de ramas en `Cell` (frente a 83% y 78% de Randoop). Cabe destacar que los tests generados por evosuit son mas legibles que los de randoop, aunque no encontraron ningún bug. Además, la mayoría de los que generó son tests de regresión y no hay muchos tests con ascerciones interesantes. 

**Rol del Fuzzer CLI**:
- A diferencia de las pruebas unitarias (que se enfocan en métodos y clases aisladas), el fuzzer opera a nivel de sistema como una prueba de caja negra sobre `MainCLI`.
- Aunque no provee métricas estáticas de JaCoCo o PITest integradas en el ciclo de construcción de Maven, complementa de manera única a Randoop y EvoSuite: ejercita el flujo de extremo a extremo y la entrada estándar del juego, validando continuamente los contratos de representación mediante `assert repOK()` con el flag `-ea` de la JVM en partidas completas.
- El fuzzer demuestra tener sus ventajas al ser un método de testing de caja negra, con una implementación sumamente sencilla, debido a solo tratarse de entradas al programa aleatorizadas. Aún así, nos parece prudente concluir que no es suficiente con la implementación de un fuzzer, debido a la nula noción de cobertura interna y, por ende, de cobertura de mutantes. De todas formas, sirve como un buen complemento a test suites generadas ya sea por Randoop o por EvoSuite que son herramientas mucho más complejas y pesadas computacionalmente, pero con un resultado mucho mayor en cuanto a cobertura y testing.

### Conclusiones Finales

Para nosotros Randoop y Evosuite contribuyeron equitativamente en el desarrollo del proyecto. Randoop nos permitío encontrar bugs que arreglamos en el assignment 2 y que no nos hubieramos dado cuenta de su existencia si no usabamos la herramienta. Y por otro lado Evosuite nos ayudó a mejorar la cobertura de la testsuite. Respecto al fuzzer, permitió que pudieramos testear la interfaz CLI del proyecto de manera automática, generando distintos tipos de movimientos y jugadas.
