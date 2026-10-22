## Comandos

```bash
java -cp "lib/daikon.jar:target/classes:target/test-classes:$(mvn dependency:build-classpath -q -DforceStdout)" \
  daikon.Chicory \
  --ppt-select-pattern="ar.edu.unrc.game2048.Board|ar.edu.unrc.game2048.Cell|ar.edu.unrc.game2048.MockRNG|ar.edu.unrc.game2048.MathUtils" \
  --output-dir=daikon-traces \
  org.junit.runner.JUnitCore \
  ar.edu.unrc.game2048.CellTest ar.edu.unrc.game2048.BoardTest
```

Luego ejecutar

```bash
java -cp lib/daikon.jar daikon.Daikon \
     -o daikon-traces/output.inv.gz \
     daikon-traces/*.dtrace.gz
```

```bash
java -cp lib/daikon.jar daikon.PrintInvariants daikon-traces/output.inv.gz > daikon-output.txt
```
