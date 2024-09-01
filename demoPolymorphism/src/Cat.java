public class Cat extends Animal{

    @Override
    public void walk(){
        System.out.println("This is a cat walk, overriding Animal run ...");
    }
    
    public void run(){
        System.out.println("Cat is running");
    }
}
