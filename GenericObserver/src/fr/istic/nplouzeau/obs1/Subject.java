/**
 * Author: plouzeau
 * Date: 2014-03-28
 * Time: 17:14
 */
package fr.istic.nplouzeau.obs1;

public interface Subject<T> {

    /******** Observers' management ********/

    /**
     * Registers an observer to the set of registered observers of this
     *
     * @param o the observer to add to the set
     * @throws IllegalArgumentException if o is null or already registered
     */
    void register(Observer<T> o) throws IllegalArgumentException;

    /**
     * Removes an observer from the registered observers set in this
     *
     * @param o the observer to remove
     * @throws IllegalArgumentException if o is null or unregistered
     */
    void unregister(Observer<T> o) throws IllegalArgumentException;

    /**
     * Checks whether an observer is registered
     *
     * @param o the observer to check
     * @return true iff o is already in the registered observers' set of this
     * @throws IllegalArgumentException if o is null
     */
    boolean isRegistered(Observer<T> o);

    /******** Value management ********/

    /**
     * Retrieves the subject's state value property
     *
     * @return subject's value property
     */
    T getValue();


    /**
     * Updates the subject's value property
     *
     * @param v new value for subject's value
     */
    void setValue(T v);

}
