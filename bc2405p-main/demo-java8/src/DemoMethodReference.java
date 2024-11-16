import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    // Example 1 - static method
    List<Integer> integers = Arrays.asList(3, 7 - 5, 100);
    // Lambda
    integers.stream().forEach(e -> System.out.println(e));
    // Method reference : input = method parameter
    integers.stream().forEach(System.out::println);

    // Lambda
    integers.stream().forEach(e -> System.out.println(e + 10));
    // Method reference cannot perform the above.

    // Example 2 - instance method
    String name = "vincent";
    // Lambda
    Supplier<Integer> nameLength = () -> name.length();
    // Method Reference
    Supplier<Integer> nameLength2 = name::length;

    // Example 3 - instance method (2 parameters)
    // Lambda
    Comparator<Integer> sortByDesc = (i1, i2) -> i1.compareTo(i2);
    // Method Reference
    Comparator<Integer> sortByDesc2 = Integer::compareTo; // i1.compareTo(i2)

    // Example 4 - constructor
    // Lambda
    Function<String, String> constructString = s -> new String(s);
    // Method Reference
    Function<String, String> constructString2 = String::valueOf;
    Function<String, String> constructString3 = String::new;
    String s = constructString3.apply("hello");
  }
}
