package fr.istic.nplouzeau.obs1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: plouzeau
 * Date: 2014-03-29
 * Time: 14:33
 */
public class SubjectImpl<T> implements Subject<T> {
	private List<Observer<T>> registeredObservers;
	private T value;

	public SubjectImpl() {
		registeredObservers = new ArrayList<>();
	}

    /******** Observers' management ********/

    /**
     * Registers an observer to the set of registered observers of this
     *
     * @param o the observer to add to the set
     * @throws IllegalArgumentException if o is null or already registered
     */
	@Override
	public void register(Observer<T> o) throws IllegalArgumentException {
		if (o == null) {
			throw new IllegalArgumentException("o is null");
		}
		if (registeredObservers.contains(o)) {
			throw new IllegalArgumentException("o is registered already");
		}
		registeredObservers.add(o);
	}

    /**
     * Removes an observer from the registered observers set in this
     *
     * @param o the observer to remove
     * @throws IllegalArgumentException if o is null or unregistered
     */
	@Override
	public void unregister(Observer<T> o) throws IllegalArgumentException {
		if (o == null) {
			throw new IllegalArgumentException("o is null");
		}
		if (!registeredObservers.contains(o)) {
			throw new IllegalArgumentException("o is not registered");
		}
		registeredObservers.remove(o);
	}

    /**
     * Checks whether an observer is registered
     *
     * @param o the observer to check
     * @return true iff o is already in the registered observers' set of this
     * @throws IllegalArgumentException if o is null
     */
    @Override
    public boolean isRegistered(Observer<T> o) {
        if (o == null) {
            throw new IllegalArgumentException("o is null");
        }
        return registeredObservers.contains(o);
    }

    /******** Value management ********/

    /**
     * Retrieves the subject's state value property
     *
     * @return subject's value property
     */
	@Override
	public T getValue() {
		return value;
	}



    /**
     * Updates the subject's value property
     *
     * @param v new value for subject's value
     */
	@Override
	public void setValue(T v) {
		value = v;
		notifyRegisteredObservers();
	}

	private void notifyRegisteredObservers() {
		for (Observer<T> o : registeredObservers) {
			o.doUpdate(this);
		}
	}
}
