package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// !!! Child Class should not use @Data, because we control the "callSuper" manually
@Getter
@Setter
@ToString(callSuper = true) // !!!
@EqualsAndHashCode(callSuper = true) // !!!!
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee extends Person1 {
  private int salary;

  public Employee (String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
  }

  public static void main(String[] args) {
    Employee employee = new Employee(10000);
    Employee e2 = new Employee("John", 23, 20000);
    Employee e3 = new Employee("Peter", 23, 20000);

    Employee e4 = new Employee("Peter", 23, 20000);

    System.out.println(e2.equals(e3)); // false
    System.out.println(e4.equals(e3)); // true

    System.out.println(e3); // includes Parent' attributes
    
  }

}
