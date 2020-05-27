package com.github.egorovag.springHomeWork.Bean8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean82 implements InterfaceForBeans {
    @Value("name82")
    String name;
    @Override
    public void method() {
        System.out.println("Method Bean82 " +name);
    }
}
