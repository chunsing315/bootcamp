public class DemoWhileLoop {
    public static void main(String[] args) {
        
        //For
        for (int i = 0; i<5; i++){
            System.out.println(i);
        }

        int i = 0; 
        while (i<5) {
            System.out.println(i);
            i++;
        }

        int sum = 0;
        i=0;
        int [] arr = new int[] {10,-100,9,7};
        while (i < arr.length){
            sum+=arr[i];
            i++;
        }
        System.out.println(sum);
        int sum2 = 0;
        for (int j : arr) {
            sum2 +=j;
        }
        System.out.println(sum2);


        //123 - 1+2+3
        //4567 => 4+5+6+7
        i = 1;
        int sum1 = 0;
        Long a = 999920123456789L;
        System.out.println("This number has "+((int)Math.log10(a)+1)+" digits");
        //sum = num1%10
        while (a>0){
            System.out.println("Step "+i+": + " + a%10 +" + "+sum1);
            sum1 += a%10;
            i++;
            a /= 10;
        }
        
        System.out.println(sum1);

        // 54321 -> 12345
        int b = 54321;
        while (b>0){
            System.out.print(b%10);
            b /=10;
        }

    }
    
}
