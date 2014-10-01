package fr.istic.nplouzeau.decorator;

import java.util.logging.Logger;

/**
 * Created by plouzeau on 2014-09-17.
 */
public class BasicCoffeeMachine implements CoffeeMachine {
    /**
     * Provides a recycled cup from garbage collector
     *
     * @return a shiny cup
     */
    @Override
    public Cup provideCup() {

        return new BasicCup(10.0);
    }

    /**
     * Fills a cup to max capacity
     *
     * @param cup
     */
    @Override
    public void pourCoffee(Cup cup) {
        Logger.getGlobal().severe("Internal machine jam");
    }
}
