package com.fideljose.SpringBootGenerateTools.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class BeforeAspectExample2 {

    static final Logger log = LoggerFactory.getLogger(BeforeAspectExample2.class);

    // aspecto se ejecuta dentro del paquete 'models', * cualquien clase,
    // * cualquien metodo, (..) cualquier cantidad de parametros
    //@Before("execution(* com.fideljose.SpringBootGenerateTools.models.*.*(..))")
    @Before("execution(* com.fideljose.SpringBootGenerateTools.aop.BeforeExample.*(..))")
    public void logBefore(){
        log.warn("Before Aspect 2");
    }
}
