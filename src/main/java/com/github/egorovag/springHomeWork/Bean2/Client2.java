package com.github.egorovag.springHomeWork.Bean2;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Client2 {
    private String name;
    private String surname;

    public Client2(String name, String surname) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
