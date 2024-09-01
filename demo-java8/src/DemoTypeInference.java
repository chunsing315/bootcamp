import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {
    public static void main(String[] args) {
        int x = 3; //what happens in compile time? declare int x; initialize x =3;
        //delcaration 
        //int x;
        //value assign
        //x = 3;

        var y =3 ; // somthing in java 9 or 10;
        var z = "hello";
        List<Integer> intList = Arrays.asList(y,2,3,4,5);
        System.out.println(intList);

        var k = new Customer("John",12);
        k = new Customer ("Jenny",56);
        System.out.println(k);

        List<Customer> cusomters = Arrays.asList(new Customer("Benny",39), new Customer("Amy",34));
        for (var customer:cusomters){System.out.println(customer.getName());};

        //var age; // must initialise var
        int age2;
    }

    // Polymorphism -> method signature is determined in compile time 
    // we can overload because of it
    // so var is not applicable here. Should not be allowed
    
    // public static int sum(var x, var y){ //no good
    //     return x+y;
    // }

    // public static var sum(int x, int y){ //no good
    //     return x+y;
    // }

    public static class Example{
    //    var x;
     // var for attribute is not supported
    }

    
}
