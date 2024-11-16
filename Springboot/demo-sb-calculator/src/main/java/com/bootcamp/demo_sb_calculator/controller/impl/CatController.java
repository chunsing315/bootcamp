package com.bootcamp.demo_sb_calculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.demo_sb_calculator.controller.CatOperation;
import com.bootcamp.demo_sb_calculator.model.Cat;

@Controller
@ResponseBody
public class CatController implements CatOperation {
    @Autowired
    @Qualifier(value = "John")
    private Cat cat;

    @Override
    public Cat getCat() {
        return this.cat;
    }

    @Override
    public Cat updateCatName(String newName) {
        this.cat.setName(newName);
        return cat;
    };
}
