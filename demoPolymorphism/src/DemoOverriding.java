public class DemoOverriding {
    //Polymorphism > Overriding; during run-time
    //compile > run-time;

    public static void main(String[] args) {
        Animal animal = new Cat(); //this is nor clear
        animal.walk();
        //animal.run();  // Compile-time error, checks scope of the objec, but not the implementation.  The clas of animal has walk() only.
        // during runtime, the new cat object is created in heap memory, then the object reference
        // "animal", will point to the cat object and execute the Cat.walk() method 
        Animal animal2 = new Animal();
        // No relationship with Cat.class or Dog.class
        animal2.walk(); //Animal is walking

        // During run-time, the new animal object is created in heap memory
        // then the object ref "animal 2" will point to animal object and execute walk() method.
        // Animal.Walk();

        animal = new Dog();
        // animal.sleep(); //the type of the object reference (pointer) is Animal. Compile time error
        animal.walk(); //"animal is walking..."
        //the class of dog doesn't override the walk() method

        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Cat);
        System.out.println(animal instanceof Animal);


    }
}
