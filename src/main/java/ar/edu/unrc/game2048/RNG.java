package ar.edu.unrc.game2048;

public class RNG implements RNGStrategy{
    @Override
    public double getRandom() {
        return Math.random();
    }
}
