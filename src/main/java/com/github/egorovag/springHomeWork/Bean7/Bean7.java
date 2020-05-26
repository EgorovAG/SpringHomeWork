package com.github.egorovag.springHomeWork.Bean7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bean7 {
    @Autowired
    @Qualifier("client")
    private User userClient;

    @Autowired
    @Qualifier("administrator")
    private User userAdministrator;

    public User getUserClient() {
        return userClient;
    }

    public User getUserAdministrator() {
        return userAdministrator;
    }

    @Override
    public String toString() {
        return "Bean7{" +
                "userClient=" + userClient +
                ", userAdministrator=" + userAdministrator +
                '}';
    }

}
