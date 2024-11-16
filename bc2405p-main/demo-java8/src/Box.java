public class Box<T> {
  T data;

  public Box(T data) {
    this.data = data;
  }

  public static void main(String[] args) {
    //
    Box<String> box = null; // NPE
    //
    Box<String> box2 = new Box<>(null);
    
  }
}
