package fr.istic.nplouzeau.simplecommands;

/**
 * Created by plouzeau on 2014-06-01.
 */

/**
 * Defines a common interface for concrete commands.
 */
public interface Command {
    /**
     * Calls an appropriate operation on an appropriate receiver.
     * 'Appropriates' are defined in concrete implementation of Command.
     */
    public void execute();
}
