public class customer implements People {
    private int age;
    private String name;

    public customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name +" (" + this.age+" years old)";
    }
    public static void main(String[] args) {

    }
}
