public class DemoLiteralPool {
    public static void main(String[] args) {
        //Literal Pool (String)

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);

        String s3 = "hello";
        String s4 = new String("hello");
        System.out.println(s3==s4);
        
        s3 = s4;
        System.out.println(s4==s4); //piointing to the same object

        String s5 = "he";
        String s6 = "llo";
        s5=s5+s6; //hello, concate is new string, 
        System.out.println(s5==s1); //false

        //immutable
        System.out.println(System.identityHashCode(s7));
        String s7 = "hello";
        s7+=" world"; // new string ject
        
        //toUpperCase
        String s9 = "hello";
        System.out.println();
        // Trea
    }    
}
