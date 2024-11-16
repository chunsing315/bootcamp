import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import sorting.Ball;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("def"); // sorting, [def]
    pq.add("abc"); // sorting, [def, abc] -> [abc, def]
    pq.add("bbb"); // sorting, [abc, def] -> [abc, bbb, def]
    pq.add("aax");
    System.out.println(pq); // [abc, def, bbb], so add() method does not perform
                            // sorting...

    // while
    while (!pq.isEmpty()) {
      System.out.println(pq.poll()); // complete sorting when you call poll()
                                     // method...
    }
    // aax, abc, bbb, def

    // PriorityQueue.class add() & poll() differs to LinkedList.class
    // (implementation)
    List<String> pq2 = new LinkedList<>();
    pq2.add("def");
    pq2.add("abc");
    pq2.add("bbb");
    pq2.add("aax");
    System.out.println(pq2); // [def, abc, bbb, aax]
    Collections.sort(pq2);
    System.out.println(pq2); // [aax, abc, bbb, def]
    // 1. Java 8 -> Stream (List)
    // 2. Convert to Array -> Arrays.sort()

    Queue<Integer> pq3 = new PriorityQueue<>();
    pq3.add(-23);
    pq3.add(10000);
    pq3.add(10);
    pq3.add(-200);
    // poll() -> ordering
    System.out.println(pq3.poll()); // -200
    pq3.add(-400);
    System.out.println(pq3.poll()); // -400
    System.out.println(pq3.poll()); // -23
    System.out.println(pq3.poll()); // 10
    System.out.println(pq3.poll()); // 10000

    Queue<Long> pq4 = new PriorityQueue<>(new LongDescendingOrder());
    // Class -> formula
    // add
    pq4.add(Long.valueOf(100));
    pq4.add(Long.valueOf(-40));
    pq4.add(Long.valueOf(9));
    pq4.add(Long.valueOf(105));
    // poll
    System.out.println(pq4.poll()); // 105
    System.out.println(pq4.poll()); // 100
    System.out.println(pq4.poll()); // 9
    System.out.println(pq4.poll()); // -40

    Queue<Customer> pq5 = new PriorityQueue<>(CustomerSortByAge.of());
    pq5.add(new Customer(40));
    pq5.add(new Customer(45));
    pq5.add(new Customer(19));
    pq5.add(new Customer(27));
    System.out.println(pq5.poll()); // Customer(age=45)
    System.out.println(pq5.poll()); // Customer(age=40)
    System.out.println(pq5.poll()); // Customer(age=27)
    System.out.println(pq5.poll()); // Customer(age=19)

  }
}
