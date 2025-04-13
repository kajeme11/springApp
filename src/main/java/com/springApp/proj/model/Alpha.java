package com.springApp.proj.model;

import org.springframework.stereotype.Component;

@Component
//@Component("alcomp"), default bean will be alpha unless modified
public class Alpha {

    public Alpha(){
        System.out.println("Alpha bean created");
    }

}
