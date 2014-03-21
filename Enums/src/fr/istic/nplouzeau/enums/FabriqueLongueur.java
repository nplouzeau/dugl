package fr.istic.nplouzeau.enums;

/**
 * Author: plouzeau
 * Date: 2014-03-21
 * Time: 14:54
 */
public class FabriqueLongueur {

	static public Longueur créer(double valeurNumérique, UnitéLongueur u) {
		return new LongueurImpl(valeurNumérique, u);
	}

	private static class LongueurImpl implements Longueur {
		private double valeurEnMètres;

		public LongueurImpl(double valeurNumérique, UnitéLongueur u) {
			switch (u) {
				case MÈTRE:
					valeurEnMètres = valeurNumérique;
					break;

				case POUCE:
					valeurEnMètres = valeurNumérique * 2.54E-02;
					break;

				case PIED:
					valeurEnMètres = valeurNumérique * 3.048E-01;
					break;

				case MILE_IMPÉRIAL:
					valeurEnMètres = valeurNumérique * 1.609344E03;

					break;
				case MILE_NAUTIQUE:
					valeurEnMètres = valeurNumérique * 1.852E03;

					break;
			}
		}

		/**
		 * Retourne la valeur de la longueur dans une unité de longueur
		 *
		 * @param u l'unité du résultat
		 * @return la valeur numérique de la longueur dans l'unité u
		 */
		@Override
		public double getValeurNumérique(UnitéLongueur u) {
			switch (u) {
				case MÈTRE:
					return valeurEnMètres;

				case POUCE:
					return valeurEnMètres / 2.54E-02;

				case PIED:
					return valeurEnMètres / 3.048E-01;

				case MILE_IMPÉRIAL:
					return valeurEnMètres / 1.609344E03;

				case MILE_NAUTIQUE:
					return valeurEnMètres / 1.852E03;
			}
			return Double.NaN;
		}

		/**
		 * Crée une nouvelle longueur correspondant à la somme de this et de l
		 * @param l      longueur à ajouter à this
		 * @return       nouvelle longueur correspond à la somme de this et l
		 */
		@Override
		public Longueur ajouter(Longueur l) {
			return new LongueurImpl(this.valeurEnMètres + l.getValeurNumérique(UnitéLongueur.MÈTRE), UnitéLongueur.MÈTRE);
		}
	}
}