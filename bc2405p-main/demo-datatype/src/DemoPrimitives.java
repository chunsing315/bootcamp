public class DemoPrimitives {
  public static void main(String[] args) {
    // number / string (text)
    // number (integers/ decimal)
    // int is a data type that declaring the type of value of x can be stored.
    // int -> integer
    int x = 3;
    // int y = 3.5; // y cannot store non-integer number.
    int z = -9;
    int total = x + z; // -6
    System.out.println(total);

    // + - * /
    int a = total - 10 + x;
    System.out.println(a); // -13

    int k = a + x * 8;
    System.out.println(k); // 11

    int l = 33 / x;
    System.out.println(l); // 11

    //
    int r = 32 / x;
    System.out.println(r); // 10

    // remainder
    int remainder = 10 % 3; // 1
    int divide = 10 / 3; // 3
    System.out.println(remainder); // 1
    System.out.println(divide); // 3

    // 2024.05.10
    // Primitive: double
    double d1 = 10.3;
    double d2 = 10.34567;
    double d3 = -110.999;

    double result2 = d1 + d2 - d3; // 10.3 + 10.3xxx + 110
    System.out.println(result2); // double -> +,-,*,/ will have issue in some scenario

    double result3 = 0.1 + 0.2;
    System.out.println(result3); // 0.30000000000000004

    double result4 = 2 + 4 * 0.25 * 3 / 2 - 10;
    System.out.println(result4); // 2 + (4 * 0.25 * 3 / 2) - 10 -> -6.5

    int f1 = 7;
    double f2 = 8.8;

    // error, because int + double -> double (7.0) + double (8.8) -> double (15.8)
    // so double value can be stored in an int variable
    // int f3 = f1 + f2;

    int g = 10 / 3; // int / int -> int -> 3, so 3 can be assigned to variable g

    // Primitive: char
    char c1 = '!'; // single quote to declare a char value
    char c2 = ' '; // space value
    // char c3 = ''; // error, char variable must contain a single character.
    // char c4 = 'aa';

    // Primitive: boolean -> true, false
    // boolean b1 = "true"; // you cannot assign a string value to boolean
    boolean b2 = true;
    boolean b3 = false;
    // boolean b4 = 1;

    // Primitives for Integer
    // int, long, byte, short
    byte y1 = 1;
    // byte can only store the integer with range of the value between -128 and 127 (2^x)
    byte y2 = -128;
    byte y3 = 127;
    // byte y4 = 128; // compile error (java can identify the syntax error)

    short s1 = -32768; // -32768 to -32767
    int i1 = -2147483648; // -2147483648 to 2147483647
    // int i2 = -2147483649;

    long l1 = -9223372036854775808L; // -9223372036854775808 -> int
    long l2 = 9223372036854775807L; // L means a way to specify this value is a long value
    // long l3 = 9223372036854775808L;

    // Primitives for number with decimal
    // 1. 10.2 -> double value
    // 2. you cannot assign a double value to float variable, because float is with lower level of data type
    // 3. In conclude, you cannot a higher level of data value to a lower level data type
    double d10 = 10.2;
    // 10.2f is a float value
    float f10 = 10.2f;

    // float f11 = 10.5f + 10.5; // float + double -> double, cannot assign double to float.

    double d11 = 99.99d; // same as double d12 = 99.99;

    // Local Variable (within the main program, you can only declare the same variable once)
    double d12; // variable declaration
    d12 = 10.9; // value assignment

    double d13 = 14.3; // declaration and assignment
    // double d13 = 19.0; // you cannot re-declare the same variable
    d13 = 19.0; // reassignment

    

  }
}
