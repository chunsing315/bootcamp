//import com.apple.laf.AquaIcon;

public class DemoDividedByZero {

    public static void main(String[] args) throws Exception {
        int amount = 0;
        System.out.println(divide(10,2));

        // Approach 1: I know how it will crash. A specific case.
        if (amount != 0) {
            System.out.println(divide(10,amount));
        } else {
            System.out.println("amount is 0.");
        }
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        
        // Approach 2: handle exception
        // unchecked exception (Runtime Exception)
        // you can have a lot of procedure after the crash.

        // 1) return int
        // 2) throw                     (only one, throw exception)
        // / by zero is an implicit throw.  All run time exception are implicit. 
        try{
            //System.out.println(divide(10,amount));
            String s = "Hello";
            System.out.println(s.charAt(2));
            s = null;
            System.out.println(s.charAt(2)); //NullPointerException
        } catch (ArithmeticException e){
            System.out.println("Divided by 0. Send email to teammate");
            System.out.println("insert sth in database");
        } catch (NullPointerException e) {
            System.out.println("NPE: Please check.");
        }

        double expense = expensePerEmployee();
        System.out.println(expense);

        //Approach 2:
        try{
            double averageExpense = expensePerEmployee2();
        } catch (ArithmeticException e){
            System.out.println("Something to fix...");
        }
        
        //Approach 3:
        expensePerEmployee3();
    }

    private static double divide(int i, int j) {
        return i / j;
    }

    public static int expensePerEmployee() {
        try {
            return getDepartmentExpense() / getEmployeeCount();
        } catch (ArithmeticException e) {
        }
        return getDepartmentExpense();
    }

    public static int expensePerEmployee2() {
        return getDepartmentExpense() / getEmployeeCount();
    }

    // Appoach3
    public static int expensePerEmployee3() {
        try {
            return getDepartmentExpense() / getEmployeeCount();
        } catch (ArithmeticException e) {
            throw new EmployeeCountZeroException();
        }
    }

    public static int getEmployeeCount() {
        return 0;
    }

    public static int getDepartmentExpense() {
        return 140_000;
    }
}
