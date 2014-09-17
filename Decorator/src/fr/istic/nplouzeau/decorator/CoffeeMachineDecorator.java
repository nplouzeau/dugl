package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public class CoffeeMachineDecorator implements CoffeeMachine {

    private final CoffeeMachine coffeeMachineDelegate;

    public CoffeeMachineDecorator(CoffeeMachine coffeeMachineDelegate) {
        this.coffeeMachineDelegate = coffeeMachineDelegate;
    }

    /**
     * Provides a recycled cup from garbage collector
     *
     * @return a shiny cup
     */
    @Override
    public Cup provideCup() {
        return coffeeMachineDelegate.provideCup();
    }

    /**
     * Fills a cup to max capacity
     *
     * @param cup
     */
    @Override
    public void pourCoffee(Cup cup) {
         coffeeMachineDelegate.pourCoffee(cup);
    }
}
