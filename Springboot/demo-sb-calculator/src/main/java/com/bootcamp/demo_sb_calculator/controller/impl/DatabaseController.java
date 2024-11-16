package com.bootcamp.demo_sb_calculator.controller.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.demo_sb_calculator.controller.DatabaseOperation;
import com.bootcamp.demo_sb_calculator.model.Database;
import com.bootcamp.demo_sb_calculator.service.DatabaseService;


// ! Normally controller layer autowired service layer
@Controller
@ResponseBody
public class DatabaseController implements DatabaseOperation {

    // autowired implies that, DatabaseController is depended on databaseService
    // @Autowired
    @Autowired
    private DatabaseService databaseService;

    // Task : get all strings from the array

    @Override
    public String getString(String index) {
        // boolean isValid = true;
        try {
            int idx = Integer.valueOf(index);
            if (idx < 0 || idx > Database.size() - 1) {
                // isValid = false;
            }
        } catch (NumberFormatException e) {
            return "<h2>Invalid index, please input an integer. </h2>" + e.getMessage();
        }
        try {
            return databaseService.getString(Integer.valueOf(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            return "<h2>Invalid index, out of range.</h2>" + e.getMessage();
        }
        // if (isValid) {
        // return databaseService.getString(Integer.valueOf(index));
        // } else {
        // return "<h2>Invalid index, out of range.</h2>";
        // }
    }

    @Override
    public String addString(String newString) {
        return databaseService.addString(newString);
    }

    @Override
    public List<String> getStringsArray() {

        // stream
        return Arrays.stream(databaseService.getStringsArray()).collect(Collectors.toList());
    }

    @Override
    public int getSize(){
        return databaseService.getSize();
    };
}
