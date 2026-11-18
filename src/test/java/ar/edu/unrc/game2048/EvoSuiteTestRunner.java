package ar.edu.unrc.game2048;

import org.evosuite.runtime.EvoRunner;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Runner auxiliar para ejecutar los tests de EvoSuite bajo Chicory (Daikon).
 * - Desactiva el classloader aislado y el agent dinámico de EvoSuite para evitar
 *   conflictos de instrumentación y errores de bytecode en Java moderno.
 * - Desactiva el timeout estricto de 4000ms de JUnit para que el overhead de I/O
 *   de Daikon/Chicory no cause TestTimedOutException en tests de tableros grandes.
 * - Conecta Math.random() al generador pseudo-aleatorio de EvoSuite para que
 *   las aserciones que dependen de valores aleatorios se cumplan de manera determinista.
 */
public class EvoSuiteTestRunner {

    public static class DaikonEvoRunner extends EvoRunner {
        public DaikonEvoRunner(Class<?> testClass) throws InitializationError {
            super(testClass);
        }

        @Override
        protected Statement withPotentialTimeout(FrameworkMethod method, Object test, Statement next) {
            // Omitir el timeout de 4000ms para permitir la instrumentación de Chicory
            return next;
        }
    }

    private static void hookMathRandomToEvoSuite() {
        try {
            Class<?> holder = Class.forName("java.lang.Math$RandomNumberGeneratorHolder");
            Field field = holder.getDeclaredField("randomNumberGenerator");
            Field unsafeField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);
            sun.misc.Unsafe unsafe = (sun.misc.Unsafe) unsafeField.get(null);
            Object base = unsafe.staticFieldBase(field);
            long offset = unsafe.staticFieldOffset(field);
            unsafe.putObject(base, offset, new java.util.Random() {
                @Override
                public double nextDouble() {
                    return org.evosuite.runtime.Random.nextDouble();
                }
            });
        } catch (Throwable t) {
            // No fatal si no se tienen permisos de reflexión profunda
        }
    }

    public static void main(String[] args) throws Exception {
        EvoRunner.useClassLoader = false;
        EvoRunner.useAgent = false;
        hookMathRandomToEvoSuite();

        JUnitCore junit = new JUnitCore();
        int totalRun = 0;
        int totalFailures = 0;
        int totalIgnored = 0;
        List<Failure> failures = new ArrayList<Failure>();

        Class<?>[] testClasses = new Class<?>[] {
            Cell_ESTest.class,
            Board_ESTest.class
        };

        for (Class<?> clazz : testClasses) {
            DaikonEvoRunner runner = new DaikonEvoRunner(clazz);
            Result result = junit.run(runner);
            totalRun += result.getRunCount();
            totalFailures += result.getFailureCount();
            totalIgnored += result.getIgnoreCount();
            failures.addAll(result.getFailures());
        }

        System.out.println("Tests run: " + totalRun +
                           ", Failures: " + totalFailures +
                           ", Ignored: " + totalIgnored);

        if (totalFailures > 0) {
            for (Failure f : failures) {
                System.err.println("FAILURE: " + f.getDescription());
                System.err.println(f.getTrace());
            }
            System.exit(1);
        }
    }
}
