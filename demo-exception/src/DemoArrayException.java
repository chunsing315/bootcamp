import java.util.ArrayList;
import java.util.List;

public class DemoArrayException {

    public static void main(String[] args) {
        String str = "hello";
        str.charAt(1);
        System.out.println(str.substring(0, str.length()));

        int result = Integer.parseInt("1");
        System.out.println(result);

        int result2;
        try {
            result2 = Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            result2 = -1;
            System.out.println("NumberFormatExeption! Message: " + e.getMessage());
        }

        System.out.println(getDescription(18));
        int age = -1;
        try {
            getDescription(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        strings2.get(0); // javalang.IndexOutOfBoundException


    }

    public static String getDescription(int age) {
        if (age < 0)
            throw new IllegalArgumentException("age should not be negative!");
        if (age >= 66)
            return "Elderly";
        if (age >= 18)
            return "Adult";
        return "Children";

    }
}
