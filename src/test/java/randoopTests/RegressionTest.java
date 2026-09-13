package randoopTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CellRegressionTest.class,
    BoardRegressionTest.class,
})
public class RegressionTest {
}
