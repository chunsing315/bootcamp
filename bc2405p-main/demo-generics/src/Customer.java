public class Customer {
  private int age;

  public Customer() {}

  public Customer(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Customer(" //
        + "age=" + this.age //
        + ")";
  }

}
