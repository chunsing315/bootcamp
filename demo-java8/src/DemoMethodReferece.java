import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReferece {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 72, 2, 5, -5, 100);
        integers.stream()
                .forEach(e -> System.out.print(e + " "));
        System.out.println(" ");
        // example 1
        // Method reference : input = method parameter
        integers.stream().forEach(System.out::println);
        
        // example 2 : instance method
        String name = "abcd";
        Supplier<Integer> nameLength = () -> name.length();
        Supplier<Integer> nameLength2 = name::length;
        System.out.println("Lambda: "+nameLength.toString());
        System.out.println("Method reference: "+nameLength2.toString());

        //example 3 : two parameter instance method
        Comparator<Integer> sortByDesc = (i1,i2) -> i1.compareTo(i2);
        Comparator<Integer> sortByDesc2 = Integer::compareTo;

        // example 4 : constructor 
        Function<String,String> constructString = s -> new String(s);
        // Method Reference
        Function<String, String> constructString2 = String::valueOf;
        Function<String, String> constructString3 = String::new;
        String s = constructString3.apply("Hallo");
        String v = constructString2.apply("worlt");
        String u = constructString.apply("Meaow");
        System.out.println(s+u+v);



    }
}
