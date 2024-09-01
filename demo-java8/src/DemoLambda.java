import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.azul.tooling.ConsumerManager.Consumer;

public class DemoLambda {

    public static void main(String[] args) {
        Swimable p = new Swimable() { // without declaring the class of person.
            @Override
            public void swim() {
                System.out.println("I am swimming");
            }
        };
        p.swim(); // "I am swimming"

        // lambda expression
        // reason () -> "implementation" is that the interface contain 1 abstract method
        // only.
        Swimable person = () -> System.out.println("I am swimming"); // without even "new" anything!
        System.out.println(person.toString());
        person.swim();// "I am swimming"

        person = () -> System.out.println("Rough rough rough");
        System.out.println(person.toString());
        person.swim();

        Calculator sumCalculator = (a, b) -> a + b; // no return needed.
        System.out.println(sumCalculator.calcuate(10, 3));
        Calculator multiplyCalculator = (a, b) -> a * b; // no return needed.
        System.out.println(multiplyCalculator.calcuate(10, 3));

        // More than one line of implementation;
        // you have to use "return" with in the implementation block
        // if there is only one parameter, you can simply use "a"
        Drivable father = time -> {
            if (time == 12) {
                return false; // the implementation of Drivable
            }
            return true;
        };
        Drivable mother = (hour) -> {
            if (hour == 15) {
                return false; // the implementation of Drivable
            }
            return true;
        };
        System.out.println("Father drivable at 12? " + father.drive(12));
        System.out.println("Father drivable at 4? " + father.drive(4));
        System.out.println("mother drivable at 15? " + mother.drive(15));
        System.out.println("mother drivable at 4? " + mother.drive(4));

        // for loop
        List<String> strings = new LinkedList<>();
        strings.add("aac");
        strings.add("adf");
        strings.add("wer");
        strings.add("pqe");
        strings.add("pqsdf;ljl;jlkjlj;lkjlasdf");
        strings.add("pqef");
        strings.add("hkac");

        String t = "";
        for (String s : strings) {
            System.out.println(s);
            t += s;
        }
        ;
        System.out.println("==============" + t);

        // Lambda forEach
        // strings.forEach( s -> System.out.println(s)); //in the list interface, there
        // is forEach
        strings.forEach(s -> {

            if (s.length() > 3) {
                System.out.println(s);
            } else {
                System.out.println("too short");
                // all variable cannot be taken out.
                // t+=s; //local code block cannot touch variable beyond the block.
            }

        });

        // Example BiFunc: lambda expression
        // this style is determined at runtime. The object reference can point to
        // something else.
        BiFunction<String, String, Integer> nameLength2 = (fname, lname) -> fname.length() + lname.length();
        System.out.println(nameLength2.apply("Vincent", "Lau"));
        System.out.println(getNameLength("Vincent", "Lau"));

        // Consumer
        // Consumer<Customer> printCustomerName = customer ->
        // System.out.println(customer.getName());
        // printCustomerName.accept(new Customer("Jenny"));

        // BiConsumer<T,U>
        // void accept (T t,U u)
        // MathOperation operationo = MathOperation.MULTIPLY
        // int x=3;
        // switch (x){
        // case sum:
        // calculate = (num1, num2) -> System.out.println(sum(num1,num2));
        // }
        // (num1, num2) -> System.out.println(sum(num1,num2));
        // twoSum.accept(10,3);

        // generate random number
        // @FunctionalInterface
        // public interface Supplier<T> {
       //     T get();
        // }

        Supplier<Integer> randomInteger = () -> new Random().nextInt(49) + 1;
        List<Integer> marksix = new LinkedList<>();
        
        while (marksix.size() < 6) {
            int draw =  randomInteger.get(); 
            if (marksix.contains(draw))
              continue;
            marksix.add(draw);
        }
        // System.out.println(randomInteger.get());
        for (int i= 0; i < marksix.size();i++){
            System.out.println("marksix: "+marksix.get(i));
        }

        Predicate<Customer> isNameTooLong = customer -> customer.getName().length() > 5;
        System.out.println(isNameTooLong.test(new Customer("Vncent",2000)));     //true
        System.out.println(isNameTooLong.test(new Customer("Sam",100)));        //false

        BiPredicate<String,Integer> isBothThree = (fname,age) -> ((fname.length() == 3) && (age == 3)) ;
        System.out.println(isBothThree.test("Sam",3));

    };

    // Example BiFunc: traditional Java
    // static method it is not an object
    public static int getNameLength(String fName, String lName) {
        return fName.length() + lName.length();
    }

    public static int sum(int x, int y) {
        return x + y;
    }

}
