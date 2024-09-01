import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DemoMapLambda {
    public static void main(String[] args) {
        // Key, Value => Map
        // 1. Function 
        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("C1234", new Customer("John",10));
        customerMap.put("C1235", new Customer("Jonjon",24));

        if (customerMap.containsKey("C1236")) {
            System.out.println(customerMap.get("C1236").getName());
        }
        if (customerMap.containsKey("C1235")) {
            System.out.println(customerMap.get("C1235").getName());
        }

        Function<String, Customer> defaultCustomer = s -> new Customer("Dummy",0); // if your key is absent, it will call this function 
        customerMap.computeIfAbsent("C1236", defaultCustomer);
        customerMap.computeIfAbsent("C1236", defaultCustomer);

        for (Map.Entry<String,Customer> entry : customerMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // 2. merge -> Bifunction

        Map<String,Integer> map = new HashMap<>();
        map.put("Peter",10);
        map.put("Andy",60);
        map.put("Jacky",5);
        map.put("Jenny",2);
        
        map.put("Peter",map.get("Peter")+2);
        map.put("Andy",map.get("Andy")+2);
        map.put("Jacky",map.get("Jacky")+2);
        map.put("Jenny",map.get("Jenny")+2);

        for (Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //Lambda
        BiFunction<Integer,Integer,Integer> addValue = (oldValue,newValue) -> oldValue+newValue;
        map.merge("Peter",3,addValue);
        map.merge("Sue",100,addValue);
        map.merge("Sue",2,addValue);

        System.out.println(map.get("Peter"));
        if (map.containsKey("Sue")){
            System.out.println(map.get("Sue")); //even Sue is not there, we don't break the program
        }


        // Unary Operator 
        // UnaryOperator<String> = Function<String,String>
        UnaryOperator<String> nameFormula = s -> s + "!!!" ;  //limit the user to have the in and return to be the same
        System.out.println(nameFormula.apply("John"));

        //BinaryOperator
        BinaryOperator<String> nameFormula2 = (s1,s2) -> s1+s2;
        System.out.println(nameFormula2.apply("Hello ","World"));

    }
}
