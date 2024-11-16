public class DemoLiteralPool {
  public static void main(String[] args) {
    // Literal Pool (String)
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); // true
    System.out.println(System.identityHashCode(s1)); // 1933863327
    System.out.println(System.identityHashCode(s2)); // 1933863327

    String s3 = "hello";
    String s4 = new String("hello");
    System.out.println(s3 == s4); // false
    System.out.println(s3 == s1 && s3 == s2); // true

    s3 = s4;
    System.out.println(s3 == s4); // true, they are pointing to the same object

    String s5 = "he";
    String s6 = "llo";
    s5 = s5 + s6; // hello (new String)
    System.out.println("s1=" + s1); // hello
    System.out.println("s5=" + s5); // hello
    System.out.println(s5 == s1); // false

    // Immutable
    String s7 = "hello";
    System.out.println(System.identityHashCode(s7)); // 112810359
    s7 += " world";
    System.out.println(System.identityHashCode(s7)); // 146589023 (new String Object)

    String s8 = "hello";
    System.out.println(System.identityHashCode(s8)); // 1933863327
    s8 = s8.replace("e", "a"); // new
    System.out.println(System.identityHashCode(s8)); // 1482968390

    String s9 = "hello";
    System.out.println(System.identityHashCode(s9)); // 1933863327
    s9 = s9.toUpperCase();
    System.out.println(System.identityHashCode(s9)); // 349885916

    // Same idea apply most of the String methods:
    // concat(), substring()




  }
}
