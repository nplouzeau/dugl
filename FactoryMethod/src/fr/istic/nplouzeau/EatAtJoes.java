package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-06-02.
 */
public class EatAtJoes implements Restaurant {

    /**
     * Creates a new meal that has a minimal caloric value
     *
     * @param minimalCaloricValueInJoules, must be > 0.0
     * @return a new meal
     * @throws java.lang.IllegalArgumentException if minimalCaloricValueInJoules <= 0.0
     */
    @Override
    public Meal newMeal(double minimalCaloricValueInJoules) {
        if (minimalCaloricValueInJoules <= 0.0) {
            throw new IllegalArgumentException("minimalCaloricValueInJoules <= 0.0");
        }
        final double lotsOfCalories = 10.0;
        Meal newMeal = Sandwich.NewFromCheese(minimalCaloricValueInJoules*lotsOfCalories);
        assert newMeal.getCaloricValueInJoules() >= minimalCaloricValueInJoules;
        return newMeal;
    }
}
