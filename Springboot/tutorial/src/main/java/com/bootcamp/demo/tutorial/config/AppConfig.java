package com.bootcamp.demo.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
// to make the class unique for the whole proj
public class AppConfig {
    //Call API

    @Bean //to make this object unique for the entire project
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
