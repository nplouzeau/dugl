package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public interface Cup {

    double getCapacityInCm3();

    double getSugarAmountInGrams();

    /**
     * Adds more sugar in the cup.
     *
     * @param moreSugar amount to add, must be > 0.0
     * @throws java.lang.IllegalArgumentException if amount < 0.0
     */
    void addSugarAmountInGrams(double moreSugar);

}
