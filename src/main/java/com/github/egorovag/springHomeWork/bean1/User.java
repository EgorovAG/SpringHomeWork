package com.github.egorovag.springHomeWork.bean1;

public class User {
    private int id;
    private String login;
    private Client client;

    public User(int id, String login, Client client) {
        this.id = id;
        this.login = login;
        this.client = client;
    }

    public void initU(){
        System.out.println("init method User");
    }

    public void destroyU(){
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
