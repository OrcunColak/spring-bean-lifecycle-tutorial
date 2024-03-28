package com.colak.springbeanlifecycletutorial.predestroy;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * See <a href="https://medium.com/@lucaslazarinii/shutdown-routine-on-spring-application-9ea06af29156">...</a>
 * <p>
 * The @PreDestroy annotation is called before destroy() method
 */
@Component
@Slf4j
public class ShutdownRoutineExample implements DisposableBean {

    // If your bean needs to release resources before it is destroyed, you can do so in the destroy() method.
    @Override
    public void destroy() {
        log.info("DisposableBean::destroy is called");
    }

    //  You can specify a custom destroy method in your bean using the @PreDestroy annotation.
    //  This method will be called when the bean is being destroyed.
    @PreDestroy
    public void preDestroy() {
        log.info("preDestroy annotation is called");
    }
}
