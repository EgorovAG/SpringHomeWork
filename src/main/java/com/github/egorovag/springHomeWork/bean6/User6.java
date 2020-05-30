package com.github.egorovag.springHomeWork.bean6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User6 {
    private int id;
    private String login;
    private Client6 client;

    @Autowired
    public User6(@Value("3") int id, @Value("loginAlex") String login, Client6 client) {
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
