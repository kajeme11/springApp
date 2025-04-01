package com.springApp.proj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class ProjApplication {

	public static void main(String[] args) {

		//ApplicatioContext
		//BeanFactoty
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
//		SpringApplication.run(ProjApplication.class, args);

	}

}
