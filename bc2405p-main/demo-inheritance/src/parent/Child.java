package parent;

public class Child extends Father {

  // implicitly empty constructor
  public Child(String name) {
    super(name);
    // super();
    // super("John");
  }

  public static void main(String[] args) {
    Child c = new Child("Vincent");
    Father f = new Father();
    Father f2 = new Child("John");
    // Child c2 = new Father();
    // not allowed, parent object cannot be assigned to child reference type

    int x = 1; // x -> int object reference type, 1 -> int value
  }
}
