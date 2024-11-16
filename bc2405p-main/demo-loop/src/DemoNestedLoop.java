public class DemoNestedLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) { // 0,1,2,3
      for (int j = 0; j < 2; j++) { // 0,1
        System.out.println("hello " + "i=" + i + ",j=" + j);
      }
    }
    // hello i=0,j=0
    // hello i=0,j=1
    // hello i=1,j=0
    // hello i=1,j=1
    // hello i=2,j=0
    // hello i=2,j=1
    // hello i=3,j=0
    // hello i=3,j=1

    // hello i=1,j=0
    // hello i=3,j=0
    // Approach 1:
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 2; j++) {
        if (i % 2 == 1 && j % 2 == 0) {
          System.out.println("hello " + "i=" + i + ",j=" + j);
        }
      }
    }
    // Approach 2:
    for (int i = 0; i < 4; i++) {
      if (i % 2 == 0) {
        continue;
      }
      for (int j = 0; j < 2; j++) {
        if (j % 2 == 1) {
          continue;
        }
        System.out.println("hello " + "i=" + i + ",j=" + j);
      }
    }
    // Output:
    // hello i=1,j=0
    // hello i=3,j=0

    // Exercise
    // 1 - 20
    // 1 3 5 7 9 12 14 16 18 20
    for (int i = 1; i < 21; i++) {
      if ((i % 2 == 1 && i < 10) || (i % 2 == 0 && i > 10)) {
        System.out.print(i + " ");
      }
    }
    // Output: 1 3 5 7 9 12 14 16 18 20
    System.out.println();

    // Searching
    String s = "Vincent Book Game Laptop";
    // Find the index of first character 'a'
    // 14
    // charAt()
    int idx = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        idx = i;
        break; // break -> exit loop
      }
    }
    System.out.println(idx); // 14

    // *****
    for (int i = 0; i < 5; i++) {
      System.out.print("*");
    }
    System.out.println();

    // *****
    // *****
    // *****
    // *****
    // *****

    // tips
    // 1. new line
    // 2. Nested Loop
    for (int row = 0; row < 5; row++) {
      for (int column = 0; column < 5; column++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // *****
    // ****
    // ***
    // **
    // *
    for (int row = 0; row < 5; row++) {
      for (int column = 0; column < 5 - row; column++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // *
    // **
    // ***
    // ****
    // ***
    // **
    // *



  }
}
