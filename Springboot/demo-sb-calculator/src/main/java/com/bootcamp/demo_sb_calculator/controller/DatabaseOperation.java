package com.bootcamp.demo_sb_calculator.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface DatabaseOperation {

    // Read Operation
    @GetMapping(value = "/database/strings/{index}") // do not write or delete here!
    String getString(@PathVariable String index);

    // WRite Operation (Create new resources, e.g. call another API )
    @PostMapping(value = "/database/strings/{newString}")
    String addString(@PathVariable String newString);

    @GetMapping(value = "/database/getStringsArray")
    List<String> getStringsArray();

    @GetMapping(value = "/database/strings/size")
    int getSize();



}
