package shape;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    // super(); // new Shape object
    this.radius = radius;
  }

  @Override
  public double area() {
    return this.radius * this.radius * Math.PI; // skip bigdecimal
  }
}
