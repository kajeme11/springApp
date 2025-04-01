package com.springApp.proj.service.courses;

public class JavaCourse implements Course{

    public JavaCourse(){
        System.out.println("JavaCourse Bean has been created");
    }

    @Override
    public boolean purchasedCourse() {
        System.out.println("Purchase Java course!");
        return true;
    }
}
