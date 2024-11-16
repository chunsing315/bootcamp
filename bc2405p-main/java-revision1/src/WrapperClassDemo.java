public class WrapperClassDemo {
  public static void main(String[] args) {
    // the relationship between Object and Primitive
    int x = 10;
    Integer x2 = x; // auto-box (int -> Integer)
    int x3 = x2; // un-box (Integer -> int)

    Character c = 'c'; // char value -> Character Object (auto-box)
    // c -> object reference
    // 'c' -> auto-box -> new Character Object

    Boolean b = null; // 
    b = true; // auto-box (primitive boolean -> Boolean Object)
    b = false;
    b = Boolean.valueOf(true);
    b = new Boolean(false);

    // Stack & Heap
    Integer i1 = 128;
    Integer i2 = 128;
    System.out.println(i1 == i2); // false

    Integer i3 = 127;
    Integer i4 = 127;
    System.out.println(i3 == i4); // true

    String s2 = "abc";
    String s3 = "abc";
    System.out.println(s2 == s3); // true, string pool
    String s4 = new String("abc");
    System.out.println(s2 == s4); // false
    String s5 = String.valueOf("abc");
    

  }
}
