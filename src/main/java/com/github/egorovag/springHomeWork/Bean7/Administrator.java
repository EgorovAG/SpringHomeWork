package com.github.egorovag.springHomeWork.Bean7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Administrator implements User {
    @Value("AdministratorName")
    String name;
    @Override
    public void registration() {
        System.out.println("User зарегистрирован");
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "name='" + name + '\'' +
                '}';
    }
}
