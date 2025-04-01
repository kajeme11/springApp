package com.springApp.proj.service;

import com.springApp.proj.service.courses.Course;

public class TargetCourse {


    private Course course;

    public TargetCourse(){
        System.out.println("TargetCourse Bean has been created through constructor injection");
    }

    public TargetCourse(Course course){
        System.out.println("TargetCourse Bean has been created through constructor injection");
        this.course = course;
    }

    public void setCourse(Course course){
        System.out.println("Course setter called");
        this.course = course;
    }

    public boolean getCourse(){
        return course.purchasedCourse();
    }
}
