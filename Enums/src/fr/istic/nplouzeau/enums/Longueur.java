package fr.istic.nplouzeau.enums;

/**
 * Author: plouzeau
 * Date: 2014-03-21
 * Time: 14:50
 */
public interface Longueur {

	/**
	 * Retourne la valeur de la longueur dans une unité de longueur
	 *
	 * @param u l'unité du résultat
	 * @return la valeur numérique de la longueur dans l'unité u
	 */
	public double getValeurNumérique(UnitéLongueur u);

	/**
	 * Crée une nouvelle longueur correspondant à la somme de this et de l
	 * @param l      longueur à ajouter à this
	 * @return       nouvelle longueur correspond à la somme de this et l
	 */
	public Longueur ajouter(Longueur l);

}
