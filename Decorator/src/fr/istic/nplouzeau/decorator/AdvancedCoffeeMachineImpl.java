package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public class AdvancedCoffeeMachineImpl extends CoffeeMachineDecorator implements AdvancedCoffeeMachine {

    public AdvancedCoffeeMachineImpl(CoffeeMachine coffeeMachine) {
            super(coffeeMachine);
    }
    /**
     * Puts one piece of sugar in cup
     *
     * @param cup the sugar receptacle
     */
    @Override
    public void putOneSugarPieceInCup(Cup cup) {
           // TODO
    }
}
