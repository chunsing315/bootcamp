public class DemoPrimitives2 {
    public static void main(String[] args) {
        long l1 = 10;
        long l2 = 10L;
        System.out.println(l1 +"  "+l2);

//int --> long
        long l4 = 63; // promote an int to long, because lower level will have 
        
// byte < short < int < long < float < double
// char < int (ASCII)

        double d1= 1.8;
        double d2= 1.8d;
        double d3= 108L;
        
        byte d4= 10; // ok, byte and short can convert. Java's design
// down cast
        float f3 = (float) 1.9D;  // explicitly assign a value from a lower DT to higher DT, a.k.a. downcast / precision loss
        short s1 = 128;
        byte b2 = (byte) s1; //byte range (-128,127) ; short range 30k+; 
        System.out.println(b2); // overflow
        b2++;
        System.out.println(b2);

        double d5=10.9999d;
        int i2= (int) d5;
        System.out.println(i2); //overflow->precision loss
// char = int
        char c1 = 'a';
        char c2 = 'A';
        if (c1==c2){
            System.out.println("true");
        }else{  System.out.println("false");}
        if (c1==97){
            System.out.println("true");
        }else{  System.out.println("false");}

        System.out.println("c1<c2 " + (char) c2);

        int charvalue = 97;
        char c3 = (char) charvalue;
        System.out.println(c3);

        char c4 = 127;
//        for (c4 = 127; c4<20424; c4++) {  
            System.out.println("1"+c4);

        char character = 'a' + 1;
        int charint = character;
        System.out.println(character);
        System.out.println(charint);

        char zero = '0';
        int asciicode = (int) zero; //'0' is 48 on ASCII table
        System.out.println(asciicode);
//      }

        char summation=310;
        System.out.println(summation);

        short a = (byte) 128;
        System.out.println(a);

//underflow
        int i = 20;
        byte j = (byte) i;
        System.out.println(j);        
    }    
}
