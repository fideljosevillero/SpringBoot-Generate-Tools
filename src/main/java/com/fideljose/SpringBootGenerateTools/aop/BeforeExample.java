package com.fideljose.SpringBootGenerateTools.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BeforeExample {

    static final Logger log = LoggerFactory.getLogger(BeforeExample.class);

    public void hello(String message){
        log.warn("message: {} ", message);
    }
}
