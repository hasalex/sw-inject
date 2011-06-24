package org.sewatech.spring.logging;

import org.slf4j.Logger;

import javax.inject.Named;

/**
 * @author Alexis Hassler
 */
@Named
public class LoggerInjected {

    @Logging
    static Logger logger;

    public void doSomething() {
        logger.info("I'm doing something");
    }
}
