package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-05-29.
 */

/**
 * Illustrates the way to have factory operations (aka factory methods in EJ),
 * following rule EJ#1
 *
 */
public final class Sandwich {

    public final static double gramsOfCheesePerHamSlice = 20.0;
    private int numberOfHamSlices;
    private double amountOfCheeseInGrams;


    /**
     * Creates a new fresh sandwich by specifying the number of ham slices
     * The amount of cheese is computed using a secret recipe
     *
     * @param numberOfHamSlices how many slices in the sandwich, must be > 0
     * @return a fresh sandwich
     * @throws java.lang.IllegalArgumentException if numberOfHamSlices is <= 0
     */
    static Sandwich FromHam(int numberOfHamSlices) {
        // Preconditions checks
        if(numberOfHamSlices <= 0) { throw new IllegalArgumentException("numberOfHamSlices <= 0");}
        Sandwich newSandwich = new Sandwich();
        newSandwich.numberOfHamSlices = numberOfHamSlices;
        newSandwich.amountOfCheeseInGrams = gramsOfCheesePerHamSlice * numberOfHamSlices;
        return newSandwich;
    }

    /**
     * Creates a fresh sandwich by specifying the amount of cheese
     * The number of ham slices is computed using a secret recipe
     * @param amountOfCheeseInGrams    how much cheese to put in sandwich, must be > 0.0
     * @return a fresh sandwich
     * @throws java.lang.IllegalArgumentException if amountOfCheeseInGrams is <= 0.0
     */
    static Sandwich FromCheese(double amountOfCheeseInGrams) {
        // Preconditions checks
        if (amountOfCheeseInGrams <= 0.0) { throw new IllegalArgumentException("amountOfCheeseInGrams <= 0");}
        Sandwich newSandwich = new Sandwich();
        newSandwich.amountOfCheeseInGrams = amountOfCheeseInGrams;
        newSandwich.numberOfHamSlices = (int) Math.floor(amountOfCheeseInGrams / gramsOfCheesePerHamSlice);
        return newSandwich;
    }

    // Private constructor: prevents instantiation by third party code
    private Sandwich() {
        assert gramsOfCheesePerHamSlice >= 0.0;
    }


    public int getNumberOfHamSlices() {
        return numberOfHamSlices;
    }

    public double getAmountOfCheeseInGrams() {
        return amountOfCheeseInGrams;
    }
}
