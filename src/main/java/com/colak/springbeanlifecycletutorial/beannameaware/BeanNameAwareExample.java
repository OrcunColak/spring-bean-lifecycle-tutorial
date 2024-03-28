package com.colak.springbeanlifecycletutorial.beannameaware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * If a component implements BeanNameAware, it can get its own bean name from the Spring container.
 */
@Component
@Slf4j
public class BeanNameAwareExample implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        log.info("My Bean name is: " + name);
    }
}
