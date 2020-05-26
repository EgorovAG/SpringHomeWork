package com.github.egorovag.springHomeWork.Bean9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource(value = "propertiesFile.properties")
public class Client9 {

    private String name;
    private String surname;

    public Client9(@Value("${client.name}")String name, @Value("${client.surname}") String surname) {
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
