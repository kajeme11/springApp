package com.springApp.proj.model;

public class Password {

    String algo;

    public Password(String algo){
        System.out.println("Password Bean created");
        this.algo = algo;
    }

    public String aboutAlgo(){
        return "Algo used is " + algo;
    }

}
