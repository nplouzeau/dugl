package fr.istic.nplouzeau;

import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testJoes() throws Exception {
         Restaurant restaurant = new EatAtJoes();

        Meal newMeal = restaurant.newMeal(1200.0);

    }
}