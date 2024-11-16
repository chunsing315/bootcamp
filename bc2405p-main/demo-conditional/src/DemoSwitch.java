import java.util.Scanner;

public class DemoSwitch {
  public static void main(String[] args) {
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("The grade is " + grade);
        break; // break the switch statement
      case 'B':
        System.out.println("The grade is " + grade);
        break; // break the switch statement
      case 'C':
        System.out.println("The grade is " + grade);
        break; // break the switch statement
      default:
        System.out.println("No grade");
    }

    if (grade == 'A' || grade == 'B' || grade == 'C') {
      System.out.println("The grade is " + grade);
    } else {
      System.out.println("No grade");
    }

    // if you don't use break statement, the ordering of the cases may cause various result.
    int x = 0;
    switch (grade) {
      case 'A':
        x += 10;
      case 'B':
        x += 10;
      case 'C':
        x += 10;
      default:
        x += 10;
    }
    System.out.println("x=" + x); // 30

    // Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Please input a number: ");
    int month = input.nextInt(); // line of input -> int
    System.out.println("month=" + month);

  }
}
