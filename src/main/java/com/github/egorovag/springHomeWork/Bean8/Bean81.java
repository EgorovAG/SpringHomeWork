package com.github.egorovag.springHomeWork.Bean8;


import org.springframework.stereotype.Component;

@Component
public class Bean81 implements InterfaceForBeans {
    @Override
    public void method() {
        System.out.println("Method Bean81");
    }
}
