package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-05-29.
 */

/**
 * Illustrates the way to have factory operations (aka factory methods in EJ),
 * following rule EJ#1
 */
public final class Sandwich implements Meal {

    public final static double MASS_OF_CHEESE_PER_HAM_SLICE_IN_GRAMS = 20.0;
    private int numberOfHamSlices;
    private double amountOfCheeseInGrams;
    private final double pricePerHamSliceInEuros = 1.0;


    /**
     * Creates a new fresh sandwich by specifying the number of ham slices
     * The amount of cheese is computed using a secret recipe
     *
     * @param numberOfHamSlices how many slices in the sandwich, must be > 0
     * @return a fresh sandwich
     * @throws java.lang.IllegalArgumentException if numberOfHamSlices is <= 0
     */
    static Sandwich NewFromHam(int numberOfHamSlices) {
        // Preconditions checks
        if (numberOfHamSlices <= 0) {
            throw new IllegalArgumentException("numberOfHamSlices <= 0");
        }
        Sandwich newSandwich = new Sandwich();
        newSandwich.numberOfHamSlices = numberOfHamSlices;
        newSandwich.amountOfCheeseInGrams = MASS_OF_CHEESE_PER_HAM_SLICE_IN_GRAMS * numberOfHamSlices;
        newSandwich.checkInvariants();
        return newSandwich;
    }

    /**
     * Creates a fresh sandwich by specifying the amount of cheese
     * The number of ham slices is computed using a secret recipe
     *
     * @param amountOfCheeseInGrams how much cheese to put in sandwich, must be > 0.0
     * @return a fresh sandwich
     * @throws java.lang.IllegalArgumentException if amountOfCheeseInGrams is <= 0.0
     */
    static Sandwich NewFromCheese(double amountOfCheeseInGrams) {
        // Preconditions checks
        if (amountOfCheeseInGrams <= 0.0) {
            throw new IllegalArgumentException("amountOfCheeseInGrams <= 0");
        }
        Sandwich newSandwich = new Sandwich();
        newSandwich.amountOfCheeseInGrams = amountOfCheeseInGrams;
        newSandwich.numberOfHamSlices = (int) Math.ceil(amountOfCheeseInGrams / MASS_OF_CHEESE_PER_HAM_SLICE_IN_GRAMS);
        newSandwich.checkInvariants();
        return newSandwich;
    }

    static Sandwich Duplicate(Sandwich original) {
        Sandwich duplicata = new Sandwich();
        duplicata.numberOfHamSlices = original.numberOfHamSlices;
        duplicata.amountOfCheeseInGrams = original.amountOfCheeseInGrams;
        return duplicata;
    }

    // Private constructor: prevents instantiation by third party code
    private Sandwich() {
        assert MASS_OF_CHEESE_PER_HAM_SLICE_IN_GRAMS >= 0.0;
    }


    // To be called upon state changes
    private void checkInvariants() {
        assert numberOfHamSlices > 0;
        assert amountOfCheeseInGrams > 0.0;
    }

    public int getNumberOfHamSlices() {
        return numberOfHamSlices;
    }

    public double getAmountOfCheeseInGrams() {
        return amountOfCheeseInGrams;
    }

    @Override
    public double getCaloricValueInJoules() {

        double caloricValuePerHamSliceInJoules = 250.0;
        double caloricValuePerCheeseGramInJoules = 4.6;

        return numberOfHamSlices * caloricValuePerHamSliceInJoules
                + amountOfCheeseInGrams * caloricValuePerCheeseGramInJoules;
    }

    @Override
    public double getPriceInEuros() {

        return pricePerHamSliceInEuros * numberOfHamSlices;
    }
}

