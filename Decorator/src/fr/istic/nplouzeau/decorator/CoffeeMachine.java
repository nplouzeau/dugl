package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public interface CoffeeMachine {
    /**
     * Provides a recycled cup from garbage collector
     * @return   a shiny cup
     */
    Cup  provideCup();

    /**
     * Fills a cup to max capacity
     * @param cup
     */
    void pourCoffee(Cup cup);

}
