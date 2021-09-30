package com.fideljose.SpringBootGenerateTools.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAspectExample {

    static final Logger log = LoggerFactory.getLogger(BeforeAspectExample.class);

    // aspecto se ejecuta dentro del paquete 'models', * cualquien clase,
    // * cualquien metodo, (..) cualquier cantidad de parametros
    //@Before("execution(* com.fideljose.SpringBootGenerateTools.models.*.*(..))")
    @Before("execution(* com.fideljose.SpringBootGenerateTools.aop.TestAOP.*(..))")
    public void logBefore(){
        log.error("Before Aspect!!!");
    }
}
