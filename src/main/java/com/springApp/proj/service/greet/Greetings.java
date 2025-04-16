package com.springApp.proj.service.greet;


import com.springApp.proj.config.AppConfig;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class Greetings {

    @Autowired
    private LocalTime localTime;

    static {
        System.out.println("Static block in Greetings");
    }

    {
        System.out.println("non-static block in Greetings");
    }

    public Greetings(){
        LocalTime time = LocalTime.now();
        System.out.println("Local time: " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Constructor from Greetings!!!!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Post construct method!!");
    }
    public String greet(){

        return "Good Morning!";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean Destroyed!!");
    }
}
