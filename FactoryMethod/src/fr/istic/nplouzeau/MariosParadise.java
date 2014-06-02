package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-06-02.
 */
public class MariosParadise implements Restaurant {


    private static double caloricValuePerPizza = 1200.0;

    /**
     * Creates a new meal that has a minimal caloric value
     *
     * @param minimalCaloricValueInJoules@return a new meal
     * @throws IllegalArgumentException if minimalCaloricValueInJoules <= 0.0
     */
    @Override
    public Meal newMeal(double minimalCaloricValueInJoules) {
        if (minimalCaloricValueInJoules <= 0.0) {
            throw new IllegalArgumentException("minimalCaloricValueInJoules <= 0.0");
        }

        double sideLengthOfPizzaInMeters =
                Math.sqrt(minimalCaloricValueInJoules / Pizza.caloricValuePerSquareMeterInJoules);

        return Pizza.NewPizza(sideLengthOfPizzaInMeters);
    }
}
