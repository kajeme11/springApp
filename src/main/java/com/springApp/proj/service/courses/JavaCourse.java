package com.springApp.proj.service.courses;

public class JavaCourse implements Course{


    @Override
    public boolean purchasedCourse() {
        System.out.println("Purchase Java course!");
        return true;
    }
}
