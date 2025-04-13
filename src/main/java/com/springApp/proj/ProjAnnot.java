package com.springApp.proj;


import com.springApp.proj.model.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjAnnot {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("appconfig2.xml");

        Password password = container.getBean(Password.class);

        System.out.println(password.aboutAlgo());




    }
}
