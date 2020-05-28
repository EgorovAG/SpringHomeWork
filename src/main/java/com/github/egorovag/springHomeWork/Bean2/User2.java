package com.github.egorovag.springHomeWork.Bean2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User2 {
    private int id;
    private String login;
    private Client2 client;

    public User2(int id, String login, Client2 client) {
        this.id = id;
        this.login = login;
        this.client = client;
    }

    public void init() {
        System.out.println("init method User");
    }

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
