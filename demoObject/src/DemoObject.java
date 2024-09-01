package demoObject.src;

import java.util.Scanner;

public class DemoObject {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(); //java.lang.StringBuilder
        Scanner scanner = new Scanner(System.in); //java.util.Scanner
        Object object = new Object(); // Object is an ultimate parent; but it doesn't have much, if any, method. so it is not ultimate tool
        object = Double.valueOf(13); // can be
        object = "abc"; //Object
        System.out.println(object.toString());
        object = new Cat("Fitfit"); //anything
        System.out.println(object.toString());// it will return the location of the Cat() in the memory.
        // it turns out toString() is in the class of object! so all class has object. 
        // until @override
        System.out.println("object object? "+object.equals(object));

        object = new Dog();
        System.out.println(object); // no method is default toString. 
        
        //hash code. Object.hashCode()
        Cat c1 = new Cat("meow");
        System.out.println(c1);
        System.out.println(c1.hashCode()); // generate an int value by object reference 1956725890.  If I 
        Cat c2 = new Cat("meow");
        System.out.println(c2.hashCode()); // 356573597
        System.out.println("Cat Cat equal? "+ c1.equals(c2));
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Cat Cat equal? "+ c1.equals(c2));

        String x1 = new String("abc");
        String x2 = new String("abc");
        System.out.println(x1.hashCode());//96354
        System.out.println(x2.hashCode());//96354
        System.out.println(x1.equals(x2));
        
        MiniCat mc1 = new MiniCat("Peter", "Red");
        MiniCat mc2 = new MiniCat("Peter", "Red");
        MiniCat mc3 = new MiniCat("John", "Red");
        MiniCat mc4 = new MiniCat("John", "Red");
        System.out.println(mc1.hashCode());//96354
        System.out.println(mc2.hashCode());//96354
        System.out.println(mc1.hashCode() == (mc2.hashCode())); //true, hashCode return int
        System.out.println(mc1.equals(mc2)); //false
        System.out.println(mc1==mc2); //false, that a new

        // String has overriden hashCode()
        Object cat = new Cat();
        //if the object reference is declared by Object.calss, it cannot call run() method
        //cat.run(); //compile error, the pointer is Object 
        
        //Cat cat2 =  cat; // Java compiler cannot guarentee 
        Cat cat2 = (Cat) cat; //this is a downcast. Java compiler cannot guarentee 
        System.out.println(cat2.run()); //compile error, the pointer is Object 

        /*Object cat3 = new Dog();
        Cat cat4 = (Cat) cat3; //runtime error
        if (cat3 instanceof Cat){
          cat4.run();
        } else {
          System.out.println(cat3+" cannot run because it is not an instanceof Cat.");
        } */

        System.out.println(cat2.hashCode());
        System.out.println(cat2.equals(cat));
        System.out.println(cat2 == cat);
        
    }

  //  public static Object sum(Object x, Object y){ //x and y can be Cat. Java won't let you gamble
   //     return x+y; //The operator + is undefined for the argument type(s) java.lang.Object, 

        //"+" operations -> String. Integer, int, Double, double, etc...
        // Java is a strong type language. It will ensure the type safety during compile time.
  //  }

    // During compile time, Compiler cannot ensure the object in heap is a String object
   // public static int length2(Object x){
        //return x.length();   =< compile error 
  //  }
}
