package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IntegerPocketTest {

    // !!! inject a fake object, whiou
    @Mock
    private IntegerOperationManager operationManager;

    @Test
    void testSum(){
        // assumption
        Mockito.when(operationManager.sum().thenReturn(999))
        // test
        new IntergerPocket int
    }
    @Spy
    // !!! inject a real object (all instance method WITH actual implimentations)
    private Calculator calculator;


    @Test
    void testCalculator(){
        Mockito.when(this.calculator.sum(2,3)).thenReturn(20);
        int result = this.integerPocket.compute(3,2);
        assertEquals(24, result);
    }
    @Test
    void testCalculator2(){
        Mockito.when(this.calculator.subtract(2,3)).thenReturn(50);
        int result = this.integerPocket.compute(3,2);
        assertEquals(58, result); //50+3+2+3
    }
    @Test
    void testCalculator3(){
        Mockito.when(this.calculator.sum(2,3)).thenReturn(99);
        Mockito.when(this.calculator.substract(2,3)).thenReturn(1);
        int result = this.integerPocket.compute(3,2);
        assertEquals(103, result); //99+1+3
    }
}
