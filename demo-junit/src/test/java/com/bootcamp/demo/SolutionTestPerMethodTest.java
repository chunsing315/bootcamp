package com.bootcamp.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SolutionTestPerMethodTest {
    private int x;

    @BeforeAll
    static void init() { //
        System.out.println("Before all test case...");
    };

    @AfterAll
    static void close() {
        System.out.println("After all test case...");
    };

    @Test
    public void test() {
        this.x++;
        assertEquals(1, this.x);
    }

    @Test
    public void test2() {
        this.x++;
        assertEquals(1, this.x);
    }

    public static void main(String[] args) {
        SolutionTestPerMethodTest st1 = new SolutionTestPerMethodTest();
        st1.test();
        SolutionTestPerMethodTest st2 = new SolutionTestPerMethodTest();
        st2.test2();
    }
}
