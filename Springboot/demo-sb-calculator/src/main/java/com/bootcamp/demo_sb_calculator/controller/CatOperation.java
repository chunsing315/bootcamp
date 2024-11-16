package com.bootcamp.demo_sb_calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.demo_sb_calculator.model.Cat;

import jakarta.websocket.server.PathParam;

public interface CatOperation {

    
    @GetMapping (value = "/cat")
    Cat getCat();

    // update resources (not Post, which is adding)
    @PutMapping (value = "/cat/{CatName}")
    Cat updateCatName(@PathVariable(value = "CatName") String newName);
}
