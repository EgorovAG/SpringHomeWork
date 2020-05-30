package com.github.egorovag.springHomeWork.bean11Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectWork {

    @Pointcut("@annotation(Profiling) ")
    public void performance(){

    }

    @Around("performance()")
    public void aroundWorkProblems(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Start");
            System.out.println("Begin time: " + System.currentTimeMillis());
            joinPoint.proceed();
            System.out.println("Finish time: " + System.currentTimeMillis());
        } catch (Throwable t) {
            System.out.println(t);
        }
    }
}
