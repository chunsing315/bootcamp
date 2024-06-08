public class DemoIf {
    public static void main(String[] args){
        int x = 3;
        if (x >= 3) {
            System.out.println("x >=3");
        }
        int y = 2;
        if (y >= 3) {
            System.out.println("y >= 3");
        } else {
            System.out.println("y < 3");
        }

        int a = 10;
        int b = 17;
        if (a>b) {
            System.out.println("a > b");
        } else {
            if (a == b) {
                System.out.println("a = b");
            } else{
                System.out.println("b > a");
            }   
        }
        int x1 = 3;
        int y1 = x1++ + 3 * x1++;
        System.out.println(y1);
        System.out.println(x1);

        
    }
}
