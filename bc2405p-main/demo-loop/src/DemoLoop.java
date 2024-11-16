public class DemoLoop {
  public static void main(String[] args) {
    int x = 3;
    x *= 3; // 9
    x *= 3; // 27
    x *= 3; // 81

    // For Loop
    // initialization (variable declaration & assignment) ; continue criteria ; incremental operation
    // Step 1: "int i = 0"
    // Step 2: Check if i < 4 ? Yes
    // Step 3: print hello
    // Step 4: i++ -> i become 1
    // Step 5: Check if i < 4 ? Yes
    // Step 6: print hello
    // Step 7: i++ -> i become 2
    // Step 8: Check if i < 4 ? Yes
    // Step 9: print hello
    // Step 10: i++ -> i become 3
    // Step 11: Check if i < 4 ? Yes
    // Step 12: print hello
    // Step 13: i++ -> i become 4
    // Step 14: Check if i < 4 ? No
    // Step 15: exit the loop
    for (int i = 0; i < 4; i++) { // 0,1,2,3
      System.out.println("hello");
    }
    // hello
    // hello
    // hello
    // hello

    int y = 3;
    for (int i = 0; i < 3; i++) {
      y *= 3;
    }
    System.out.println("y=" + y);
    // y = 81

    // 2
    // 4
    // 6
    for (int i = 0; i < 7; i++) {
      if (i != 0 && i % 2 == 0) { //
        System.out.println(i);
      }
    }

    // 1 + 2 + 3 + 4 + 5 .... 10
    int sum = 0;
    for (int i = 0; i < 11; i++) {
      sum += i;
    }
    System.out.println("sum=" + sum); // 55

    // 2 + 4 + 6 + 8
    int sum2 = 0;
    for (int i = 0; i < 9; i++) {
      if (i % 2 == 0) { // % 2 is to find the even number
        sum2 += i;
      }
    }
    System.out.println("sum=" + sum2); // 20

    // 8
    // 6
    // 4
    // 2
    for (int i = 9; i > 0; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // break
    for (int i = 0; i < 10; i++) {
      if (i > 7) {
        break; // exit loop
      }
      System.out.println(i); // main logic
    }
    // 0
    // 1
    // ...
    // 7

    // continue
    int total = 0;
    for (int i = 0; i < 5; i++) {
      if (i > 3) {
        continue; // when i = 4, skip "total += i", goes to "i++"
      }
      total += i;
    }
    System.out.println("total=" + total);
  }
}
