package fr.istic.nplouzeau;

import org.junit.Assert;
import org.junit.Test;

public class SandwichTest {

    // Test with one slice of ham
    @Test
    public void testFromHamOneSlice() throws Exception {
        Assert.assertEquals(1, Sandwich.CreateFromHam(1).getNumberOfHamSlices());

    }

    // No slice of ham
    @Test(expected = IllegalArgumentException.class)
    public void testFromHamNullSliceNumber() throws Exception {
        Sandwich badSandwich = Sandwich.CreateFromHam(0);
    }

    // Negative number of ham slices
    @Test(expected = IllegalArgumentException.class)
    public void testFromHamNegativeNumberOfSlices() throws Exception {
        Sandwich badSandwich = Sandwich.CreateFromHam(-1);
    }

    // Test with a trivial amount of cheese
    @Test
    public void testFromCheeseTrivialAmountOfCheese() throws Exception {
        Assert.assertEquals(50.0d, Sandwich.CreateFromCheese(50.0d).getAmountOfCheeseInGrams(), 1.0d - 16);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromCheeseNullAmountOfCheese() throws Exception {
        Sandwich badSandwich = Sandwich.CreateFromCheese(0.0d);
    }

    @Test
    public void testFromCheeseNegativeAmountOfCheese() throws Exception {
        Assert.fail("unimplemented test case");
    }

    @Test
    public void testCheeseHamBalance() throws Exception {
        Sandwich newSandwich = Sandwich.CreateFromHam(10);
        Assert.assertEquals(10 * Sandwich.MASS_OF_CHEESE_PER_HAM_SLICE_IN_GRAMS,
                newSandwich.getAmountOfCheeseInGrams(),1.0d-16);

    }

    @Test
    public void testDuplicate() throws Exception {
        Sandwich original = Sandwich.CreateFromHam(1);
        Sandwich duplicate = Sandwich.Duplicate(original);

        Assert.assertNotSame(original,duplicate);
        Assert.assertEquals(original.getAmountOfCheeseInGrams(),duplicate.getAmountOfCheeseInGrams(),1.0d-16);
        Assert.assertEquals(original.getNumberOfHamSlices(),duplicate.getNumberOfHamSlices());
    }
}

