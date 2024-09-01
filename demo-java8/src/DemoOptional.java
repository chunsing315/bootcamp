import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        String s = "hello";
        s = null;
        /* generate(s); //method handle null => OK */

        // method user instead of designer. the writer might not have handled null
        // exception
        /* generate(s).charAt(0); //runtime error */

        // alternative
        // generate2() => return optionl string -> return value can be null, or not null
        // the java compiler will force you to handle the potential null.
        Optional<String> result = generate2(s);
        if (result != null && result.isPresent()) {
            System.out.println(result.get().charAt(0));
        } else {
            System.out.println("This is null!");
        }

        List<Customer> customers = Arrays.asList(new Customer("John", 12),
                new Customer("Jenny", 20),
                new Customer("Peter", 80));
        Optional<Customer> optCustomer = customers.stream()//
                .filter(customer -> customer.getAge() > 20)//
                .findFirst();
        optCustomer.ifPresent(c -> System.out.println(c.toString()));

        Optional<Customer> optCustomer2 = Optional.of(new Customer("Mary", 13));
        Customer customer = optCustomer2.orElse(new Customer("Susan", 29));
        System.out.println(customer);

        // 4. orElseThrow()
        Customer customer2 = optCustomer2.orElseThrow(() -> new RuntimeException());
        System.out.println(customer2);
        
        // 5. orElseGet()
        Customer customer3 = optCustomer2.orElseGet(()-> new Customer("dummy",-99));
        System.out.println(customer2);


        Optional<String> optCustoemr4 = null;
        optCustoemr4.orElse("hello");



    }

    // method author
    public static String generate(String s) {
        if (s == null)
            return null;
        return s.replace('a', 'b').toUpperCase();
    }

    // better option
    // Optional<String> is not String
    public static Optional<String> generate2(String s) {
        if (s == null) {
            return Optional.ofNullable(null);
            // Optional<String> optString = Optional.empty;
        }
        return Optional.of(s.replace('a', 'b').toUpperCase());
    }
}
