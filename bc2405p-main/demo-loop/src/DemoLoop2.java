public class DemoLoop2 {
  public static void main(String[] args) {
    // inifinte loop -> control + c to stop
    // for (int i = 0; ; i++) { // No "Continue" conition -> No "Exit" condition -> inifinte loop
    // System.out.println("Hello World");
    // }

    // No "Continue" conition -> No "Exit" condition -> inifinte loop
    // for (;;) {
    // System.out.println("hello");
    // }

    // Label: outerLoop -> labeled start point for "continue"
    outerLoop: for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2) {
          continue outerLoop; // Skip to the next iteration of the outer loop
        }
        System.out.println("i: " + i + ", j: " + j);
      }
    }
    // i: 1, j: 1
    // i: 1, j: 2
    // i: 1, j: 3
    // i: 2, j: 1
    // i: 3, j: 1
    // i: 3, j: 2
    // i: 3, j: 3

  }
}
