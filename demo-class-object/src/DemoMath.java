public class DemoMath {
    public static void main(String[] args) {
        int x = -3;
        int y = 8;
        int result = Math.abs(x*y);
        System.out.println(result);

        double d = 3.3;
        double result2 = Math.abs(x*d);
        System.out.println(result2);

        long l1=100999L;
        long result3 = Math.abs(x*l1);
        System.out.println(result3);

        float f1=3.141f;
        float result4 = Math.abs(x*f1);
        System.out.println(result4);

        System.out.println(Math.max(-14,199));
        System.out.println(Math.min(-14,199)); // only two !!

        //round().  it is fast but cannot round to two decimal place
        double d2= 3.65d;
        System.out.println(Math.round(d2));
        System.out.println(Math.round(3.44));
        System.out.println(Math.round(3.45));
        System.out.println(Math.round(3.55));


        //pow
        System.out.println(Math.pow(2.2,-3));
        System.out.println(Math.sqrt(-24));
        //random between 0-1
        double n1=0;
        while ((n1=Math.random()*80+20) <100){
            System.out.println(n1);
        }
    }
}
