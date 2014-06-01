package fr.istic.nplouzeau.simplecommands;

/**
 * Created by plouzeau on 2014-06-01.
 */

/**
 * A simple configuration client for the Greetings Command design pattern example
 */
public class GreetingsConfigurator {

    private GreetingsInvoker invoker;
    private GreetingsReceiver receiver;

    public static void main(String lineArgs[]) {

        GreetingsConfigurator client = new GreetingsConfigurator();
        client.run();

    }

    private void run() {
        invoker = new GreetingsInvoker();
        receiver = new GreetingsReceiver();
        configureCommands();
        invoker.runInvokerLoop();
    }

    private void configureCommands() {

        invoker.addCommand("Quit",new QuitCmd(invoker));
        invoker.addCommand("Hello",new HelloCmd(receiver));
    }
}
