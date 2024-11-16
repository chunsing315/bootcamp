import java.math.BigDecimal;

public class Calculator {

  private int x;
  private int y;

  // static method -> instance method ??!!
  public static int sum(int x, int y) {
    System.out.println("sum(int x, int y) is running ...");
    return x + y;
  }

  public static double sum(double x, double y) {
    System.out.println("sum(double x, double y) is running ...");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static double sum(float x, double y) {
    System.out.println("sum(float x, double y) is running ...");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }

  public int multiply() {
    return this.x * this.y;
  }

  public static void test(String[] args) {
    // basic for loop
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }

  public static void test2(String... args) { // String... -> String[] (they are
                                             // same type)
    // for-each
    for (String s : args) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {

    // sysout
    // static methods
    sum(1, 3); // 4
    Calculator.sum(2, 3); // 5

    Calculator c1 = new Calculator();
    c1.setX(2);
    c1.setY(3);

    c1.sum(); // 5
    c1.multiply(); // 6

    // Method Overloading
    sum(1, 2);
    // because you are passing int value, so "overloading" determine
    // "sum(int x, int y)" should be called.

    sum(1.0, 2.0); // 3.0
    // "sum(double x, double y)" is called.

    sum(1.0f, 2.0f); // 1.0f -> float value, 2.0f -> float value
    // upcast, promotion
    // "sum(float x, double y)" is called.

    // String.valueOf() -> overloading
    String.valueOf(10L); // "10"
    String.valueOf(new char[] {'a', 'b', 'c'}); // "abc"

    Calculator.test(new String[] {"abc", "ijk"});
    Calculator.test2(new String[] {"abc", "ijk"});
    Calculator.test2("abc", "ijk");

    // static
    Calculator.sum(3, 2); // static method
    Calculator x = new Calculator();
    x.setX(3); // instance method
    x.setY(2); // instance method
    System.out.println(x.sum()); // 5

    System.out.println(x.sum(3, 2)); // call static method
    // object reference is able to cal static method

    // Calculator.sum(); // instance method cannot be called by Class Name

    // Static method can be called by instance (object) or Class Name
    // Instance method can be called by instance (object) ONLY.


  }
}
