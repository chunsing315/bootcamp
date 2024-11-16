package com.bootcamp.demo.tutorial.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.demo.tutorial.model.User;

public interface UserOperator {
    @GetMapping(value = "/users")
    List<User> getUser();
}
