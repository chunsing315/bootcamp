package com.bootcamp.demo_sb_calculator.service;

import org.springframework.stereotype.Service;

import com.bootcamp.demo_sb_calculator.model.Database;

@Service // Component -> bean
// this is stateless.
public class DatabaseService {
    // this method is supposed to be static, as it doesn't have any attribute
    // In the world of Spring, it implement another design to achieve the same
    // outcome.
    public String getString(int index) {
        return Database.getString(index);
    }

    public String addString(String newString) {
        return Database.addString(newString);
    }

    public String[] getStringsArray() {
        return Database.getStringsArray();
    }
    public int getSize(){
        return Database.size();
    };
}