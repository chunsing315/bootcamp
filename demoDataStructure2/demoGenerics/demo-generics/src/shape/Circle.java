package shape;

import java.math.BigDecimal;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {//extend wont inherit constructor
        super(); //this is by default
        this.radius = radius;
    }
    @Override
    public double area(){
        return BigDecimal.valueOf(Math.pow((radius),2)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    }
}
