package com.bootcamp.demo_helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloWorldController {
    @GetMapping(value = "/hello")
    String HelloWorld();
}
