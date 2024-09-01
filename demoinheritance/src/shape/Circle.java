package demoinheritance.src.shape;

import java.math.BigDecimal;

public class Circle extends Shape{ //why extend shape??
//public final class Circle extends Shape{ //why extend shape??
//"final" class cannot be extended
    public double radius; 

    public Circle(double radius){
        this.radius=radius;
    }    

    public double getRadius(){
        return this.radius;
    }
    @Override
    //1. the parent class has the same method
    //2. compiler would check if the parent class has the same method.
    //3. abstract method is not allowed by normal class public abstract double area(){
    public final double area(){  //final increase readability. narrow the program
        return BigDecimal.valueOf(this.radius)//
        .multiply(BigDecimal.valueOf(this.radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
    }
    //@Override
    //this method is its only, not from super class. no need override.
    public void sleep(){
        System.out.println("the circle is sleeping...");
    }

    

    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        System.out.println(c1.area());
        System.out.println(Shape.circleArea(3.0d));
    }
}
