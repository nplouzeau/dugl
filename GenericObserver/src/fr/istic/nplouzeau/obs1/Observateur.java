package fr.istic.nplouzeau.obs1;

/**
 * Author: plouzeau
 * Date: 2014-03-28
 * Time: 17:15
 */
public interface Observateur<T> {

	/**
	 * Indique à l'observateur de la valeur du sujet s a changé
	 *
	 * @param s le sujet modifié
	 */
	void faireMiseAJour(Sujet<T> s);

}
