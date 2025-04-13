package com.springApp.proj;


import com.springApp.proj.config.AppConfig;
import com.springApp.proj.model.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjAnnot {
    public static void main(String[] args) {
//   Not needed if we use @ComponentScan in our configuration class
//        ApplicationContext container = new ClassPathXmlApplicationContext("appconfig2.xml");
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        Password password = container.getBean(Password.class);

        System.out.println(password.aboutAlgo());




    }
}
