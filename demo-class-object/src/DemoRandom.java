import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        /* int random = new Random().nextInt(3); //( 0 to 2)
        int random2 = new Random().nextInt(3)+1; //( 1 to 3)
        int random3 = new Random().nextInt(3-1)+1; //( 1 to 2)
         *//* System.out.println( random);
        System.out.println( random2);
        System.out.println( random3);
         */
        int random4 = new Random().nextInt(2)+49; //( 1 to 2)
        System.out.println( random4);
        int max = 0;
        int j = 0;
        
        for (int i = 0; i < 2; i++){
            j = new Random().nextInt();
            if (j<max) {
                max = j;
            }
        }
        System.out.println(max);
    }
    
}
