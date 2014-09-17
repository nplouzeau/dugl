package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public class BasicCup implements Cup {

    private final double capacityInCm3;

    public BasicCup(double capacityInCm3) {
        this.capacityInCm3 = capacityInCm3;
    }

    @Override
    public double getCapacityInCm3() {
        return capacityInCm3;
    }
}
