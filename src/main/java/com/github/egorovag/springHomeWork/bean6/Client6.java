package com.github.egorovag.springHomeWork.bean6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Client6 {
    private String name;
    private String surname;

    public Client6(@Value("alex") String name, @Value("Ivanov") String surname) {
        this.name = name;
        this.surname = surname;
    }

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
