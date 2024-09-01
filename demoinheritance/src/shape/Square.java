package demoinheritance.src.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Shape {
    private double length;
    
    public Square(double length){
        this.length=length;
    }

    @Override
    public double area(){
        return BigDecimal.valueOf(this.length)//
        .multiply(BigDecimal.valueOf(this.length))//
        .setScale(2,RoundingMode.HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        Square s1 = new Square(3.9213d);
        System.out.println(s1.area());
    }
}
