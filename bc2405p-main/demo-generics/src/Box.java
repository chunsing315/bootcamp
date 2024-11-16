import shape.Bird;

public class Box<T> { // <T> just like 未知 & any Type
  private T value;

  public Box() {

  }

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  // The T declared in static method has NO relationship to the T declared in attribute
  public static <T> Box<T> createBox(T value) {
    return new Box<>(value);
  }

  public static void main(String[] args) {
    // Run time
    // You have to define the type <T> during run-time
    Box<Integer> integerBox = new Box<>();
    integerBox.setValue(100); // int -> Integer
    Box<Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer());

    // You cannot use T during run-time
    // Box<T> box = new Box<>();

    Box<String> stringBox = Box.createBox("hello");
    Box<Bird> birdBox = Box.createBox(new Bird());
  }
}
