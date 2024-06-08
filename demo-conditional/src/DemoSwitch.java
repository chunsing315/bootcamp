import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args){
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("The grade is A");
                break;
            case 'B':
                System.out.println("The grade is B");
                break;
            case 'C':
                System.out.println("The grade is C");
                break;
            default:
                System.out.println("Low grade.");
        }

        //no break, the sequence of the cases will be executed [seldom]
        grade = 'A';
        int x =0;
        switch (grade){
            case 'A':
            x +=10;
            case 'B':
            x +=10;
            case 'C':
            x +=10;
            case 'D':
            x +=10;
        }
        System.out.println("score "+ x);
// Scanner input and month
        String MonthOfName = "unknown"
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a month number(1-12): ");
        int month = input.nextInt(); // line is int
        System.out.print("Please input a year number: ");
        int year= input.nextInt(); // line is int
        Switch (month) {
            case 1:
                MonthOfName = "January";
                break;
            case 2:
                MonthOfName = "February";
                break;            
            case 3:
                MonthOfName = "March";
                break;            
            case 4:
                MonthOfName = "April";
                break;            
            case 5:
                MonthOfName = "May";
                break;            
            case 6:
                MonthOfName = "June";
                break;            
            case 7:
                MonthOfName = "July";
                break;            
            case 8:
                MonthOfName = "August";
                break;           
            case 9:
                MonthOfName = "September";
                break;            
            case 10:
                MonthOfName = "October";
                break;            
            case 11:
                MonthOfName = "November";
                break;    
            case 12:
                MonthOfName = "December";
                break;    
        }
        System.out.println("month " + month);


    }
}