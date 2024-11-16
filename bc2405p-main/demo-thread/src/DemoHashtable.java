import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
  public static void main(String[] args) {
    // HashMap (non thread-safe, better performance) vs Hashtable (thread-safe,
    // poor performance -> synz)
    Hashtable<String, String> table = new Hashtable<>();

    // put() -> 1_000_000
    // 2 threads
    Runnable putEntryToTable1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        table.put(String.valueOf(i), "hello");
      }
    };

    Runnable putEntryToTable2 = () -> {
      for (int i = 100_000; i < 200_000; i++) {
        table.put(String.valueOf(i), "hello");
      }
    };

    long startTime = System.currentTimeMillis();
    Thread thread1 = new Thread(putEntryToTable1);
    Thread thread2 = new Thread(putEntryToTable2);
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("Hashtable runtime=" + (afterTime - startTime)); // ~2xx
                                                                          // ms
      System.out.println("Hashtable.size()=" + table.size()); // Hashtable.size()=2000000
    } catch (InterruptedException e) {

    }

    Map<String, String> map = new HashMap<>();

    Runnable putEntryToMap1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        map.put(String.valueOf(i), "hello");
      }
    };

    Runnable putEntryToMap2 = () -> {
      for (int i = 100_000; i < 200_000; i++) {
        map.put(String.valueOf(i), "hello");
      }
    };

    startTime = System.currentTimeMillis();
    Thread thread3 = new Thread(putEntryToMap1);
    Thread thread4 = new Thread(putEntryToMap2);
    thread3.start();
    thread4.start();
    try {
      thread3.join();
      thread4.join();
      long afterTime = System.currentTimeMillis();
      System.out.println("HashMap runtime=" + (afterTime - startTime));
      System.out.println("HashMap.size()=" + map.size());
    } catch (InterruptedException e) {

    }
    System.out.println("Program ends ...");

    // null key & null value
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(null, "def"); // replace entry
    map2.put(3, null);
    System.out.println(map2.size()); // 2

    Hashtable<Integer, String> table2 = new Hashtable<>();
    // table2.put(null, "abc"); // Hashtable -> key cannot be null, otherwise java.lang.NullPointerException
    // table2.put(3, null); // java.lang.NullPointerException
    table2.put(1, "abc");
    table2.put(1, "def");
    System.out.println(table2.get(1)); // def
    System.out.println(table2.size()); // 1
  }
}
