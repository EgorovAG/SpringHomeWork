package com.github.egorovag.springHomeWork.Bean3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User3 {
    private int id;
    private String login;
    private Client3 client;

    @Autowired
    public User3(@Value("3") int id, @Value("loginAlex") String login, Client3 client) {
        this.id = id;
        this.login = login;
        this.client = client;
    }

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
