package com.fideljose.SpringBootGenerateTools.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.format.TextStyle;

@Component
public class TestAOP {

    static final Logger log = LoggerFactory.getLogger(TestAOP.class);

    public void hello(String message){
        log.info("PRUEBA!!!");
    }
}
