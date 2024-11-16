public interface Walkable {
  // Interface:
  // 1. No instance variable
  // 2. all methods are "public abstract" implicitly
  // 3. you can still declare "public static final" implicitly
  // 4. A class can implements more than 1 interface, it can only extend one Parent class only

  // public static final int AGE = 3;
  // Constant
  int AGE = 3;

  // abstract void walk();
  void walk();

  // After Java 8, we have default method and static method in interface
  // can be overriden
  default void run() {
    System.out.println("default I am running ...");
  }

  static void swim() {
    System.out.println("static I am swimming ...");
  }

}
