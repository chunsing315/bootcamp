import java.util.Scanner;

public class DemoObject {
  public static void main(String[] args) {
    // getClass()
    StringBuilder sb = new StringBuilder(); // java.lang.StringBuilder
    Scanner scanner = new Scanner(System.in); // java.util.Scanner

    Object object = new Object(); // Object is a super parent 萬能指針
    object = "abc";
    object = Double.valueOf(13);
    object = new Cat();

    // All Classes extends Object.class. Inherit all methods from Object.class
    System.out.println(new Cat().toString()); // I am a cat
    System.out.println(new Dog().toString()); // Dog@4554617c

    // Object.hashCode()
    Cat c1 = new Cat();
    System.out.println(c1.hashCode()); // generate an int value by object
                                       // reference -> 1956725890
    Cat c2 = new Cat();
    System.out.println(c2.hashCode()); // 356573597

    String x1 = new String("abc");
    System.out.println(x1.hashCode()); // 96354
    String x2 = new String("abc");
    System.out.println(x2.hashCode()); // 96354

    MiniCat mc = new MiniCat("John", "RED");
    MiniCat mc2 = new MiniCat("John", "RED");
    MiniCat mc3 = new MiniCat("Peter", "RED");
    System.out.println(mc.hashCode()); // 71832679
    System.out.println(mc2.hashCode()); // 71832679
    System.out.println(mc3.hashCode()); // -1907721274

    Object cat = new Cat();
    // cat (object reference) indeed pointing to cat object.
    // run() instance method can only be called by object declared by Cat.class
    // if the object reference is declared by Object.class, it cannot call run()
    // method
    // cat.run(); // compile error

    // downcast
    Cat cat2 = (Cat) cat; // Reason why compile error: Java compiler cannot guareete 
    cat2.run();

    // Cat.class inherit Object.class
    cat2.hashCode();
    cat2.equals(cat);
  
    // the difference between cat and cat2 object reference

  }

  // Java: Ensure Type Safty during compile time
  // public static Object sum(Object x, Object y) {
  // return x + y; // "+" operations -> String, Integer, int, Double, double,
  // etc...
  // }

  public static int length(String x) {
    return x.length();
  }

  // During compile time, Compiler cannot ensure the object in heap is a String
  // object
  // public static int length2(Object x) {
  // return x.length();
  // }
}
