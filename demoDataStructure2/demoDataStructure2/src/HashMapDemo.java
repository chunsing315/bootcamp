import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> nameMap = new HashMap<>();
        
        nameMap.put(100,"Vincent");

        nameMap.put(-1010,"Cindy");
        nameMap.put(-45,"Sally");

        for (Map.Entry<Integer, String> entry : nameMap.entrySet()){
            System.out.println( "key= " +   entry.getKey() //
                                + ",value: " + entry.getValue());
        }
        //Key+Value ->Entry
        //A Map consists of many entries


        // how it handle duplicated key?
        nameMap.put(100, "Jason");

        for (Map.Entry<Integer, String> entry : nameMap.entrySet()){
            System.out.println( "key= " +   entry.getKey() //
                                + ",value" + entry.getValue());
        }
        
        nameMap.put(-45,null);
        nameMap.put(-1111,"Cindy");
        nameMap.put(null,"Oscar");
        System.out.println(nameMap);
        System.out.println(nameMap.keySet());
        System.out.println(nameMap.size());
        System.out.println(nameMap.remove(null));
        System.out.println(nameMap);
        System.out.println(nameMap.containsKey(-45));
        
        //Loop keyset
        for (Integer x : nameMap.keySet()){
            System.out.println("KeySet loop: "+x);
        }
        nameMap.put(null,"Peter");
        for (String x : nameMap.values()){
            System.out.println("Values loop: "+x);
        }
        System.out.println(nameMap.size());
        System.out.println(nameMap.get(null));
        System.out.println(nameMap.containsValue("Cindy"));
    }   
}
