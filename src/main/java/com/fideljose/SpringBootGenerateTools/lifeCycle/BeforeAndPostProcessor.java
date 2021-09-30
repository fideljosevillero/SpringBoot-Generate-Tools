package com.fideljose.SpringBootGenerateTools.lifeCycle;

import com.fideljose.SpringBootGenerateTools.models.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeforeAndPostProcessor implements BeanPostProcessor {

    static final Logger log = LoggerFactory.getLogger(NameAware.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("BEFORE initialization bean {}", beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("AFTER initialization bean {}", beanName);
        return bean;
    }
}
