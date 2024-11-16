package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  // public Shape() {}

  // approach 1
  public static double area(List<Shape> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // approach 2: Generics
  // "<T extends Shape>" is to describe the parent relationship
  public static <T extends Shape> double area2(List<T> shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0);
    for (Shape shape : shapes) {
      bd = bd.add(BigDecimal.valueOf(shape.area()));
    }
    return bd.doubleValue();
  }

  // Question
  // List<Object> vs List<T>? difference?

  public static double area3(List<? extends Shape> shapes) {
    return -1.0;
  }


  public static void main(String[] args) {
    // Circle vs Shape -> Parent
    // List<Shape vs List<Circle> -> NOT Parent
    List<Shape> shapes = new LinkedList<Shape>();
    shapes.add(new Circle(3.0));
    shapes.add(new Circle(4.2));
    shapes.add(new Square(5.0));

    System.out.println(Shape.area(shapes)); // 108.69202829163208
    System.out.println(Shape.area2(shapes)); // 108.69202829163208

    // ArrayList<Square> object
    // ArrayList<Circle> object
    List<? extends Shape> shapes2 = new ArrayList<Circle>();
    shapes2 = new ArrayList<Square>();

    // shapes2.add(new Circle(3.4)); // NOT OK
    // shapes2.add(new Square(5.0)); // NOT OK
    // during compile-time, we do not know the actual type of object reference
    // by shape2

    // shapes2.add(new Object());

    List<? super Shape> shapes3 = new ArrayList<Object>();
    shapes3 = new ArrayList<Shape>();

    shapes3.add(new Circle(3.4));
    shapes3.add(new Square(3.4));
    // shapes3.add(new Bird()); // NOT OK?
    // during compile-time, we DO not know actual type of shapes3 

    // List<Object> objects = new ArrayList<Circle>(); // NOT OK (Parent)
    Object object = new Circle(2.4); // OK (Parent)

  }
}
