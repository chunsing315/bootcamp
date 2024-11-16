package com.bootcamp.demo;

public abstract class IntegerOperationManager {
    private List<Integer> integers;

    public List<Integer> getIntegers() {
        return integers;
    }

    public IntegerOperationManager(List<Integer> integers) {
        this.integers = integers;
    }

    public int operate(){
        return integers;
    }
    
    
    
    
}
