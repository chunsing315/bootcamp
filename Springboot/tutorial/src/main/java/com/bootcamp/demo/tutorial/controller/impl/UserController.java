package com.bootcamp.demo.tutorial.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo.tutorial.controller.UserOperator;
import com.bootcamp.demo.tutorial.model.User;
import com.bootcamp.demo.tutorial.service.UserService;

@RestController //@Controller + @ ResponseBody
public class UserController implements UserOperator{
    
    @Autowired
    UserService userService;

    @Override
    public List<User> getUser(){
        return userService.getUser();
    };   
}
