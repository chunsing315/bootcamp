import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        System.out.println("Hello HashSet!");
        // hashset is useful!
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("hello");
        hs1.add("world");
        hs1.add("abc");
        System.out.println(hs1.toString()); // the order is not determined by insertion order. order is unknown

        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("abc");
        System.out.println(array);

        hs1.add("hello");
        hs1.add("hello");
        System.out.println(hs1);

        //
        String[] arr = new String[] { "abc", " def", "xyz", "def" };
        HashSet<String> result = new HashSet<>();

        for (String s : arr) {
            result.add(s);
        }
        System.err.println(arr.toString());

        // find all dulplicate var=
        HashSet<String> result2 = new HashSet<>();
        result2.add("abc");
        result2.add("abc");
        result2.add("abc");
        result2.add("EDF");
        ArrayList<String> arrlist = new ArrayList<>();
        for (String s : arr) {
            if (!result2.add(s)) {
                arrlist.add(s);
            }
        }

        System.out.println(arrlist);

        // Q3, remove length > 3
        String[] stringArray = new String[] { "abc", "a", null, "aaaa" };
        for (String s : stringArray) {
            System.out.print(s + "  ");
        }
        System.out.println();

        ArrayList<String> result3 = new ArrayList<>();
        for (String s : stringArray) {

            if (s != null && (s.length() > 3)) {
                result3.add(s);
            }
        }
        System.out.println(result3);
        // Q2

        customer[] customers = new customer[] { new customer(12, "tony"), //
                new customer(13, "Jenny"), //
                new customer(24, "brenda") };
        ArrayList<customer> customerList = new ArrayList<>();
        for (customer c : customers) {
            if ((c.getAge() > 20) || (c.getName().startsWith("J") == true)) {
                customerList.add(c);
            }
        }
        System.out.println(customerList.get(1));
        System.out.println(customerList.size());
        for (int i = 0; i < (customerList.size() -1); i++) {
            System.out.print(customerList.get(i) + ", ");
        }
        System.out.println(customerList.get(customerList.size()-1).toString()); 
    }
}
