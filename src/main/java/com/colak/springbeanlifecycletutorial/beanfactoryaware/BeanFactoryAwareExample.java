package com.colak.springbeanlifecycletutorial.beanfactoryaware;

import com.colak.springbeanlifecycletutorial.beannameaware.AnotherBean;
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

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        log.info("My BeanFactory is : {}", beanFactory);
    }

    public void doSomething() {
        // Use the beanFactory to get another bean
        AnotherBean anotherBean = beanFactory.getBean(AnotherBean.class);
        anotherBean.performTask();
    }
}
