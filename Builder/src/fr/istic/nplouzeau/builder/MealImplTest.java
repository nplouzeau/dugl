package fr.istic.nplouzeau.builder;

import org.junit.Assert;

/**
 * Author: PLOUZEAU, Noël
 * Date: 2013-09-23
 * Time: 11:31
 */
public class MealImplTest {

	private Meal meal;
	final private int nbPersons = 4;


	@org.junit.Before
	public void setUp() throws Exception {

		meal = new MealImpl.MealBuilder(nbPersons).location("ISTIC").build();

	}

	@org.junit.After
	public void tearDown() throws Exception {

	}

	@org.junit.Test
	public void testGetNumberOfPersons() throws Exception {

		Assert.assertEquals(meal.getNumberOfPersons(), nbPersons);
	}

	@org.junit.Test
	public void testGetLocation() throws Exception {

		Assert.assertEquals("ISTIC",meal.getLocation());
	}

	@org.junit.Test
	public void testGetBudget() throws Exception {
		Assert.assertEquals(0.0,meal.getBudget(),1.0d-16);

	}
}
