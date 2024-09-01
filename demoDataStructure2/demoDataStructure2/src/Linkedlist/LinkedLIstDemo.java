package Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedLIstDemo {
    public static void main(String[] args) {
        // Array vs ArrayList -> Underlying of ArrayList is array
        // 2. Array is fixed length, it is a consecutive range of cont' memory locations
        Cat cat = new Cat(Color.BLUE); // cat is a reference
        // Heap
        // 1) Create Cat Object
        // 2) Eye Array Object
        // 3) 2x eye Object
        // 4) 3x colors objects (created when execute)
        System.out.println(cat.getEyes());
        System.out.println(cat.getLeftEyes());
        System.out.println(cat.getRightEyes());

        Eye[] eyes = cat.getEyes(); // backup the array object memory location
        Eye rightEye = eyes[1]; // this we have the memory location stored.
        Eye leftEye = eyes[0];
        System.out.println(rightEye.hashCode());
        System.out.println(leftEye.hashCode());
        System.out.println(eyes[1].hashCode());
        System.out.println(eyes[0].hashCode());
        // relationship between memory location
        // 1. leftEye vs rightEye
        // 2. Cat object vs Eye[] object
        // 3. Cat object vs Eye object

        ArrayList<String> strings = new ArrayList<>();
        for (String i : strings) {
            System.out.println(i);
        }

        List<String> string2 = new LinkedList<>(); // the same if use arraylist, but the performance difference. runtime
                                                   // method different.
        long before = System.currentTimeMillis();
        long after = System.currentTimeMillis();

        before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            string2.add("abc");
            // string2.remove(0);
        }
        after = System.currentTimeMillis();
        System.out.println("LinkedList add 1M times: " + (after - before));

        List<String> string3 = new ArrayList<>();
        before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            string3.add("abc");
            // string3.remove(0);
        }
        after = System.currentTimeMillis();
        System.out.println("ArrayList add 1M times: " + (after - before));
        // arr[arr.length-1]
        before = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            string2.remove(string2.size()-1); //calling List.Class method
            // string2.remove(0);
        }
        after = System.currentTimeMillis();
        System.out.println("LinkedList remove last 1M times: " + (after - before));

        before = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            string3.remove(0);
            // string3.remove(0);
        }
        after = System.currentTimeMillis();
        System.out.println("ArrayList remove head 1K times: " + (after - before));


        LinkedList<String> ll = new LinkedList<>(); 
        ll.add("hello");
        ll.addFirst("abc"); //exclusive to LinkedList
        ll.add("def");
        ll.add("hello");
        for (String s:ll){
            System.out.println(s);
        }
        System.out.println(ll.indexOf("hello"));
        System.out.println(ll.lastIndexOf("hello"));

        // you can let the user choose the data structure
        // ArrayList and LinkedList are in brother relationship
        List<String> ll3;

        String details = "remove head mostly";
        if (details == "remove head mostly"){
            ll3 = new LinkedList<>();
        } else ll3 = new ArrayList<>();

        // Queue.class
        System.out.println("LL starts:");
        Queue<String> emails = new LinkedList<>();
        emails.add("john@gmail.com");
        emails.add("peter@gmail.com");
        emails.add("peter@gmail.com");
        emails.add("peter@gmail.com");
        System.out.println(emails.size());
        String head = emails.poll();
        System.out.println("polled: "+head);
        System.out.println("New add? "+emails.add("miranda@gmail.com"));
        //for-each
        int i=0;
        for (String s : emails){
            System.out.println(++i+" "+s+", ");
            System.out.println();
        }

        //
        /* while (!emails.isEmpty()){
            System.out.println(emails.poll());
        } */
        
        //Convert Queue<STring> to List <String>
        List<String> strings4 = new ArrayList<>();
        while !(emails.isEmpty()){
        strings4.add(emails.poll());
        }

        System.out.println("String4: "+strings4);
        System.out.println("emails: "+emails);
        
        //Peek 
        System.out.println(strings4.size());
        System.out.println(emails.peek()); 
        
        //remove
        System.out.println(emails.remove("peter@gmail.com"));
        System.out.println(emails.remove(new String("peter@gmail.com")));
        System.out.println(emails.remove()); //remove = pop
        //System.out.println(emails.remove()); not such element exception if empty
        System.out.println(emails.size()); 

        //poll will have null object => no runtime error if poll an empty list

        strings4.clear(); // Clear all the objects inside the Arraylist object
        strings4.add("abc");
        strings4 = null; //removed the ArrayList.object
        //strings4.add("def"); // NPE (null pointer exception)
        


    }
}
