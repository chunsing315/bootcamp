public class Person {
    private String name;
    private int age;

    public static Builder builder() {
        return new Person.Builder();
    }

    // public Person() {
    // } // builder pattern shouldn't contain public constructor

    private Person(Builder builder) { // this is private, attribute can only build
        this.name = builder.name;
        this.age = builder.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder age(int age) {
            this.age = age;
            return this; // by returning itself, it can dot dot dot without regarding the sequence
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
        // Person person = new Person();
        // Person person3 = new Person("John",19); // this is blocked
        // person.setAge(18);
        // person.setName("John");
        // builder pattern
        Person person2 = Person.builder()// create Builder object
                .name("John")//
                .age(18)// suitable for many attribute

                .build();
        System.out.println(person2.getAge() + " " + person2.getName());
        // System.out.println(person3.getAge() + " " + person3.getName());

        Person person1 = Person.builder()//
                .age(29)//
                .build();

        person1.setName("Peter");
        System.out.println(person1.getAge()+ " " + person1.getName());
    }

}
