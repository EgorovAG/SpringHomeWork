package com.github.egorovag.springHomeWork.bean11Aspect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("person")
public class PersonForAspect implements AbleToSpeakForAspect {

    @Value("Hello")
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("method init");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("method destroy");
    }

    @Profiling
    @Override
    public void say() {
        for (int i = 1; i < 5; i++) {
            System.out.println("message: " + message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Profiling
    @Override
    public void saySay() {
        System.out.println("55555");
    }
}
