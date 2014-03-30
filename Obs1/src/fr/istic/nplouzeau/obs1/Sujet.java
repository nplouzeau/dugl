/**
 * Author: plouzeau
 * Date: 2014-03-28
 * Time: 17:14
 */
package fr.istic.nplouzeau.obs1;

public interface Sujet<T> {
	/**
	 * Ajoute un observateur o, à condition que o ne soit pas déjà abonné à this
	 *
	 * @param o L'observateur à ajouter
	 * @throws IllegalArgumentException si o est null ou o est déjà abonné à this
	 */
	void abonner(Observateur<T> o) throws IllegalArgumentException;

	/**
	 * Retire un observateur o de la liste des abonnés à this,
	 * à condition que
	 * o soit abonné
	 *
	 * @param o L'observateur à retirer
	 * @throws IllegalArgumentException si o est null ou o n'est pas abonné à this
	 */
	void désabonner(Observateur<T> o) throws IllegalArgumentException;

	/**
	 * Lit la valeur du sujet
	 *
	 * @return valeur du sujet
	 */
	T getValeur();

	/**
	 * Change la valeur du sujet
	 *
	 * @param v la nouvelle valeur du sujet
	 */
	void setValeur(T v);

}
