package com.springApp.proj.service.courses;

public class SpringCourse implements Course{
    @Override
    public boolean purchasedCourse() {

        System.out.println("Purchased Spring Course!");

        return true;
    }
}
