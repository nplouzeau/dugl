package fr.istic.nplouzeau.simplecommands;

/**
 * Created by plouzeau on 2014-06-01.
 */
public class QuitCmd implements Command {
    private final GreetingsInvokerImpl receiver;

    public QuitCmd(GreetingsInvokerImpl receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.stopLoop();
    }
}
