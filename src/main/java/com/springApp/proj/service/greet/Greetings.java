package com.springApp.proj.service.greet;


import org.springframework.stereotype.Service;

@Service
public class Greetings {

    static {
        System.out.println("Static block in Greetings");
    }

    {
        System.out.println("non-static block in Greetings");
    }

    public Greetings(){
        System.out.println("Constructor from Greetings!!!!");
    }

    public String greet(){
        return "Good Morning!";
    }
}
