import java.math.BigDecimal;

public class NumberBox<T extends Number> {
  private T number;

  public NumberBox(T number) {
    this.number = number;
  }

  public static void main(String[] args) {
    NumberBox<Byte> byteBox = new NumberBox<>((byte) 1); // int -> byte -> Byte
    // Long extends Number and Byte extends Number
    //  NumberBox<Byte> has no relationship with NumberBox<Long>
    // byteBox = new NumberBox<Long>(); // NOT OK

    NumberBox<BigDecimal> bBox = new NumberBox<>(BigDecimal.valueOf(3.4));
  }

}
