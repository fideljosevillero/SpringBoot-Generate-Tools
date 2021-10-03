package com.fideljose.SpringBootGenerateTools.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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
    //@After("execution(* com.fideljose.SpringBootGenerateTools.aop.BeforeExample.*(..))")
    //@Before("execution(* com.fideljose.SpringBootGenerateTools.aop.BeforeExample.*(..))")
    @Before("ReUseJoinPoint_PointCut.reuseJoinPoint()")
    public void logBefore(JoinPoint joinPoint){
        log.warn("Info JoinPoint");
        for (Object obj : joinPoint.getArgs()) {
            log.warn("Arguments {}", (String)obj);
        }
        log.warn("kind {}", joinPoint.getKind());
        log.warn("target {}", joinPoint.getTarget());
        if(joinPoint.getTarget() instanceof  BeforeExample){
            log.warn("This is BeforeExample instance");
        }
        log.warn("Signature {}", joinPoint.getSignature());
        log.warn("Source Location {}", joinPoint.getSourceLocation());
        log.warn("This {}", joinPoint.getThis());
        log.warn("Before Aspect 2");

    }
}
