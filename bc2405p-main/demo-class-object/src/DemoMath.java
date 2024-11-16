public class DemoMath {
  public static void main(String[] args) {
    // abs()
    int x = -3;
    int y = 8;
    int result = Math.abs(x * y); // int * int -> int
    System.out.println(result); // 24

    double d = 3.3d;
    double result2 = Math.abs(d * x); // double * int -> double
    System.out.println(result2);

    long l = 9L;
    long result3 = Math.abs(l * x);
    System.out.println(result3);

    // max()
    System.out.println(Math.max(10, 9)); // 10
    System.out.println(Math.max(-10, 9)); // 9

    // min
    System.out.println(Math.min(10, 9)); // 9
    System.out.println(Math.min(-10, 9)); // -10

    int[] arr = new int[] {4, -3, 10, 2};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }
    System.out.println(max); // 10

    // round()
    double d1 = 3.65d;
    System.out.println(Math.round(d1)); // 4
    System.out.println(Math.round(3.4)); // 3
    System.out.println(Math.round(3.5)); // 4
    System.out.println(Math.round(3.45)); // 3
    System.out.println(Math.round(3.44)); // 3

    // pow()
    double r4 = Math.pow(2, 3);
    System.out.println(r4); // 8.0
    System.out.println(Math.pow(2.2, 3)); // 10.648000000000003

    System.out.println(Math.sqrt(25)); // 5
    System.out.println(Math.sqrt(24)); // 4.898979485566356
    System.out.println(Math.sqrt(-26)); // NaN

    // random()
    // between 0.0 and 1.0
    System.out.println(Math.random()); // 0.15344477782447663
    System.out.println(Math.round(Math.random() * 100)); // 0 - 100


    double number = 2.0; // The number for which we want to calculate the
    double naturalLog = Math.log(number);
    System.out.println(naturalLog);
  }
}
