import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
    public static void main(String[] args) {
        double x = 0.2;
        double y = 0.1;

        BigDecimal b1 = new BigDecimal("0.2");
        BigDecimal b2 = new BigDecimal("0.1");
        
        BigDecimal b3 = b1.multiply(b2);
        System.out.println(b3.doubleValue()); //for all decimal places, use BigDecimal
        System.out.println(sum(x,y));
        System.out.println(0.1+0.2); //this is crazy: 0.30000000000000004
        double d3 = 9.9;
        double d4 = 3.1;

        System.out.println(div(d3,d4));
        //double is only for transfer

        System.out.println(b1.subtract(b2).multiply(b3)); //0.2-0.1*0.02, but it does not follow the order of operation
        System.out.println(BigDecimal.valueOf(0.1).subtract(BigDecimal.valueOf(0.9).divide(BigDecimal.valueOf(0.3211),3,RoundingMode.HALF_UP)));
    }   
    
    public static double sum(double d1, double d2){
        return BigDecimal.valueOf(d1).add(BigDecimal.valueOf(d2)).doubleValue();
    }

    public static double div(double d1, double d2){
        return BigDecimal.valueOf(d1).divide(BigDecimal.valueOf(d2), RoundingMode.HALF_UP).setScale(3,RoundingMode.UP).doubleValue(); //way to round
    }
}
