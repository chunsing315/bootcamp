// Person.class is Parent, while Student.class is child
public class Student extends Person {
  private int studentId;

  // private String name;
  // private int age;

  // Constructor -> the process of constructing student object
  public Student(int studentId, String name, int age) {
    // calling Parent class constructor ...
    // 1. create Parent object inside Student Object (heap object)
    super(name, age);
    this.studentId = studentId;
    // this.name = name;
    // this.age = age;
  }

  // public String getName() {
  // return this.name;
  // }

  public int getStudentId() {
    // System.out.println(this.name);
    return this.studentId;
  }

  public void setAge(int age) {
    // 2. call parent object setAge() method
    super.setAge(age);
  }

  // public int getAge() {
  // return this.age;
  // }

  public static void main(String[] args) {
    Student s = new Student(1, "Vincent", 13); // Student object in heap memory
    System.out.println(s.getStudentId());
    System.out.println(s.getName());
    System.out.println(s.getAge());
  }
}
