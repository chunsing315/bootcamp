public class Cat { // Class Name -> Name Convention -> able to describe physical
                   // object

  // what is "this" ?
  // why setAge() and setName() are void methods?
  // why getAge() and getName() are methods with return type?

  // state
  // attributes
  private String name;
  private int age;

  // if NO constructorm is defined,
  // by default the class implicitly has a empty constructor

  // behavior
  // instance method
  // setAge() is a method that can be called by object only
  // For example, Cat c1 = new Cat();
  // c1.setAge(13);
  // "this" -> the object pointed by c1 (object reference)
  public void setAge(int age) {
    this.age = age;
  }

  // void is a return type, requires return nothing.
  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  // instance method
  public String describe(String x) {
    return "The age of this cat is " + this.age + ", and name of this cat is "
        + this.name + " " + x;
  }

  // static method
  public static String hello() {
    return "hello";
  }

  public static String hello(String s) {
    return s + "!!!";
  }

  public boolean isTooOld() {
    return this.age > 10;
  }

  public static void main(String[] args) {

    // the purpose of static method -> produce something by the input parameters
    // static method should not access any object attributes/ behaviors
    System.out.println(Cat.hello()); // hello
    System.out.println(Cat.hello("goodbye")); // goodbye!!!
    System.out.println(Book.hello()); // hello

    System.out.println(3); //

    // how to call describe()
    // instance method is able to access (read & write) the object attributes
    Cat cat = new Cat();
    cat.setAge(13);
    cat.setName("ABC");
    
    // The age of this cat is 13, and name of this cat is ABC .
    System.out.println(cat.describe(".")); 

    if (cat.getAge() > 10) { // what is defintion of age > 10?
      // consult doctor ...
    }
    if (cat.isTooOld()) { 

    }

  }

}
