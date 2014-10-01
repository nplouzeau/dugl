package fr.istic.nplouzeau.decorator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CoffeeMachineTest {

    private CoffeeMachine sampleCoffeeMachine;
    private Cup sampleCup;

    @Before
    public void setUp() throws Exception {

        sampleCoffeeMachine = new BasicCoffeeMachine();

    }

    @Test
    public void testProvideCup() throws Exception {
         sampleCup = sampleCoffeeMachine.provideCup();
        Assert.assertEquals(10.0, sampleCup.getCapacityInCm3(),10.0e-5);
    }

    @Test
    public void testPourCoffee() throws Exception {
         Assert.fail("testPourCoffee not implemented");
    }
}