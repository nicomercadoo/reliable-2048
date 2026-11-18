mvn test-compile -q
mkdir -p daikon-traces
CP="lib/daikon.jar:target/classes:target/test-classes:$(mvn dependency:build-classpath -q -DforceStdout 2>/dev/null)"

java -cp "$CP" daikon.Chicory \
  --ppt-select-pattern="ar\.edu\.unrc\.sortedList\.SortedList(\.|\:\:)" \
  --ppt-omit-pattern=".*Test.*|.*\.(toString|hashCode)\(.*" \
  --output-dir="daikon-traces" \
  --dtrace-file="sortedlist.dtrace.gz" \
  org.junit.runner.JUnitCore \
  ar.edu.unrc.sortedList.SortedListTest

java -Xmx4g -cp "lib/daikon.jar" daikon.Daikon \
  --ppt-omit-pattern=".*Test.*|.*\.(toString|hashCode)\(.*" \
  -o "daikon-traces/sortedlist.inv.gz" \
  "daikon-traces/sortedlist.dtrace.gz"

java -cp "lib/daikon.jar" daikon.PrintInvariants \
  "daikon-traces/sortedlist.inv.gz" > daikon-output-sortedlist.txt
