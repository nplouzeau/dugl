package fr.istic.nplouzeau.noextensions;

import java.util.logging.Logger;

/**
 * Created by plouzeau on 2014-05-26.
 */
public final class  NoSubClasses {

    public void  doSomething() {
        Logger logger = Logger.getGlobal();
        logger.info("Try to subclass me!");
    };
}
