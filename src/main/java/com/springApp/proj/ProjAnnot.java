package com.springApp.proj;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjAnnot {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appconfig2.xml");
    }
}
