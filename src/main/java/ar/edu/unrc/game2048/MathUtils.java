package ar.edu.unrc.game2048;

public final class MathUtils {

    /**
     * analizes if a integer numb is a power of two with bit operators
     *
     * @param value
     * @return true if value is a power of two
     */
    public static boolean isPowerOfTwo(int value) {
        return value > 0 && (value & (value - 1)) == 0;
    }
}