import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DeCueueDemo {
    public static void main(String[] args) {
        Deque <String> strings = new LinkedList<>();
        strings.add("abc");
        strings.add("efg");
        strings.add("hij");
        strings.add("klm");
        strings.add("opq");
        strings.add("rst");
        strings.add("rst");
        strings.add("rst");
        System.out.println(strings);
        Queue<String> strings2 = new ArrayDeque<>();//implies that the queue is FIFO
        strings2.add("rst");
        strings.removeAll(strings2);

        System.out.println(strings2);
        System.out.println(strings);


        List<String> strings5 = new ArrayList<>(); //if need to insert in the middle of the list
        // ^ the conventional style
        strings5.add("1");
        strings5.add("4");
        strings5.add("5");
        strings5.add(1,"2");
        strings5.add(2,"3");
        System.out.println(strings5);

        // Insertion - ArrayList slower than LinkedList

    //

        //ArrayDeque.class;


    }    
}
