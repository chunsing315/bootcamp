import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(); //list is interface, so you cannot new a List. New ArrayList.class

        // if List has 10 methods, ArrayList must have such methods+
        
        strings.add("hi");
        strings.add("hi");
        strings.add("hi");
        strings.remove("hi");
        System.out.println(strings.size());
        // polymorphism
        // 1. scope of strings (obj ref)
        // 2. runtinme - method implementation

        // Collection.class
        Collection<String> strings2 = new ArrayList<>(); 
        Iterable<String> strings3 = new ArrayList<>();  // the narrower the pointer, the more readable. Limit the method


        strings2 = new HashSet<>();

        //Set.class
        Set<String> string4 = new HashSet<>();
        //string4 = new ArrayList<>();   | Not ok, Set and Collection are in different trees of interface
        //ArrayList doesn't implement Set.interface

        string4.add("hello");
        string4.add("hello");
        string4.add("hello");
        string4.add("hello");
        string4.add("hello");
        string4.add("hello");
        string4.add("hello");
        System.out.println(string4.size()); 
        System.out.println("Implementations of size() for set.class and list.class are different.");
        
        /// data structure of data structure

        List<HashMap<String,String>> maplist = new ArrayList<>();
        
    }

}
