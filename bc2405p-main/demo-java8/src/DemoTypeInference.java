import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {
  public static void main(String[] args) {
    // declaration
    int x;
    // value assignment
    x = 3;

    var y = 3; // compile time -> "int y = 3;" class file (byte code)
    // y = "hello";
    // y = 3.0;

    var z = "hello";
    // z = 3.0;

    var k = new Customer("John");
    k = new Customer("Mary");
    // k = 3;

    List<Customer> customers =
        Arrays.asList(new Customer("Benny"), new Customer("Alden"));
    for (var customer : customers) {

    }

    // NOT support
    // var age; // compiler force the initialization together with declaration
    int age2;

  }

  // Not support var for attribute
  // public static class Example {
  //   var x;
  // }

  // NOT Support

  // Polymorphism -> method signature is determined during compile time
  // public static int sum(var x, var y) {
  // return x + y;
  // }

  // public static var sum(int x, int y) {
  //   return x + y;
  // }




}
