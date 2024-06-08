import java.util.Scanner;

public class JavaQuest3 {
    public static void main(String[] args){
    // Scanner input and month
        String MonthOfName = "unknown";
        int number_Of_DaysInMonth;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a month number(1-12): ");
        int month = input.nextInt(); // line is int
        System.out.print("Please input a year number: ");
        int year= input.nextInt(); // line is int
        switch (month){
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;

                break;
            case 2:
                MonthOfName = "February";
                if (year%100 != 0 || year%4 == 0 || year % 400 == 0) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth =28;
                }
                break;            
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;            
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;            
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;            
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;            
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;            
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;           
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;            
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;            
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;    
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
                break;    
        }
        if 

        System.out.println(MonthOfName + " " +year+" has "+ number_Of_DaysInMonth+ " days\n");    

        }
    }