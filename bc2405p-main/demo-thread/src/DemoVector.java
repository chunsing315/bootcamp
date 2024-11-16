import java.util.List;
import java.util.Vector;

public class DemoVector {
  public static void main(String[] args) {
    // ArrayList (non thread-safe, better performance) vs Vector (thread-safe, poor performance -> synz)
    List<String> strings = new Vector<>(); // ArrayList implementation differs to Vector implementation

    Runnable addStringToArrayList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings.add("hello");
      }
    }; // run() method implementation

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrayList);
    Thread thread2 = new Thread(addStringToArrayList);
    thread1.start(); // call run()
    thread2.start();

    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("ArrayList runtime=" + (afterTime - startTime)); // 10-30ms
      System.out.println("ArrayList.size()=" + strings.size()); // ArrayList.size()=1455313
    } catch (InterruptedException e) {

    }

    // Solution for Multi-threading
    List<String> strings2 = new Vector<>();

    Runnable addStringToVector = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings2.add("hello");
      }
    };

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start(); // call run()
    thread4.start();

    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Vector runtime=" + (afterTime - startTime)); // 50-100ms
      System.out.println("Vector.size()=" + strings2.size()); // Vector.size()=2000000
    } catch (InterruptedException e) {

    }

    // System.out.println(strings.size()); // NOT OK, main program flow
    System.out.println("Program ends ...");

    // Steps to resize the ArrayList/ Array (add element)
    // 1. create a new array (old length + 1)
    // 2. copy of the old array to new array
    // 3. Add the new element at the array
    // 4. reassign the new obj ref to the old obj ref


  }
}
