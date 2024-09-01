package shape;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
    abstract double area();

    //approach 1
    public static double area(List<Shape> shapes){
        BigDecimal bd = BigDecimal.valueOf(0.0);
        for (Shape shape:shapes){
            bd = bd.add(BigDecimal.valueOf(shape.area()));
        }
        return bd.doubleValue();
    }

    //apprach 2 : Generics
    public static <T extends Shape> double area2(List<T> shapes){ // completely the same as the above
        BigDecimal bd = BigDecimal.valueOf(0.0);
        for (Shape shape:shapes){
            bd = bd.add(BigDecimal.valueOf(shape.area()));
        }
        return bd.doubleValue();
    }

    public static double area3(List<? extends Shape> shapes){
        return -1.0;
    }

    public static void main(String[] args) {
        
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Circle(4.2));
        shapes.add(new Square(5.0));

        System.out.println(Shape.area(shapes));

        //List<? super Shape> shapes2 = new ArrayList<>(); // new
        //shapes2.add(new Shape()); //during compile time, we do not know actual type of object reference by shape2
        
        List <? super Shape> shapes3 = ArrayList<>();
        shapes3.add(new Circle(3.4));
        shapes3.add(new Circle(3.4));
        shapes3.add(new Circle(3.4));

    }   
    //public Shape(){}


}
