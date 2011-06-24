package cdi.logging;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Alexis Hassler
 */
public class LoggerInjectedTestGeneric {

    PrintStream stdErr;
    ByteArrayOutputStream stream ;

    @Before
    public void redirectStdErr() {
        stdErr = System.err;
        stream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(stream));
    }
    @After
    public void restoreStdErr() {
        System.setErr(stdErr);
    }
}
