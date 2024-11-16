package com.bootcamp.demo_sb_calculator.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bootcamp.demo_sb_calculator.model.Cat;

@Configuration
// part of component
public class AppConfig { // someone will new AppConfig()

    // ! @Configuration + @Bean is a pair
    // this object talks with the API instead of in the java program
    // This is in a differnet realm, other than the heap memory
    // The cat named "John" is in the SpringBean 

    @Bean(name = "John")  //it follows method name
    Cat createCat() {
        return new Cat("John");
    }

    @Bean(name = "Peter")  //it follows method name
    Cat createCat2() {
        return new Cat("Peter");
    }

}
