package com.github.egorovag.springHomeWork.bean5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Client5 {
    @Value("alex")
    private String name;
    @Value("Ivanov")
    private String surname;

    @PostConstruct
    public void init() {
        System.out.println("init method Client");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method Client");
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
