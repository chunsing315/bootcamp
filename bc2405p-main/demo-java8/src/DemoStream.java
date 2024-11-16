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
    List<String> strings = new LinkedList<>();
    strings.add("John");
    strings.add("Jenny");
    strings.add("Sam");

    // lambda for-each
    strings.forEach(s -> System.out.println(s));

    // for loop
    for (int i = 0; i < strings.size(); i++) {
      strings.set(i, strings.get(i).toLowerCase());
    }
    System.out.println(strings); // [john, jenny, sam]

    List<String> capNames = strings.stream() // List<String> -> new
                                             // Stream<String>
        .map(s -> {
          if ("john".equals(s)) {
            return s.toUpperCase();
          }
          return s;
        }) // Stream<String>
        .collect(Collectors.toList()); // List<String> (new object)

    System.out.println(strings); // [john, jenny, sam]
    System.out.println(capNames); // [JOHN, jenny, sam]

    capNames.add("SAM");
    capNames.add("sam");
    System.out.println(capNames); // [JOHN, jenny, sam, SAM, sam]

    Set<String> capNames2 = capNames.stream() //
        .map(s -> {
          String newStr = s.toLowerCase() + s.toUpperCase();
          return newStr + "!!!!";
        }).collect(Collectors.toSet());

    System.out.println(capNames2); // [johnJOHN!!!!, jennyJENNY!!!!, samSAM!!!!]

    // Another Example
    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer("john", 20));
    customers.add(new Customer("benny", 35));
    customers.add(new Customer("kit", 43));

    // filter age 25 or above
    List<Customer> customersAfterFilter = customers.stream() // Stream<Customer>
        .filter(customer -> customer.getAge() >= 25) // Stream<Customer>
        .collect(Collectors.toList());

    System.out.println(customersAfterFilter);
    // [Customer(name=benny, age=35), Customer(name=kit, age=43)]

    // filter name length >= 4
    // and return List<String>
    List<String> names = customers.stream() // Stream<Customer>
        .filter(c -> c.getName().length() >= 4) // Stream<Customer>
        .map(c -> c.getName()) // Stream<String>
        .collect(Collectors.toList()); // List<String>

    System.out.println(names); // [john, benny]

    // Simple For-each alternative
    List<String> nameList = new ArrayList<>();
    for (Customer c : customers) {
      if (c.getName().length() >= 4) {
        nameList.add(c.getName());
      }
    }
    System.out.println(nameList);

    // we can map(), and then filter()
    customers.stream() // Stream<Customer>
        .map(c -> c.getName()) // Stream<String>
        .filter(str -> str.length() >= 4) // Stream<String>
        .collect(Collectors.toList()); // List<String>

    customers.stream() // Stream<Customer>
        .filter(c -> c.getName().length() >= 4) // Stream<Customer>
        .map(c -> c.getName()) // Stream<String>
        .forEach(name -> {
          System.out.println(name);
          System.out.println(name);
        }); // john benny

    customers.stream() //
        .filter(c -> c.getAge() < 40) //
        .count(); // long 2

    customers.add(new Customer("benny", 38));

    // distinct -> remove duplicated (by equals() and hashCode())
    List<Customer> customersAfterDistinct = customers.stream() //
        .distinct() // Stream<Customer>
        .collect(Collectors.toList());

    System.out.println(customersAfterDistinct);
    // [Customer(name=john, age=20), Customer(name=benny, age=35),
    // Customer(name=kit, age=43)]

    // sort
    // Lambda Expression (Skip class implementing interface Comparator)
    Comparator<Customer> sortByAge =
        (c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1;

    List<String> customersAfterSort = customers.stream() //
        .filter(c -> c.getAge() < 40) //
        .sorted(sortByAge) // sort by age ascending order
        .map(c -> c.getName()) //
        .collect(Collectors.toList());

    // int compare(T o1, T o2);

    System.out.println(customersAfterSort); // [john, benny, benny]

    // Terminal Operation (collect(), count(), etc) -> return non-Stream type
    // Interminate Operation (filter(), map(), sorted(), distinct()) -> return
    // Stream<>
    Stream<Customer> customerList = customers.stream() // Stream<Customer>
        .filter(c -> !"john".equals(c.getName())); // Stream<Customer>

    // c.getName().equals("john") -> potentially Null pointer exception

    System.out.println(customerList.count()); // 3

    // System.out.println(customerList.collect(Collectors.toList())); // NOT OK
    // stream has already been operated upon or closed
    // You cannot perform 2 terminal operations on a stream object

    // Map -> key: name, value: name length
    List<String> animals = Arrays.asList("Lion", "Tigers", "Bears");
    // From List to Stream to Map
    Map<String, Integer> animalMap = animals.stream() //
        .collect(Collectors.toMap(s -> s, s -> s.length()));

    System.out.println(animalMap); // {Lion=4, Tigers=6, Bears=5}

    // groupBy
    List<Staff> staffs =
        Arrays.asList(new Staff("HR", "John"), new Staff("IT", "Peter"),
            new Staff("MKT", "Sally"), new Staff("IT", "Vincent"));

    // Map<String, List<Staff>>
    Map<String, List<Staff>> staffMap = staffs.stream() //
        .collect(Collectors.groupingBy(staff -> staff.getDepartment()));

    System.out.println(staffMap.get("IT")); // [Staff(dept=IT, name=Peter),
                                            // Staff(dept=IT, name=Vincent)]

    // from List<Staff> to Map<String, List<Staff>>
    // contains -> get -> list.add() -> put
    // ! contains -> new ArrayList() -> add() -> put
    // for () {

    // }

    List<Staff> staffList = Arrays.asList(new Staff("HR", "John", 30000),
        new Staff("IT", "Peter", 40000), new Staff("MKT", "Sally", 25000),
        new Staff("IT", "Vincent", 20000));

    // HR 30000
    // IT 60000
    // MKT 25000
        
    Map<String, Integer> deptMap = staffList.stream() //
        .collect(Collectors.groupingBy(s -> s.getDepartment(),
            Collectors.summingInt(s -> s.getSalary())));

    System.out.println(deptMap.get("IT")); // 60000
    System.out.println(deptMap.get("MKT")); // 25000
    System.out.println(deptMap.get("HR")); // 30000

    // Construct Stream object by initial values
    Stream<Integer> integers = Stream.of(4, 1, 2, 3);

    Stream<Staff> staff = Stream.empty();

    // Stream:
    // filter, distinct -> reduce elements
    // map, sort -> revise object definition (No change on element count)
    // count, groupingBy, summingInt -> summarize operation

    // Special Case:
    List<Integer> integers2 =
        Stream.of(2, 3, 4).map(i -> i + 1).collect(Collectors.toList());
    System.out.println(integers2); // [3, 4, 5]

    // map() -> interminate operation -> it won't execute until terminal
    // operation
    Stream<Integer> integers3 = Stream.of(2, 3, 4).map(i -> {
      System.out.println(i);
      return i + 1;
    });
    // Sysout not working
    // because the stream object did not perform terminal operation

    // terminal operation observes interminate operations, check if they will make impact or not
    // so, finally map() won't execute, because it will not affect the result of count()
    System.out.println(integers3.count()); // 3
  }
}
