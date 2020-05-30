package com.github.egorovag.springHomeWork.bean2;


public class Client2 {
    private String name;
    private String surname;

    public Client2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void init() {
        System.out.println("init method Client");
    }

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
