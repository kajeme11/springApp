package com.springApp.proj;


import com.springApp.proj.service.TargetCourse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class ProjApplication {

	public static void main(String[] args) {

		//ApplicatioContext, eager initialization
		//BeanFactoty, Lazy initialization
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
//		SpringApplication.run(ProjApplication.class, args);
		//get the bean created in xml configuration
		TargetCourse r = container.getBean(TargetCourse.class);
		boolean gotCourse = r.getCourse();

		if(gotCourse){
			System.out.println("Got course");
		}else {
			System.out.println("Have not gotten course");
		}

	}

}
