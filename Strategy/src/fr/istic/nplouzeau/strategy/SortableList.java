package fr.istic.nplouzeau.strategy;

/**
 * Created by plouzeau on 2014-09-17.
 */
public interface SortableList extends SimpleList {

    // Returns a sorted copy of {@code this}
    public SortableList sort();
}
