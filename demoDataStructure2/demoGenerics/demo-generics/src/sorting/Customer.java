package sorting;

public class Customer {
    int age;

    public Customer(){}
    public Customer(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Customer(" //
        + "age = "+ this.age//
        +")";
    }
}
