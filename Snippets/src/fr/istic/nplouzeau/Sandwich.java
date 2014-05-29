package fr.istic.nplouzeau;

/**
 * Created by plouzeau on 2014-05-29.
 */

/**
 * Illustrates the way to have factory operations (aka factory methods in EJ),
 * following rule EJ#1
 */
public class Sandwich {

    public final static double gramsOfCheesePerHamSlice = 20.0;
    private int numberOfHamSlices;
    private double amountOfCheeseInGrams;


    /**
     * Creates a new fresh sandwich with ham slices and cheese
     * The amount of cheese is computed by this method using a secret recipe
     *
     * @param numberOfHamSlices how many slices in the sandwich, must be > 0
     * @return a fresh sandwich
     * @throws java.lang.IllegalArgumentException if numberOfHamSlices is <= 0
     */
    static Sandwich FromHamAndCheese(int numberOfHamSlices) {
        if(numberOfHamSlices <= 0) { throw new IllegalArgumentException("numberOfHamSlices <= 0");}
        Sandwich newSandwich = new Sandwich();
        newSandwich.numberOfHamSlices = numberOfHamSlices;
        newSandwich.amountOfCheeseInGrams = gramsOfCheesePerHamSlice * numberOfHamSlices;
        return newSandwich;
    }

    private Sandwich() {
    }    // Prevents instantiation by third party code

    public int getNumberOfHamSlices() {
        return numberOfHamSlices;
    }

    public double getAmountOfCheeseInGrams() {
        return amountOfCheeseInGrams;
    }
}
