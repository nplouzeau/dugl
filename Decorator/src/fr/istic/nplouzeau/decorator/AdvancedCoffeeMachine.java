package fr.istic.nplouzeau.decorator;

/**
 * Created by plouzeau on 2014-09-17.
 */
public interface AdvancedCoffeeMachine extends CoffeeMachine {

    /**
     * Puts one piece of sugar in cup
     * @param cup   the sugar receptacle
     */
    public void putOneSugarPieceInCup(Cup cup);

}
