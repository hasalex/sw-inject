package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * User: Alexis Hassler
 */
public class LoggerProducer {

    @Produces
    public Logger getLogger(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getBean().getBeanClass());
    }
    
}
