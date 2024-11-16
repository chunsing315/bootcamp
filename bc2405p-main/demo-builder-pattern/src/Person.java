public class Person {
  private String name;
  private int age;
  // 20 attributes

  // Builder pattern should not contain any public constructor
  public Person() {

  }

  // Builder pattern should not contain any public constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private Person(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }
  
  public static Builder builder() {
    return new Person.Builder();
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static class Builder {
    private String name;
    private int age;

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  public static void main(String[] args) {
    // Traditional
    Person person = new Person();
    person.setAge(18);
    person.setName("John");
    Person person3 = new Person("Sally", 19); // what if 20 attributes? ->
                                              // careless mistakes

    // Builder Pattern
    Person person2 = Person.builder() // create new Builder object
        .name("John") // return current builder object
        .age(18) // return current builder object
        .build(); // create Person object

    System.out.println(person2.getAge() + " " + person2.getName()); // 18 John

  }
}
