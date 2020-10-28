package com.fa.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Spring {
    public Spring(){
        System.out.println("javaConfig");
    }
    @Bean
    @Scope("prototype")
    public User user(){
        return new User();
    }
}
