import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
    // private final Object lock = new Object();
    // ArrayList (non thread safe) vs Vector (thread safe)
    // Arraylist better performance, non synz
    // vector poor performance, sync
    public static void main(String[] args) {
    List<String> strings = new ArrayList<>();

    // # loop 1M hello
    Runnable addStringToArrayList = () ->{
        for (int i = 0; i < 1_000_000 ; i ++){
            
            strings.add("Hello");
        }
    };
    // # two threads 
    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(addStringToArrayList);
    Thread thread2 = new Thread(addStringToArrayList);
    thread1.start(); //run()
    thread2.start(); //run()
    // System.out.println(strings.size()); // main thread = 0;
    
    // # how to join two threads
    try {
        thread1.join();
        thread2.join();
        long afterTime = System.currentTimeMillis();
        System.out.println("ArrayList Runtime = "+(afterTime-startTime));
        System.out.println("ArrayList size = "+strings.size());
    } catch (InterruptedException e) {
    }

    Vector<String> strings2 = new Vector<>();
     // # loop 1M hello
     Runnable addStringToVector = () ->{
        for (int i = 0; i < 1_000_000 ; i ++){
            
            strings2.add("Hello");
        }
    };
    // # two threads 
    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start(); //run()
    thread4.start(); //run()
    // System.out.println(strings.size()); // main thread = 0;
    
    // # how to join two threads
    try {
        thread3.join();
        thread4.join();        
        System.out.println("Vector size = "+strings2.size());
        long afterTime = System.currentTimeMillis();
        System.out.println("Vector Runtime = "+(afterTime-startTime));
    } catch (InterruptedException e) {
    }

    System.out.println("Program ends..."); // main thread run first
    // steps to resize Array, 
    // 1) new Array(length+1) 
    // 2) Copy old array to new array 
    // 3) add the new element to the end
    // 4) reassign old object reference to new array
    }
}