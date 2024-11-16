package com.bootcamp.demo.demo_sb_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {

    @GetMapping(value = "/")
    public String tryHTML(){

        System.out.println("this is log. Sysout is Log");
        return "<h1>Spring Boot App<h1>"
        + "<h2>h2 abc 123</h2>"
        + "<h3>h3 abc 123</h3>"
        + "<h4>h4 abc 123</h4>"
        + "<h5>h5 abc 123</h5>"
        + "<h6>h6 abc 123</h6>"
        + "<p>paragraph abc 123!!</p>";
    }
    
    @GetMapping(value = "/v1/hello")
    public String greeting(){
        return "<h1>Test HTML</h1><p>paragraph abc 123</p>";
    }
    @GetMapping(value = "/v2/meow")
    public String meow(){
        return "Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow"
        +"Meow";
    }
}
