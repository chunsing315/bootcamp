package com.bootcamp.demo_helloworld.controller.impl;

import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_helloworld.controller.HelloWorldController;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController {

    @Override
    public String HelloWorld(){
        return "Hello World!";
    }
}
