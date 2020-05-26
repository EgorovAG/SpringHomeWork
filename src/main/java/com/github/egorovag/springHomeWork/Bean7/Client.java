package com.github.egorovag.springHomeWork.Bean7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client implements User {
    @Value("ClientName")
    String name;
    @Override
    public void registration() {
        System.out.println("Client зарегистрирован");
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                '}';
    }
}
