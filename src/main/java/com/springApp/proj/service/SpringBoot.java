package com.springApp.proj.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  // = @ComponentScan + @EnableAutoConfiguration
public class SpringBoot {
    public static void main(String[] args) {



//        SpringApplication.run(SpringBoot.class, args);
        ConfigurableApplicationContext container =  SpringApplication.run(SpringBoot.class, args);


        //IOC has 52 beans by default
        //In addition to beans created by developer or dependecies
        //Get the count of beans in the container
        System.out.println("There are " + container.getBeanDefinitionCount() + " beans in the spring container");
    }

}
