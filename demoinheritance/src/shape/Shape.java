package demoinheritance.src.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;


public abstract class Shape {
    // abstract class can create abstract instance method without implementation. 
    // Method without implementation -> abstact method
    public abstract double area();
    public static double circleArea(double r){
        return BigDecimal.valueOf(r)//
            .multiply(BigDecimal.valueOf(r))//
            .multiply(BigDecimal.valueOf(Math.PI))//
            .setScale(2,RoundingMode.HALF_UP).doubleValue();
    }

    public static double totalArea(Shape[] shapes){ //array of shape
    //....
        BigDecimal bd = BigDecimal.valueOf(0.0d);
        for (Shape s : shapes){ // there is no shape object, s is pointing to the square object and circle object. 
            bd=bd.add(BigDecimal.valueOf(s.area()));
        }
        return bd.doubleValue();
    }

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] //
        {new Circle(3.0d), new Square(3.0d), new Square(5.0d), new Circle(1.04d)};
        System.out.println(Shape.totalArea(shapes));

        StringBuilder sb = new StringBuilder("hello");
        sb.append("world"); //why not sb=sb.append("world"). because stringBuilder return this. 
/*         public StringHelper append(String s){ //this return an object form! so you can use the same method: chain method
        this.str += s;
        return this; //⭐️ return this
    }
 */
    }
}
