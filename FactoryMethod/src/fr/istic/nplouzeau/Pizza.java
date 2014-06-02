package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-06-02.
 */
public final class Pizza implements Meal {

    private double sideLengthInMeters;
    public static final double caloricValuePerSquareMeterInJoules = 12000.0;

    private final double fixedPricePerPizzaInEuros = 15.0;

    private Pizza() {}

    static Pizza NewPizza(double sideLengthInMeters) {
        Pizza newPizza = new Pizza();
        newPizza.sideLengthInMeters = sideLengthInMeters;
        return newPizza;
    }

    @Override
    public double getCaloricValueInJoules() {
        return sideLengthInMeters * sideLengthInMeters * caloricValuePerSquareMeterInJoules;
    }


    @Override
    public double getPriceInEuros() {
        return fixedPricePerPizzaInEuros;
    }
}
