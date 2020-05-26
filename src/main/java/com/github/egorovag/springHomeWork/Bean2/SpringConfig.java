package com.github.egorovag.springHomeWork.Bean2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.github.egorovag.springHomeWork.Bean2")
public class SpringConfig {
    @Bean
    public Client2 client2Bean() {
        return new Client2("Alex", "Ivanov");
    }

    @Bean
    public User2 user2Bean() {
        return new User2(2, "alexLogin", client2Bean());
    }
}
