package cdi.logging;

import cdi.test.WeldRunner;
import logging.LoggerInjected;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

/**
 * @author Alexis Hassler
 */
@RunWith(WeldRunner.class)
public class LoggerInjectedTest {

    @Inject
    LoggerInjected loggerInjected;
    PrintStream stdErr;
    PrintStream stringErr;
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

    @Test
    public void testDoSomething() throws Exception {
        loggerInjected.doSomething();
        String expectedLog = loggerInjected.getClass().getName() + " - I'm doing something\n";
        assertTrue(stream.toString().endsWith(expectedLog));
    }
}
