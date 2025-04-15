package com.springApp.proj.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // = @ComponentScan + @EnableAutoConfiguration
public class SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }

}
