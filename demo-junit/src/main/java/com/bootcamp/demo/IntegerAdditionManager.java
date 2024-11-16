package com.bootcamp.demo;

public class IntegerAdditionManager extends IntegerOperationManager {
    
    public IntegerAdditionManager(List<Integer> integers) {
        super(integers);
    }

    @Override
    public int operate(){
        int total = 0;
        for (Integer integer : super.getIntegers()){
            total += integer;
        }
    }    
}
