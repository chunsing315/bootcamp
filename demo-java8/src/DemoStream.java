import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        // List
        List<String> strings = new LinkedList<>();
        strings.add("Peter");
        strings.add("Tony");
        strings.add("Jenny");
        strings.add("Mo");

        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i).toUpperCase());
        }
        // Lambda for-each
        strings.forEach(s -> System.out.println(s)); // the s is determined by the generics in List<String>. It must be
                                                     // String

        List<String> lowCapNames = strings.stream() // List<String> -> Stream<String>. A brand new data structure
                .map(s -> s.toLowerCase()) // Stream<String>
                .collect(Collectors.toList()); // List<String> (new object)
        System.out.println(lowCapNames);
        System.out.println(strings); // new object without affecting the original variable

        Set<String> setNames = strings.stream().collect(Collectors.toSet());

        List<String> CapNames2 = lowCapNames.stream()//
                .map(s -> {
                    String newStr = s.toUpperCase() + s.toLowerCase();
                    return newStr + "!!!!";
                }).collect(Collectors.toList());

        System.out.println(CapNames2);
        lowCapNames.add("mo");
        lowCapNames.add("mo");
        lowCapNames.add("mo");
        lowCapNames.add("mo");
        System.out.println(lowCapNames);
        System.out.println(lowCapNames.stream().collect(Collectors.toSet()));

        // Another example

        List<Customer> customers = new LinkedList<>();
        customers.add(new Customer("john", 20));
        customers.add(new Customer("johnny", 23));
        customers.add(new Customer("johnnie", 21));
        customers.add(new Customer("Jacky", 26));

        List<Customer> customersAfterFilter = customers.stream()//
                .filter(customer -> customer.getAge() >= 25)//
                .collect(Collectors.toList());

        System.out.println(customersAfterFilter);

        List<String> names = customers.stream()//
                .filter(c -> c.getName().length() >= 5)
                .map(c -> c.getName())
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(customers);

        List<String> nameList = new ArrayList();
        for (Customer c : customers) {
            if (c.getName().length() >= 4) {
                nameList.add(c.getName());
            }
        }

        customers.stream()
                .map(c -> c.getName())
                .filter(str -> str.length() >= 5)
                .collect(Collectors.toList());

        System.out.println(customers);

        customers.stream()
                .filter(c -> c.getName().length() >= 4)
                .map(c -> c.getName().length() >= 4)
                .forEach(name -> {
                    System.out.println(name);
                    System.out.println(name);
                });

        customers.stream()//
                .filter(c -> c.getAge() < 40)//
                .count(); // return type is long

        customers.add(new Customer("Johnny", 88));
        /*
         * List<Customer> customersAfterDistinct = customers.stream()
         * .distinct()
         * .collect(Collectors.toList());
         * 
         * System.out.println(customersAfterDistinct);
         */

        // Lambda expression (Skip class implementing interface Comparator)
        Comparator<Customer> sortByAge = (c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1;

        List<String> customerAfterSort = customers.stream()//
                .filter(c -> c.getAge() < 40)
                .sorted((c1, c2) -> c1.getAge() > c2.getAge() ? -1 : 1)
                .map(c -> c.getName())
                .collect(Collectors.toList());

        System.out.println(customerAfterSort);

        // Terminal ops; intermediate ops (collect(), count()) -> return non-Stream type
        // Interminate Operation (filter(), map(), sorted(), distinct()) -> return
        // Stream<>
        Stream<Customer> customerList = customers.stream() // Stream<Customer>
                .filter(c -> !"john".equals(c.getName())); // Stream<Customer>

        System.out.println(customerList.count()); // 4
        /* System.out.println(customerList.collect(Collectors.toList())); //no good */
        // Stream has a state, it can only be terminate one

        // Map<K,V> animals<String name, Int length>
        List<String> animals = Arrays.asList("dog", "hamster", "Chiwawa");
        Map<String, Integer> animalMap = animals.stream()//
                // From List to Stream to Map
                .collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(animalMap); // {Chiwawa=7, hamster=7, dog=3}

        // groupBy
        List<Staff> staffs = Arrays.asList(new Staff("HR", "John")//
                , new Staff("IT", "Vincent")//
                , new Staff("MKT", "Sally")//
                , new Staff("IT", "Peter"));
        // Map<String,List<Staff>
        Map<String, List<Staff>> staffMap = staffs.stream()//
                .collect(Collectors.groupingBy(staff -> staff.getDepartment()));

        System.out.println(staffMap);

        // from list<Staff>
        // to Map<String,List<Staff>>
        // if contains => put list
        // if !contains => new Arraylist => add() -> put
        // get list

        List<Staff> staffList = Arrays.asList(new Staff("HR", "John", 10000)//
                , new Staff("IT", "Vincent", 20000)//
                , new Staff("MKT", "Sally", 30000)//
                , new Staff("IT", "Peter", 50000));

        Map<String, Integer> debMap = staffList.stream()//
                .collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors.summingInt(s -> s.getSalary())));
        System.out.println(debMap.get("IT"));
        System.out.println(debMap.get("MKT"));
        System.out.println(debMap.get("HR"));

        // Construct Stream object by initial value
        Stream<Integer> integers = Stream.of(4, 1, 2, 3);
        Stream<Staff> staff = Stream.empty();

        System.out.println(integers.collect(Collectors.toList()));
        System.out.println(staff.collect(Collectors.toList()));
        // Stream:
        // filter, distinct -> reduce elements
        // map, sort -> revise object definition(No change on element count)
        // count, groupingBy, summingInt -> summarize operation

        // Special Case

        List<Integer> integers1 = Stream.of(2, 3, 4).map(i -> i + 1)//
                .collect(Collectors.toList());
        System.out.println(integers1);

        Stream<Integer> integers2 = Stream.of(2, 3, 4).map(i -> { //note that map is an interminal operation
            System.out.println(i + "Never Execute");    // this will never execute until terminal operation. 
            return i + 1;                               // just like it is in another "Stream"
        });
        //System.out.println(integers2.collect(Collectors.toList()));


        //count (and other terminal operations) => observe interminate operations, check if they will make impact or not
        // finally map() won't execute, because it will not affect the result of count()
        System.out.println(integers2.count()); // 3? Yes.  But the system out was not execute!
        // it can only be terminated once, so if we chose to .count, we won't choose to .map again.
        
    }
}
