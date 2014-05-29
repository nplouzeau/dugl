package fr.istic.nplouzeau;

import org.junit.Assert;
import org.junit.Test;

public class SandwichTest {

    // Test with one slice of ham
    @Test
    public void testFromHamOneSlice() throws Exception {
        Assert.assertEquals(1, Sandwich.FromHam(1).getNumberOfHamSlices());

    }

    // No slice of ham
    @Test(expected = IllegalArgumentException.class)
    public void testFromHamNullSliceNumber() throws Exception {
        Sandwich badSandwich = Sandwich.FromHam(0);
    }

    // Negative number of ham slices
    @Test(expected = IllegalArgumentException.class)
    public void testFromHamNegativeNumberOfSlices() throws Exception {
        Sandwich badSandwich = Sandwich.FromHam(-1);
    }

    // Test with a trivial amount of cheese
    @Test
    public void testFromCheeseTrivialAmountOfCheese() throws Exception {
        Assert.assertEquals(50.0d, Sandwich.FromCheese(50.0d).getAmountOfCheeseInGrams(), 1.0d - 16);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCheeseNullAmountOfCheese() throws Exception {
        Sandwich badSandwich = Sandwich.FromCheese(0.0d);
    }

    @Test
    public void testFromCheeseNegativeAmountOfCheese() throws Exception {
        Assert.fail("unimplemented test case");
    }

    @Test
    public void testCheeseHamBalance() throws Exception {
        Sandwich newSandwich = Sandwich.FromHam(10);
        Assert.assertEquals(10 * Sandwich.gramsOfCheesePerHamSlice,
                newSandwich.getAmountOfCheeseInGrams(),1.0d-16);

    }
}