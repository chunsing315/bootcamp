import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoHashtable {
    public static void main(String[] args) {
        // HashTable vs HasMap(not thread safe)
        Hashtable<String,String> table1 = new Hashtable<>();
        Map<String,String> hashmap = new ConcurrentHashMap<>();
        
        // put() -> 100_000

        Runnable putToHashtable = ()->{
            for (int i = 0; i < 100_000 ; i++){
                table1.put(String.valueOf(i),"Morning");
            }
        };
        Runnable putToHashMap = ()->{
            for (int i = 0; i < 100_000 ; i++){
                hashmap.put(String.valueOf(i),"Morning");
            }
        };
        Runnable putToHashtable2 = ()->{
            for (int i = 100_000; i < 200_000 ; i++){
                table1.put(String.valueOf(i),"Morning");
            }
        };
        Runnable putToHashMap2 = ()->{
            for (int i = 100_000; i < 200_000 ; i++){
                hashmap.put(String.valueOf(i),"Morning");
            }
        };
        Long startTB = System.currentTimeMillis();
        Thread thread1 = new Thread(putToHashtable);
        Thread thread2 = new Thread(putToHashtable2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            Long endTB = System.currentTimeMillis();
            System.out.println("Hashtable time (ms): "+ (endTB-startTB));
        } catch (InterruptedException e){}

        Long startMap = System.currentTimeMillis();
        Thread thread3 = new Thread(putToHashMap);
        Thread thread4 = new Thread(putToHashMap2);
        thread3.start();
        thread4.start();
        try {
            thread4.join();
            thread3.join();
            Long endHashMap = System.currentTimeMillis();
            System.out.println("HashMap time (ms): "+ (endHashMap-startMap));
        } catch (InterruptedException e){}
        System.out.println("Hashtable size = "+table1.size());
        System.out.println("HashMap size = "+hashmap.size());

        
        // #null key: HashMap
        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(null,"abc");
        map2.put(1,null);
        //map2.put(null,null);
        System.out.println(map2.size());
        System.out.println(map2.get(null));

        // #Concurrent: Null? cannot
        Map<Integer,String> map3 = new ConcurrentHashMap<>();
        //map3.put(null,"abc");
        //map3.put(1,null);
        //map2.put(null,null);
        System.out.println(map3.size());
        System.out.println("concurrent Hash Map get 1: "+map3.get(1));

        // #null key: Hashtable cannot Null pointer 
        Hashtable<Integer,String> table2 = new Hashtable<>();
        //table2.put(null,"abc");       //NullPointerException
        // table2.put(1,null);        //NullPointerException
        // table2.put(null,null);    //NullPointerException
        table2.put(1,"abc");
        table2.put(1,"def");
        table2.put(1,"ghi");
        System.out.println(table2.size());  //replace
        System.out.println(table2.get(1));  //replace entry, no duplicate entry.
    }
}
