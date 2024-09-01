import java.math.BigDecimal;

public class App {
    private BigDecimal length;

    public BigDecimal area(){
        return this.length.multiply(this.length);
    }

    public void getlength(BigDecimal length){
        this.length = length;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App s = new App();
        s.getlength(5.0);
        System.out.println(s.area().toString());
    }
}
