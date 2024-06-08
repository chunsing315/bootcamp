public class DemoInteger {
    public static void main(String[] args) {
        // Wrapper class must use method to handle
        Integer x3 = 4;
        Integer x4 = 8;
        Integer x5 = 8;

        System.out.println(x4.compareTo(x3));
        System.out.println(x3.compareTo(x4));
        System.out.println(x4.compareTo(x5));

        Double d3 = new Double("10.3");
        long l3 = d3.longValue();
        System.out.println(d3);
        System.out.println(l3);

        //Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b'); // static method? class vs object
        System.out.println(c2); 

        // boolean vs Boolean (wrapper class).  Wrapper class should not use regular operators to compare
        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);
        System.out.println(b3.compareTo(b4));
        System.out.println(b5.compareTo(b4)); 
        System.out.println(b3 == b4); //false, because of object
        System.out.println(b5 == b4); //false, because of object
        
        //auto box and unbox
        Integer i7 = 9 ; //9 is int value --> autobox to Integer Object
        int i8 = i7; //i7 is Integer object --> unbox
        
        //Integer i9 = new Integer(9) ; //9 is int value --> autobox to Integer Object
        Integer i9 = Integer.valueOf(9) ; //9 is int value --> autobox to Integer Object
        int i10= i9.intValue();

        int i12 = Integer.parseInt("315");
        System.out.println(i12);
        
        int i13 = Integer.parseInt("10");
        System.out.println(i13);

        new Byte("10");
        System.out.println(new Byte("10"));
        System.out.println(new (Byte(10)));
        
    }
    
}
