package com.bootcamp.demo_sb_list.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping(value = "api/v1")
public class helloWorldController {
    @GetMapping(value = "/hello")
    public String getHello() {
        return "hello world";
    }
}
