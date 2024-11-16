public class DemoIf {
    public static void main(String[] args) { // code block
        // Conditional: if
        int x = 10;
        if (x >= 3) { // true, code block
          System.out.println("x >= 3");
        }
        int y = 2;
        // print "y >= 3" or "y < 3"
        if (y >= 3) {
          System.out.println("y >= 3"); 
        } else {
          System.out.println("y < 3"); // print
        }

        int a = 10;
        int b = 7;
        // print max=10
        if (b > a) {
          System.err.println("max=" + b);
        } else {
          System.out.println("max=" + a);
        }
    }
}
