package marksix;

import java.util.Objects;

public class SmallBall extends Ball {
  private String color;

  // constructor
  public SmallBall(String color, int number) {
    super(number);
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  // toString()? equals()? hashCode?
  @Override
  public String toString() {
    return "SmallBall(" //
        + "color=" + this.color //
        + ", " + super.toString() //
        + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof SmallBall))
      return false;
    SmallBall smallBall = (SmallBall) obj;
    return Objects.equals(this.color, smallBall.getColor())
        && Objects.equals(this.getNumber(), smallBall.getNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color, super.getNumber());
  }

  public static void main(String[] args) {
    SmallBall b1 = new SmallBall("RED", 1);
    SmallBall b2 = new SmallBall("ORANGE", 2);
    SmallBall b3 = new SmallBall("ORANGE", 2);
    System.out.println(b2.equals(b3)); // true
    System.out.println(b2.equals(b1)); // false

    System.out.println(b1.hashCode()); // -2512241
    System.out.println(b2.hashCode()); // -491638955
    System.out.println(b3.hashCode()); // -491638955

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
  }
}
