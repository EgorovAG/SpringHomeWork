package com.github.egorovag.springHomeWork.bean8;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean81 implements InterfaceForBeans {
    @Value("name81")
    String name;
    @Override
    public void method() {
        System.out.println("Method Bean81 " + name);
    }
}
