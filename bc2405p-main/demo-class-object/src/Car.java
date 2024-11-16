public class Car {
  private static int count = 0;
  private int id;
  private String color;

  // Constructor can access static variable
  public Car(String color) {
    this.id = ++count;
    this.color = color;
  }

  public int getId() {
    return this.id;
  }

  public static void main(String[] args) {
    Car c1 = new Car("RED");
    Car c2 = new Car("YELLOW");
    Car c3 = new Car("BLACK");

    System.out.println(c3.getId()); // 3
  }
 
}
