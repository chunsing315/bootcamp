import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> ss = new Stack<>();
        ss.add("abc");
        ss.push("world");
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        if (ss.size() == 0) {
            System.out.println("empty stack");
        } else {
            System.out.println(ss.pop());
        }
        ss.push("BBB");
        ss.push("ABC");
        ss.push("abc");
        ss.push("bbb");
        ss.push("Second");
        ss.push("point");
        System.out.println(ss);

        List<String> ss2 = new Stack<>();
        //ss2.push("abc");        
        //ss2.pop();
        ss2.addAll(ss);
        ss2.remove("BBB");
        System.out.println(ss2);        
    }
}
