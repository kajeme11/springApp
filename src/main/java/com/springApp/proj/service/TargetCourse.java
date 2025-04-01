package com.springApp.proj.service;

import com.springApp.proj.service.courses.Course;

public class TargetCourse {


    private Course course;

    public TargetCourse(){
        System.out.println("TargetCourse Bean has been created");
    }

    public TargetCourse(Course course){
        this.course = course;
    }

    boolean getCourse(){
        return course.purchasedCourse();
    }
}
