package logging;

import org.slf4j.Logger;

import javax.inject.Inject;

/**
 * @author Alexis Hassler
 */
public class LoggerConstructorInjected {

    final Logger logger;

    @Inject
    public LoggerConstructorInjected(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.info("I'm doing something");
    }
}
