package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public class BasicCup implements Cup {

    private final double capacityInCm3;
    private double currentSugarAmountInGrams;

    public BasicCup(double capacityInCm3) {
        this.capacityInCm3 = capacityInCm3;
    }

    @Override
    public double getCapacityInCm3() {
        return capacityInCm3;
    }

    @Override
    public double getSugarAmountInGrams() {
        return currentSugarAmountInGrams;
    }

    /**
     * Adds more sugar in the cup.
     *
     * @param moreSugarInGrams amount to add, must be > 0.0
     * @throws java.lang.IllegalArgumentException if amount < 0.0
     */
    @Override
    public void addSugarAmountInGrams(double moreSugarInGrams) {

        if(moreSugarInGrams < 0.0) {
            throw new IllegalArgumentException("negative sugar amount");
        }
        currentSugarAmountInGrams += moreSugarInGrams;
    }
}
