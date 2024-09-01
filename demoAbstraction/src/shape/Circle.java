package demoAbstraction.src.shape;

import java.math.BigDecimal;

public class Circle implements Shape{
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return BigDecimal.valueOf(Math.PI)//
        .multiply(BigDecimal.valueOf(radius)//
        .multiply(BigDecimal.valueOf(radius)))//
        .doubleValue();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    

    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        System.out.println(c1.area());
    }
}
