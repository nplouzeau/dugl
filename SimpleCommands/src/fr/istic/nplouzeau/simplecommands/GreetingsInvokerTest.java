package fr.istic.nplouzeau.simplecommands;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

public class GreetingsInvokerImplTest {


    @Test
    public void testInvoker() throws Exception {

        GreetingsInvoker invoker = new GreetingsInvokerImpl();

        Command mockCmd = Mockito.mock(Command.class);

        // Setup a mock input stream
        String mockInput = "Sample\nQuit\n";
        InputStream mockReadStream = new ByteArrayInputStream(mockInput.getBytes());
        invoker.setReadStream(mockReadStream);

        invoker.addCommand("Sample", mockCmd);

        // Install a command to stop the invoker's loop
        {
            Command quitCmd;

            quitCmd = new Command() {

                @Override
                public void execute() {
                    invoker.stopLoop();
                    Logger.getGlobal().info("Invoker stopped by test case");
                }
            };
            invoker.addCommand("Quit", quitCmd);
        }

        invoker.runInvokerLoop();
        Mockito.verify(mockCmd).execute();
    }
}