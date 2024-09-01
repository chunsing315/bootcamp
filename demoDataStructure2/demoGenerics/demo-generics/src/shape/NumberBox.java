package shape;

import java.math.BigDecimal;

public class NumberBox<T extends Number> {  //99% use 'extends'
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public static void main(String[] args) {
        NumberBox<Byte> byteBox = new NumberBox<>((byte) 1);
        // byteBox = new NumberBox<Long>();     //not ok
        // Long extends Number and Byte extends Number
        // NumberBox<Byte> has no relationship with NumberBox<Long>
        NumberBox<BigDecimal> bBox = new NumberBox<>(BigDecimal.valueOf(3.4));


    }
}
