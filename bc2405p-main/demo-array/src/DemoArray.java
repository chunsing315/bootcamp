import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int x1 = 10;
    int x2 = 20;
    int x3 = -3; // -3 -> int value, while x3 -> variable

    // When you create an array object, you have to define the length of it.
    int[] arr = new int[3]; // stores int value only, and the length = 3
    // arr[index]
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = -3;

    // Compile-time Exception
    // arr[0] = "hello"; // Java Compiler knows that "arr" is an int array, which stores int value
    System.out.println(arr[0]); // 10
    System.out.println(arr[1]); // 20
    System.out.println(arr[2]); // -3

    arr[1] = 100;
    System.out.println(arr[1]); // 100

    // Run-time Exception
    // arr[3] = 200; // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    int[] arr2 = new int[] {10, 20, -3};
    System.out.println(arr2[0]); // 10
    System.out.println(arr2[1]); // 20
    System.out.println(arr2[2]); // -3

    // String array -> "hello", "abc", "ijk"
    // print all 3 String values
    String[] strings = new String[] {"hello", "abc", "ijk"};
    System.out.println(strings[0]);
    System.out.println(strings[1]);
    System.out.println(strings[2]);

    byte[] bytes = new byte[] {2, 3, 4};
    long[] values = new long[] {2, 3, 4}; //
    double[] d1 = new double[] {2.0, 3.3, 4};

    System.out.println(d1[1]); // 3.3

    // Arrays.
    System.out.println(Arrays.toString(strings)); // [hello, abc, ijk]
    System.out.println(Arrays.toString(arr2)); // [10, 20, -3]

    // 9, -3, -100, 90, 66, -4
    // for loop, print out all
    int[] arr3 = new int[] {9, -3, -100, 90, 66, -4};
    for (int i = 0; i < arr3.length; i++) { // 0,1,2,3,4,5
      System.out.println(arr3[i]);
    }
    // loop
    // find the max value from arr3
    int max = Integer.MIN_VALUE; // the min. value of int
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] > max) {
        max = arr3[i];
      }
    }
    System.out.println("max=" + max);

    // find the min. value from arr3
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] < min) {
        min = arr3[i];
      }
    }
    System.out.println("min=" + min);

    //
    char[] arr4 = new char[] {'l', 'e', 'e', 'r', 'q'};
    // 1. count the number of 'e'
    int count = 0;
    for (int i = 0; i < arr4.length; i++) { // 0,1,2,3,4
      if (arr4[i] == 'e') {
        count++;
      }
    }
    System.out.println("The number of character e =" + count);
    // 2. boolean result to store if 'r' exists
    boolean isrExist = false;
    for (int i = 0; i < arr4.length; i++) { // 0,1,2,3,4
      if (arr4[i] == 'r') {
        isrExist = true;
        break;
      }
    }
    System.out.println("Does character r exist? " + isrExist);
    // 3. String reuslt to store "qreel"
    String s = "";
    for (int i = arr4.length - 1; i >= 0; i--) {
      s += arr4[i];
    }
    System.out.println("Reversed char[] = " + s);

    // 4. Given two char[]
    char[] c1 = new char[] {'o', 'a', 'k', 'p'};
    char[] c2 = new char[] {'a', 'b', 'f', 't'};
    // 4a. result -> "oakpabft". append all characters to a String value
    String result1 = "";
    for (int i = 0; i < c1.length; i++) {
      result1 += c1[i]; // String value + char -> String
    }
    for (int i = 0; i < c2.length; i++) {
      result1 += c2[i];
    }
    System.out.println(result1); // oakpabft

    // 4b. result -> "obkta". when even index, get the value from c1. when odd index, get the value from c2
    String result2 = "";
    char[] c3 = new char[] {'o', 'a', 'k', 'p', 'a', 'b'};
    char[] c4 = new char[] {'a', 'b', 'f', 't'};
    // obkta

    // if (c1.length > c2.length) {
    // length = c1.length;
    // } else {
    // length = c2.length;
    // }

    int length = c3.length > c4.length ? c3.length : c4.length;

    for (int i = 0; i < length; i++) {
      if (i % 2 == 0 && i < c3.length) {
        result2 += c3[i];
      } else if (i % 2 == 1 && i < c4.length) {
        result2 += c4[i];
      }
    }
    System.out.println(result2); // obkta

    // average
    int[] arr5 = new int[] {4, 8, 3};
    int sum = 0;
    int count2 = 0;
    for (int i = 0; i < arr5.length; i++) {
      sum += arr5[i];
      count2++;
    }
    System.out.println(sum / count2);

    // swapping in array
    int[] arr6 = new int[] {6, 10, -4, 15};
    // swap -4 and 6 -> [-4, 10, 6, 15]
    int temp = arr6[2];
    arr6[2] = arr6[0];
    arr6[0] = temp;
    System.out.println(Arrays.toString(arr6)); // [-4, 10, 6, 15]

    // Level 1:
    // arr6: [-4, 10, 6, 15]
    // move the first element to the tail of the array
    // result [10, 6, 15, -4]
    int t = -1;
    for (int i = 0; i < arr6.length - 1; i++) {
      t = arr6[i];
      arr6[i] = arr6[i + 1];
      arr6[i + 1] = t;
    }
    System.out.println(Arrays.toString(arr6)); // [10, 6, 15, -4]

    // Level 2:
    // Move the max element to the tail
    // Now: [10, 6, 15, -4]
    // 1st round: [6, 10, 15, -4]
    // 2nd round: [6, 10, 15, -4]
    // 3rd round: [6, 10, -4, 15]
    for (int i = 0; i < arr6.length - 1; i++) {
      if (arr6[i] > arr6[i + 1]) {
        // swap
        t = arr6[i];
        arr6[i] = arr6[i + 1];
        arr6[i + 1] = t;
      }
    }
    System.out.println(Arrays.toString(arr6)); // [6, 10, -4, 15]

    // Level 3:
    // Sorting -> [-4, 6, 10, 15]
    // Bubble sort
    // for loop
    // nested loop
    for (int i = 0; i < arr6.length - 1; i++) { // round
      for (int j = 0; j < arr6.length - i - 1; j++) { // moving
        if (arr6[j] > arr6[j + 1]) {
          t = arr6[j];
          arr6[j] = arr6[j + 1];
          arr6[j + 1] = t;
        }
      }
    }
    System.out.println(Arrays.toString(arr6)); // [-4, 6, 10, 15]

    // Swap char value
    String str = "hello"; // swap e and o -> holle
    // convert char[]
    // for loop  + charAt()
    // char[] arr7 = new char[str.length()];
    char t2 = ' ';
    // for (int i = 0; i < str.length(); i++) {
    //   arr7[i] = str.charAt(i);
    // }
    // Alternative (String -> char[])
    char[] arr7 = str.toCharArray(); // ['h', 'e', 'l', 'l', 'o']

    t2 = arr7[1];
    arr7[1] = arr7[4];
    arr7[4] = t2;
    str = String.valueOf(arr7); // assign a new String value to variable s
    System.out.println(str); // holle

  }
}

