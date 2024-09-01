package demoAbstraction.src;

//Class can only be inherit instance methods, instance variables.
// Constructor CANNOT be inherited.

public class Human extends SuperHuman implements Walkable,Readable {

    
public Human (double height){
    super(height);
}

@Override
public void walk(){
    System.out.println("Human is walking ...");
}

@Override
public void read(){
    System.out.println("Human is reading ...");
}
/* @Override
public void run(){
    System.out.println("Human is running ...");
} */

@Override
public double getHeight(){
    return super.getHeight();
}

public static void main(String[] args) {
    System.out.println(Walkable.AGE);    

    Human h1 = new Human(177.0);
    h1.walk();
    h1.read();
    h1.run();

    SuperHuman superman = new SuperHuman();
    superman.run();
    Walkable.swim();
}


}
