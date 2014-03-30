package fr.istic.nplouzeau.obs1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: plouzeau
 * Date: 2014-03-29
 * Time: 14:33
 */
public class SujetImpl<T> implements Sujet<T> {
	private List<Observateur<T>> abonnés;
	private T valeur;

	public SujetImpl() {
		abonnés = new ArrayList<Observateur<T>>();
	}

	/**
	 * Ajoute un observateur o, à condition que o ne soit pas déjà abonné à this
	 *
	 * @param o L'observateur à ajouter
	 * @throws IllegalArgumentException si o est null ou o est déjà abonné à this
	 */
	@Override
	public void abonner(Observateur<T> o) throws IllegalArgumentException {
		if (abonnés.contains(o)) {
			throw new IllegalArgumentException("o est déjà abonné");
		}
		abonnés.add(o);
	}

	/**
	 * Retire un observateur o de la liste des abonnés à this,
	 * à condition que
	 * o soit abonné
	 *
	 * @param o L'observateur à retirer
	 * @throws IllegalArgumentException si o est null ou o n'est pas abonné à this
	 */
	@Override
	public void désabonner(Observateur<T> o) throws IllegalArgumentException {
		if (!abonnés.contains(o)) {
			throw new IllegalArgumentException("o n'est pas abonné");
		}
		abonnés.remove(o);
	}

	/**
	 * Lit la valeur du sujet
	 *
	 * @return valeur du sujet
	 */
	@Override
	public T getValeur() {
		return valeur;
	}

	/**
	 * Change la valeur du sujet
	 *
	 * @param v la nouvelle valeur du sujet
	 */
	@Override
	public void setValeur(T v) {
		 valeur = v;
		 notifierAbonnés();
	}

	private void notifierAbonnés() {
		for(Observateur<T> o : abonnés) {
			o.faireMiseAJour(this);
		}
	}
}
