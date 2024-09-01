public class Test {

    enum Color {
        RED(1), YELLOW(2),BLACK(3);

        static int counter = 0;
        int value;

        Color(int i ){
            this.value = i;
            //counter++;
        }
    }

    static final String string = " IamFinalString";
    private static char c = 'C';

    public int normalMethod(int n){
        int[] arr = new int[] {1,3,5,7,9,11,13};
        
        int total = 0;
        for (int i = 0 ; i < n ; i ++){
            total += arr[i];
            System.out.println("total is " + total +". i is "+i+".");
        }
        return total;
    }   

    static {
        char[] chars = string.toCharArray();
        c = chars[3];
    }

    public static void main(String[] args) {
        Test test = new Test();//this is necessary
        System.out.println(test.normalMethod(4));
        System.out.println(test.c);
    }
}
