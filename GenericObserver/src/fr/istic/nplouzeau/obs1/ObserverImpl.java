package fr.istic.nplouzeau.obs1;

/**
 * Author: plouzeau
 * Date: 2014-03-30
 * Time: 11:12
 */
public class ObserverImpl<T> implements Observer<T> {
    /**
     * Signals to this that s's value has been updated
     *
     * @param s the updated subject
     */
	@Override
	public void doUpdate(Subject<T> s) {
         // TODO Your implementation goes here
	}
}
