package com.bootcamp.demo;

import com.bootcamp.demo.Calculator.Calculator;

public class IntegerPocket {
    private List<Integer> integers;
    private IntegerOperationManager operationManager;
    private Calculator calculator;

    public IntegerPocket (IntegerOperationManager operationManger,Calculator calculator){
        this.integers = new ArrayList<>();
        this.operationManager = operationManger;
        this.calculator = calculator;
    }


    public int compute(int x , int y){
        return this.calculator.sum(x,y)+ this.calculator.subtract(x,y)+3
    }

    public void add (int integer) {
        this.integers.add(integer);
    }

    public int sum(){
        return this.operationManager.sum();
        IntegerPocket pocket  = new IntegerPocket (new IntegerOperationManager(),new Calculator());
        pocket.add(3);
        pocket.add(19);
        pocket.add(12);
        System.out.println(pocket.sum());
    }
}
