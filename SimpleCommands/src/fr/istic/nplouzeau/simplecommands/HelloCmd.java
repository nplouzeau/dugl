package fr.istic.nplouzeau.simplecommands;

/**
 * Created by plouzeau on 2014-06-01.
 */
public class HelloCmd implements Command {

    private final GreetingsReceiver receiver;

    public HelloCmd(GreetingsReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.displayMessage("Hello");
    }
}
