package fr.istic.nplouzeau.simplecommands;

import java.util.logging.Logger;

/**
 * Created by plouzeau on 2014-06-01.
 */
public class GreetingsReceiver {

    public void displayMessage(String msg) {
        Logger.getGlobal().info(msg);
    }
}
