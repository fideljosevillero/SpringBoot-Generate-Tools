package com.fideljose.SpringBootGenerateTools.aop;

import org.aspectj.lang.annotation.Pointcut;

public class ReUseJoinPoint_PointCut {
    //@Pointcut("execution(* com.fideljose.SpringBootGenerateTools.aop.BeforeExample.*(..))")
    @Pointcut("within(com.fideljose.SpringBootGenerateTools.aop.*)")
    public void reuseJoinPoint(){}
}
