package com.github.egorovag.springHomeWork.Bean4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User4 {
    @Value("4")
    private int id;
    @Value("loginAlex")
    private String login;
    @Autowired
    private Client4 client;

    @PostConstruct
    public void init() {
        System.out.println("init method User");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method User");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", client=" + client +
                '}';
    }
}
