package com.colak.springbeanlifecycletutorial.beanpostprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor can be used to perform operations before a bean is initialized. This component is triggered for all beans
 * For example, you can use it to log bean creation.
 */
@Component
@Slf4j
public class BeanPostProcessorExample implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("Before Initialization: " + beanName);
        return bean;
    }
}
