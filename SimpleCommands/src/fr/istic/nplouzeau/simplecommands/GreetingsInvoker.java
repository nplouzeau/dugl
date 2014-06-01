package fr.istic.nplouzeau.simplecommands;

/**
 * Created by plouzeau on 2014-06-01.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * A simple example of invoker for the Command design pattern.
 */
public class GreetingsInvoker {
    private HashMap<String, Command> commands = new HashMap<>();
    private boolean stopLoop = false;
    private InputStream inputStream;
    private BufferedReader bufferedReader;

    public void runInvokerLoop() {
        while (!stopLoop) {
            String userInput = null;
            try {
                userInput = readUserInput();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(userInput == null) {
                stopLoop = true;
            }
            Command cmdToExecute = commands.get(userInput);
            if (cmdToExecute != null) {
                cmdToExecute.execute();
            }
        }
    }

    public void stopLoop() {
        stopLoop = true;
    }

    private String readUserInput() throws IOException {
        return bufferedReader.readLine();
    }

    /**
     * Registers a new keyword/command pair
     *
     * @param keyword a non-null String
     * @param cmd     a non-null Command reference
     * @throws java.lang.IllegalArgumentException
     */
    public void addCommand(String keyword, Command cmd) {
        if ((keyword == null) || (cmd == null)) {
            throw new IllegalArgumentException("null parameter");
        }
        commands.put(keyword,cmd);
    }

    public void setReadStream(InputStream inputStream) {
        if(inputStream == null) {
            throw new IllegalArgumentException("null inputStream");
        }
        this.inputStream = inputStream;
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    }
}
