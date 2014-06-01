package fr.istic.nplouzeau.builder;

/**
 * Author: PLOUZEAU, Noël
 * Date: 2013-09-23
 * Time: 11:16
 */
public class MealImpl implements Meal {

	private int numberOfPersons;       // Mandatory
	private String location;           // Optional
	private double budget;              // Optional


	@Override
	public int getNumberOfPersons() {
		return this.numberOfPersons;
	}

	@Override
	public String getLocation() {
		return this.location;
	}

	@Override
	public double getBudget() {
		return this.budget;
	}


	public static class MealBuilder {

		private int numberOfPersons;       // Mandatory
		private String location = "<none defined>";           // Optional
		private double budget = 0;              // Optional

		public MealBuilder(int numberOfPersons) {
			this.numberOfPersons = numberOfPersons;
		}


		public MealBuilder location(String l) {
			this.location = l;
			return this;
		}

		public MealBuilder budget(double budget) {
			this.budget = budget;
			return this;
		}

		// The operation that builds a meal from stored parameters
		public Meal build() {
			return new MealImpl(this);
		}
	}

	// Note that this constructor is private so that
	// outside code has to go through the builder

	private MealImpl(MealBuilder builder) {
		numberOfPersons = builder.numberOfPersons;
		location = builder.location;
		budget = builder.budget;
	}
}
