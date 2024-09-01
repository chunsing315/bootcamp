package sorting;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("def"); //Add doesn't sort!
        pq.add("ghi");
        pq.add("abc");
        System.out.println(pq);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        Queue<String>pq2 = new LinkedList<>(); 
        pq2.add("def");
        pq2.add("def");
        pq2.add("def");
        pq2.add("def");
        System.out.println(pq2);
        
        // Queue<String>pq3 = new PriorityQueue()<>();
        // pq3.add(-23);

        Queue<Customer> pq5 = new PriorityQueue<>(new CustomerSortByAge());
        pq5.add(new Customer(12));
        pq5.add(new Customer(34));
        pq5.add(new Customer(6));
        pq5.add(new Customer(40));
        pq5.add(new Customer(41));
        pq5.add(new Customer(48));
        pq5.add(new Customer(27));
        pq5.add(new Customer(29));
        while (!(pq5.isEmpty()))     {
            System.out.println(pq5.poll());
        };

    }


    
}
