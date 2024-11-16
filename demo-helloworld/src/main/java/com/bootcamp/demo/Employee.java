package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class Employee extends Perosn1 {
    private int salary;

    public Employee (String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    };
}
