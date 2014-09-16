package fr.istic.nplouzeau;

import java.util.Iterator;

/**
 * Created by plouzeau on 2014-06-03.
 */
public interface Configuration extends Part {
    Iterator<Processor> getProcessorIterator();
    Iterator<Memory> getMemoryIterator();
    PowerSupply getPowerSupply();
}
