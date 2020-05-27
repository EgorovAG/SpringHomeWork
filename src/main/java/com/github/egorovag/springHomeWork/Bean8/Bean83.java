package com.github.egorovag.springHomeWork.Bean8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean83 implements InterfaceForBeans {
    @Value("name83")
    String name;
    @Override
    public void method() {
        System.out.println("Method Bean83 " +name);
    }

}
