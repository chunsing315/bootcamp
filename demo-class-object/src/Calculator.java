import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    
    //instance method
    private int num1;
    private int num2;

    public void setNum1 (int num1){
        this.num1=num1;
    }
    public void setNum2 (int num2){
        this.num2=num2;
    }

    public int sum(){
        return this.num1+this.num2;
    }
    public int multiply(){
        return this.num1*this.num2;
    }
    /* public double divide(){
        BigDecimal bd1 = BigDecimal.valueOf(this.num1);
        BigDecimal bd2 = BigDecimal.valueOf(this.num2);
        double d1 = bd1.divide(bd2).doubleValue(); //wrong
        return d1;
    } */
    //c1.sum(); 2+3
    //c1.multiply(); 2+
    
    public static double sum(double x , double y){
        System.out.println("double running...");
        return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
    }
    public static double subtract(float x , float y){
        System.out.println("float xy running...");
        return BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
    }
    public static double subtract(float y , float x){ // Java cannot tell tell the difference, but out xy
        System.out.println("float yx running...");
        return BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
    }

    public static void test(String[] args){
        for (int i = 0; i<args.length; i++){
            System.out.println(args[i]);
        }
    }
    
    public static void test2 (String... args){
        //for-each
        for (String s : args){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setNum1(55);
        c1.setNum2(7);
        System.out.println(c1.sum());
        System.out.println(c1.multiply());
        
        
        // Overloading. Like multiple method determine by the parameter
        System.out.println(sum(1.1,1.2));
        System.out.println(sum(1.1f,1.2f));
        System.out.println(subtract(1.1f,1.2f));


        System.out.println(String.valueOf(10L)); 
        System.out.println(String.valueOf(new char[] {'a','b','c'}));
        
        Calculator.test(new String[] {"abc","ijk"});
        
        Calculator.test2(new String[] {"abc","ijk"});
        Calculator.test2("abc","ijk"); //flexible with...
    }
}
