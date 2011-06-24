package cdi.logging;

import cdi.test.WeldRunner;
import logging.LoggerConstructorInjected;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertTrue;

/**
 * @author Alexis Hassler
 */
@RunWith(WeldRunner.class)
public class LoggerConstructorInjectedTest  extends LoggerInjectedTestGeneric {

    @Inject
    LoggerConstructorInjected loggerInjected;

    @Test
    public void testDoSomething() throws Exception {
        loggerInjected.doSomething();
        String expectedLog = loggerInjected.getClass().getName() + " - I'm doing something\n";
        assertTrue(stream.toString().endsWith(expectedLog));
    }
}
