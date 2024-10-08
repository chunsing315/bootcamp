public class DemoInternalCache {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(3); 
        Integer i2 = 3; // 3 int value -> autobox (what is this) -> integer object (~heap memory)
    //  v object reference
        i1  = 127; //i1 (object ref, 127 -> create object 1st time, integer object)
        i2  = 127; //i2 (object ref), 127 -> 2nd time, reuse the original object integer object
        // internal cache (For Number) 
        // Rule: -128 to 127, reuse the original object
        System.out.println(i1 == i2); // true (are they the same object?)
        
        Integer i3 = 128; // out of 127, won't trigger internal cache, 1st create int object
        Integer i4 = 128; // 2nd create 2nd int object
        System.out.println(i3 == i4); //false (are they the same object?)
        
        
        //why?? -128 to 127 is a Byte, we use these a lot, so if we reuse the object, can save a lot of memory (1 byte)
        //Class: always compare objects value by METHOD!!
        System.out.println(i3.compareTo(i4)); // for line 14, we actually want to do this.

        System.out.println(i3 >= i4); //not meaningful
        System.out.println(i1 >= i2); //not meaningful
        
        //internal cache
        
        Double d1 = 128.12345d; // autobox: double value -> Double Object
        Double d2 = 128.12345d;
        System.out.println(d1 == d2); 
        //autobox
        Boolean b1 = true; 

        Boolean b2 = true; 
        System.out.println(b1 == b2); 
        
        
        Character c1 = 'c'; 
        Character c2 = 'c'; 
        System.out.println(c1 == c2);         
        Character c3='我';
        Character c4='我';
        System.out.println(c3 == c4); //only -128 to 127 character. (only 256 value)
    }   
}
