package com.colak.springbeanlifecycletutorial.beanfactoryaware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * If a component implements BeanFactoryAware, it can get the bean factory that created it.
 */
@Component
@Slf4j
public class BeanFactoryAwareExample implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("My BeanFactory is : " + beanFactory);
    }
}
