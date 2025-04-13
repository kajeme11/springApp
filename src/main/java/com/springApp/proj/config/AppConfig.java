package com.springApp.proj.config;

import com.springApp.proj.model.Password;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public AppConfig(){
        System.out.println("App Configuration");
    }

/*
    Tell Spring Framework that this object
    that has been hardcoded  created manually,
    but to consider this object as a bean

 */
    @Bean
    public Password createPassword(){
        return new Password("SHA");
    }

}
