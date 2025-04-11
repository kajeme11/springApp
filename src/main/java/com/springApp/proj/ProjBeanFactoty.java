package com.springApp.proj;

import com.springApp.proj.service.TargetCourse;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProjBeanFactoty {

    public static void main(String[] args) {

//        ApplicationContext container = new ClassPathXmlApplicationContext("appconfig.xml");
        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
        //can load more than 1 config file
        read.loadBeanDefinitions("appconfig.xml");
        read.loadBeanDefinitions("appconfig2.xml");


        TargetCourse r = container.getBean(TargetCourse.class);
        boolean gotCourse = r.getCourse();

        if(gotCourse){
            System.out.println("Got course");
        }else {
            System.out.println("Have not gotten course");
        }


    }
}
