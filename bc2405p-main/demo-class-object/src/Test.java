public class Test {

  private int age;
  
  // static method
  public static String hello() {
    return "hello";
  }

  public static String hello(String s) {
    return s + "!!!";
  }

  public static void main(String[] args) {
    Test.hello();
    Test.hello("!!!");

    Test test = new Test();
  }
}
