package com.fideljose.SpringBootGenerateTools.lifeCycle;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

@Configuration
public class NameAware implements BeanNameAware {

    static final Logger log = LoggerFactory.getLogger(NameAware.class);

    @Override
    public void setBeanName(String name) {
        log.info("bean name {}", name);
    }

}
