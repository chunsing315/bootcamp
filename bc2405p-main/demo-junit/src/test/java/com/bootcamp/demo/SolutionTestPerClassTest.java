package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

// !!! This is "Per Class" testing environment
// It will use one object to call all test methods.
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // method ordering 
@TestMethodOrder(OrderAnnotation.class)
public class SolutionTestPerClassTest {
  private int x;

  @BeforeAll // !!! Before all test cases
  static void init() {
    System.out.println("Before all test cases ...");
  }

  @AfterAll // !!! After all test cases
  static void close() {
    System.out.println("After all test cases ...");
  }

  @Test
  @Order(2)
  void test() {
    System.out.println("test()");
    this.x++;
    assertEquals(2, this.x);
  }

  @Test
  @Order(1)
  void test2() {
    System.out.println("test2()");
    this.x++;
    assertEquals(1, this.x);
  }

  // For Reference Only.
  public static void main(String[] args) {
    SolutionTestPerClassTest.init();
    SolutionTestPerClassTest st1 = new SolutionTestPerClassTest();
    st1.test2(); // goes first
    st1.test();
    SolutionTestPerClassTest.close();
  }
}
