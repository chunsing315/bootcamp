package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTestPerClassTest {
    private int x;

    @BeforeAll
    void init() {
        System.out.println("Before all test cases...");
        this.x = 0; // Initialize x here
    }

    @Test
    public void test() {
        this.x++;
        assertEquals(1, this.x);
    }

    @Test
    public void test2() {
        this.x++;
        assertEquals(2, this.x);
    }

    @AfterAll
    void close() {
        System.out.println("After all test cases...");
    }

    // For reference only.
    public static void main(String[] args) {
        SolutionTestPerClassTest st1 = new SolutionTestPerClassTest();
        st1.init();
        st1.test();
        st1.test2();
        st1.close();
    }
}
