package fr.istic.nplouzeau.observabletest;

/**
 * Created by plouzeau on 2014-06-02.
 */

import java.util.Observable;

/**
 * Tries to use the Observable class for the JDK
 */
public class SimpleObservable extends Observable{

    private int value;

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers();
    }
}
