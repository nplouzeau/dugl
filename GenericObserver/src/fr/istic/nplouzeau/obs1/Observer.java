package fr.istic.nplouzeau.obs1;

/**
 * Author: plouzeau
 * Date: 2014-03-28
 * Time: 17:15
 */
public interface Observer<T> {

	/**
	 * Signals to this that s's value has been updated
	 *
	 * @param s the updated subject
	 */
	void doUpdate(Subject<T> s);

}
