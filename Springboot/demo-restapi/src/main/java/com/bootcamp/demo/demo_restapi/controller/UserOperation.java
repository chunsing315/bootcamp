package com.bootcamp.demo.demo_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.demo.demo_restapi.model.User;

public interface UserOperation {
    @GetMapping (value = "/users")
    User[] getUsers();

    @GetMapping (value = "/hello")
    String hello();
}
