package fr.istic.nplouzeau;

import java.util.Iterator;

/**
 * Created by plouzeau on 2014-06-03.
 */
public interface Processor {
    Iterator<ProcessorCore> getCoreIterator();
    String getId();
}
