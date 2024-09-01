import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class HKID {
    private String value;

    public  HKID(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }    
    @Override
    public String toString(){
        return "(ID:" + this.value+")";
    }


    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof HKID)) 
            return false;
        HKID hkid = (HKID) obj;
        return Objects.equals(this.value, hkid.getValue());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.value);
    }
    

    public static void main(String[] args) {
        HashMap<HKID, customer> customerMap = new HashMap<>(); 
        HKID id = new HKID("B1234567");
        HKID id2 = new HKID("B1234567");
        customerMap.put(new HKID("A1234567"),new customer(99,"Tung Chewah"));
        customerMap.put(new HKID("A1234567"),new customer(99,"Tseng Yamkeun"));
        customerMap.put(id,new customer(99,"CY Leung"));
        customerMap.put(id,new customer(99,"Carrie Lam"));
        System.out.println(customerMap.toString());
        System.out.println(customerMap.get(id));

        System.out.println(id.equals(id2));
        System.out.println(id.hashCode());
        System.out.println(id2.hashCode());
        
        // HashMap.class equals() is to identify if they are same entry 

        System.out.println(new HKID("1234").equals(new HKID("1234")));
        // objectives of equals() & hashcode(): identify if they are same object
        // hashmap.class euals() & hashCode() is to identify if they are same key

        // put( program flow:
        // 1) hashmap.put(key,value) --> calls key.equals() & key.hashCode()
        // How about HashMap<String,String>
        // String.class is already done.  you cannot change the implementation of euqals() and hashCode()
        // String.equals() compares the value itself to determin if they are same object

        //
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("abc");
        obj.add(LocalDate.of(2024,7,23));
        obj.add(1);
        obj.add(new HKID("A1234567"));

        for (Object object : obj){
            if (object.equals(new String("abc"))){
                System.out.println("hello");
            } else if (object.equals(LocalDate.of(2024,7,23))){
                System.out.println("hello2");
            } else if (object.equals(new Integer(1))){
                System.out.println("hello3");
            } else if (object.equals(new HKID("A1234567"))){
                System.out.println("hello4");
            }
        }
        
        System.out.println(obj.get(2));
        // Compare the difference between ArrayList<Object> and ArrayList<String>
        


    }
}
