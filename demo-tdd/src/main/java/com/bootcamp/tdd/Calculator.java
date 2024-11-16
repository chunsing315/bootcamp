package com.bootcamp.tdd;
import java.util.List;

public class Calculator {
    private List<Integer> integers;
    
    public void calculator(){
    }

    public int sum(){
        return this.integers.stream().mapToInt(e -> e.intValue()).sum();
        if (integers.size)
    }
}

