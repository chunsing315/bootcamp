interface Vegetarian {
    default public String eat(){
        return "Veg";
    }
}
interface Runner {
    default public String eat(){
        return "Run";
    }
}

public class Pig extends Animal{
    public String eat(){
        return "Pig";
    }

    class Animal {
        public String eat() {
            return "Animal";
        }
    

    }
    public static void main(String[] args) {
        Pig pig = new Pig();
        System.out.println(pig.eat());
    }
}



