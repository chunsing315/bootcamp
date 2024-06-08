public class DemoPrimitives {
    public static void main(String[] args) {
    /*    int x = 3;
        int z = -9;
        int total  = x + z; 
        System.out.println(total); //notes

        int total1 = x/z;
        System.out.println(total1);

        int total2 = x*z;
        System.out.println(total2);

        int total3 = x-z;
        System.out.println(total3);

        int l = 33 / x;
        System.out.println(l);

        int a = 32 / x;
        System.out.println(a); //no decimal place for int. only print integer.

        int remainder = 10 % 3;
        int divide = 10 / 3 ;

        double d1 = 10.1;
        double d2 = 10.100111111111111111111111111;
        double d3 = -110.100111111111111111111111111;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        double result2 = d1 + d2 - d3;
        double result3 = 0.1 + 0.2;
        System.out.println(result3); // java issue. double issue for addition, subtraction
        
        double result4 = 2+ 4 *0.25 * 3 /2 -10; // order of operation = simple
        System.out.println(result4);
        

        int f1 = 7;
        double f2 = 8.8;
        // int f3 = f1+f2
        double f3 = f1 + f2;
        // int f3 = f1+f2 f2;  error
        System.out.println(f3);
        int g = 10 / 3; // int/int -> int: 3, so 3 can be assigned to g



        char c1 = '!'; //single quote only; double quote for "string"
        char c2 = ' '; //single quote only; double quote for "string"
        System.out.println(c1);
        System.out.println(c2);
        //char test = c1 + c2;



        //boolean
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 1; error, not excel. only two values: true or false
        System.out.println(b1);
        System.out.println(b2);

        // primative: long, byte, short
        byte y1 = 1;
        System.out.println(y1);
        byte y2 = 127;
        System.out.println(y2);
        byte y3 = -128;
        System.out.println(y3);
        
        short s1= -32768; // 32k; -32768 to 32767
        int i1 = -2147483648; // 2.1 b
        long o1 = -9223372036854775808L; // long has to put a 'L' behind, to specify this is a long value;
        long o2 = 9223372036854775807L; // long has to put a 'L' behind, to specify this is a long value;
        
        //primitives for number with decimal: double 
        // cannot assign double to float. Float is lower level: 23 vs 52 
        double d10 = 10.2d; // d10 - 10.2, can also do, add 'd' or not
        float f10 = 10.2f;  //input a f 
        
        // float f11 = 10.5f + d10; //cannot becuase float is lower than double.  float< double< long double
        double d11 = 10.5f + d10;
        System.out.println(d11);
        */

        double d12; //var declaration 
        d12 = 10.9; // value assignment
        //double d12 =  10.1; //error.  cannot redeclare the same var. only declare the var once.
        d12 = 11.0; //var dec and assign
        System.out.println(d12);

        char c100 = 'a' +1;
        System.out.println(c100); //weird because it is a downgrade :). Java is not logical 100%
    }
}

