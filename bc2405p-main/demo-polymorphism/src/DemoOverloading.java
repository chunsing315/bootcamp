public class DemoOverloading {
  private int a;
  private int b;

  public DemoOverloading() {
    // this.a = 100;
    // this.b = 100;

    // Alternative (Overloading)
    this(100.2, 100.2); // DemoOverloading(double a, double b)
  }

  public DemoOverloading(double a) {
    // this.a = (int) a;
    // this.b = 100;

    // Alternative (Overloading)
    this(a, 100.2); // DemoOverloading(double a, double b)
  }

  public DemoOverloading(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public DemoOverloading(double a, double b) {
    this.a = (int) a;
    this.b = (int) b;
  }

  // Method Signature = method name + parameter(s)

  public static int sum(int x, int y) {
    return x + y;
  }

  // public static double sum(int x, int y) { // Duplicate method, even if
  // different return type
  // return x + y;
  // }

  public static double sum(double x, double y) {
    return x + y;
  }

  public static long sum(int x, long y) {
    return x + y;
  }

  public static long sum(long x, int y) {
    return x + y;
  }

  public static void sum(Object x, Object y) {
    System.out.println("calling void sum(Object x, Object y)");
  }

  public static void sum(Animal x, Animal y) {
    System.out.println("calling void sum(Animal x, Animal y)");
  }

  public static void main(String[] args) {
    // Purpose of Overloading:
    // The design of overloading for methods is to let user (method user) easier
    // to use.
    // Overloading is designed and checked during compile-time

    // Example 1:
    String a = String.valueOf(true); // "true"
    String b = String.valueOf(2.0d); // "2.0"
    char[] arr = new char[] {'c', 'b', 'a'};
    System.out.println(String.valueOf(arr)); // "cba"

    // Example 2:
    System.out.println(sum(1, 2)); // 3
    System.out.println(sum(1.0, 2.0)); // 3.0

    System.out.println(sum((byte) 3, (short) 9)); // 12, sum(int x, int y)

    sum("abc", "bcd"); // calling void sum(Object x, Object y)
    System.out.println(sum(10L, 12L)); // 22.0, long primitive -> double

    sum(new Cat(), new Dog()); // calling void sum(Animal x, Animal y)

    // What if the methed parameters are with type of Wrapper Class?
    // You try it out.
  }
}
