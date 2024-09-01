package demoinheritance.src;

public class Person2 {
   
    private String name;
    public int age;

    public Person2(String name, int age){
        this.name = name;
        this.age= age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age= age;
    }

    public static void main(String[] args) {
        Person2 p = new Person2("Vincent",30);
        //Student s = new Student("Vincent", 001, 30);
    }
}

