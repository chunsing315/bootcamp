package demoAbstraction.src;

//interface:
//1. no instance variable
//2. all methods are "public abstract" implicitly
//3. you can still declare "public static final"
//4. it can extends 1 parent class only, but multimple interface can be implemented
public interface Walkable {
    void walk();

    int AGE = 3; //this is a constant, all caps
    // public static final int number = 3

   /*  void run(){  // this doesn't work
    } */

    //After Jva 8 , we have default method and static method in interface
   default void run(){
    System.out.println("default I am running ...");
   };

   static void swim(){
    System.out.println(" Static I am swimming ... ");
   }
}
