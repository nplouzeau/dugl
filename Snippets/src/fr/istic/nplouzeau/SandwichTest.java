package fr.istic.nplouzeau;

import org.junit.Assert;
import org.junit.Test;

public class SandwichTest {

    // Test with one slice of ham
    @Test
    public void testFromHamAndCheeseOneSlice() throws Exception {
        Assert.assertEquals(1,Sandwich.FromHamAndCheese(1).getNumberOfHamSlices());

    }

    // No slice of ham
    @Test(expected = IllegalArgumentException.class)
    public void testFromHamAndCheeseNullSliceNumber() throws Exception {
        Sandwich badSandwich = Sandwich.FromHamAndCheese(0);
    }

    // Negative number of ham slices
    @Test(expected = IllegalArgumentException.class)
    public void testFromHamAndCheeseNegativeNumberOfSlices() throws Exception {
        Sandwich badSandwich = Sandwich.FromHamAndCheese(-1);
    }
}