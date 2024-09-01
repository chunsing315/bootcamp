import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] integers = new Integer[] { 2, 2, 10 };
        int sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        System.out.println(sum);

        // ArrayList
        sum = 0;
        ArrayList<Integer> integers2 = new ArrayList<Integer>(); // call constructor of ArrayList.class
        integers2.add(2);
        integers2.add(2);
        integers2.add(10);
        for (Integer i : integers2) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(integers2.size());
        integers2.remove(2);
        System.out.println(integers2);

        integers[1] = null;

        integers2.set(0, -100); // changing some element
        System.out.println(integers2);
        System.out.println(integers2.contains(2)); // true
        System.out.println(integers2.indexOf(2)); // 1
        integers2.add(2);
        integers2.add(2);

        System.out.println(integers2.indexOf(2)); // 1
        System.out.println(integers2.lastIndexOf(2)); // 1
        System.out.println(integers2);

        System.out.println(integers2.subList(0, 1)); // this does not change the ArrayList; from index fromIndex to
                                                     // toIndex-1 (Crazy)

        // addAll()

        ArrayList<Integer> integers3 = new ArrayList<>(); // can skill the declare the right hand side, initialization, by default the same
        System.out.println(integers3.isEmpty());
        System.out.println(integers3.iterator());
        integers3.addAll(integers2);
        System.out.println(integers3);


        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tony");
        strings.add("Andy");
        strings.add("Jacky");
        strings.add("Jacky");
        System.out.println(strings.contains("Jac"));
        strings.remove(1);
        System.out.println(strings);
        strings.remove("Jacky");
        System.out.println(strings);
        for (int i=0; i<10; i++){
            strings.add("meow");
        }

        System.out.println(strings);
        while ( strings.contains("meow") == true) {
            strings.remove("meow");
            System.out.println(strings);
        }
        System.out.println(strings);
        System.out.println(strings.get(0));
    }
}
