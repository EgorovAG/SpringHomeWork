package com.github.egorovag.springHomeWork.bean9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@PropertySource(value = "propertiesFile.properties")
public class User9 {

    private int id;
    private String login;
    private Client9 client;

    @Autowired
    public User9(@Value("${user.id}") int id, @Value("${user.login}") String login, Client9 client) {
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
