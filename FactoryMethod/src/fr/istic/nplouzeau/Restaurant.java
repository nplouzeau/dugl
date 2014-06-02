package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-06-02.
 */
public interface Restaurant {

    /**
     * Creates a new meal that has a minimal caloric value
     * @param minimalCaloricValueInJoules, must be > 0.0
     * @return  a new meal
     * @throws java.lang.IllegalArgumentException if minimalCaloricValueInJoules <= 0.0
     */
    Meal newMeal(double minimalCaloricValueInJoules);

}
