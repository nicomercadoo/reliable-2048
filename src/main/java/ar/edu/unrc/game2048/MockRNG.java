package ar.edu.unrc.game2048;

public class MockRNG implements RNGStrategy {
    private double[] values;
    private int index;

    public MockRNG() {
        this.values = new double[]{0.5};
        this.index = 0;
    }

    public MockRNG(double val) {
        if (val < 0 || val > 1) {
            throw new IllegalArgumentException("Value must be between 0 and 1");
        }
        this.values = new double[]{val};
        this.index = 0;
    }

    @Override
    public double getRandom() {
        double value = values[index];
        index = (index + 1) % values.length;
        return value;
    }

}
