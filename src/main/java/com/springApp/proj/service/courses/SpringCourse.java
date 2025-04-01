package com.springApp.proj.service.courses;

public class SpringCourse implements Course{

    public SpringCourse(){
        System.out.println("SpringCourse Bean has been created");
    }

    @Override
    public boolean purchasedCourse() {

        System.out.println("Purchased Spring Course!");

        return true;
    }
}
