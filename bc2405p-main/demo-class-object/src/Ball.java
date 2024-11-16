public class Ball {
  private double weight;
  private String color; // char[]
  private int number;

  // constructors - empty constructor, all args constructor
  // by default, there is an empty constructor implicitly exists in the class.
  // public Ball() {

  // }

  // Custom empty constructor
  public Ball() {
    this.color = "RED";
  }

  public Ball(double weight, String color) {
    this.weight = weight;
    this.color = color;
  }

  public Ball(double weight, String color, int number) {
    // this.weight = weight;
    // this.color = color;
    this(weight, color); // call self constructor
    this.number = number;
  }
  // duplicated constructor
  // public Ball(double weight, String color) {

  // }

  // dummy (for test constructor only)
  public Ball(String color, double weight) {
    this.weight = weight;
    this.color = color;
  }

  // dummy (for test constructor only)
  public Ball(String color, String weight) {
    this.color = color;
  }

  // getter, setter
  public double getWeight() {
    return this.weight;
  }

  public String getColor() {
    return this.color;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // toString
  public String toString() {
    return "Ball(" //
        + "weight=" + this.weight //
        + ", color=" + this.color //
        + ")";
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(); // empty constructor to create a ball object
    System.out.println(b1.getColor()); // RED

    Ball b2 = new Ball(10.2, "BLACK"); // all arugments constructor
    System.out.println(b2.getColor()); // "BLACK"
    System.out.println(b2.getWeight()); // 10.2

    // After replacing the toString() method,
    // Ball@7344699f -> Ball(weight=10.2, color=BLACK)
    System.out.println(b2.toString()); // Ball@7344699f (object reference)
  }
}
