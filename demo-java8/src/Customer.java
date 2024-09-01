public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "(Customer "// 
            + "name) " + this.name //
            + " (age) "+ this.age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    /*  @Override
//     public boolean equals(Object obj){
//         return this == obj {
//             return true;
//         } if (!(obj instanceof Customer))
//             return false;
//  */        Customercustomer = 
//     iint
}
