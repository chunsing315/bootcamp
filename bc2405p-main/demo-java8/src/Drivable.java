// Annotation -> compiler will help verify if this interface contains one method
// only
@FunctionalInterface
public interface Drivable {
  boolean drive(int x);

  // if there are more than one abstract method in the interface,
  // Lambda expression is no longer allowed.
  // int sum(int x, int y);

  public static void main(String[] args) {
    Drivable driver = x -> x > 5;
  }
}
