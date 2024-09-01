package demoinheritance.src.parent;

public class Child extends Father {

    // implicitly empty constructor
    //
    //public Child() ==> it cannot be run, 
    //Implicit super constructor Father() is undefined. Must explicitly invoke another constructor

    public Child(){
     //   super();      ==> empty constructor always call the parent empty constructor. 
     super("John"); //if you create a child object, you must call the parent
    }

    public Child(String name){  //the second way out of this. from the child to parent object
        super(name);
    }

    @Override
    public String toString(){
        return "this is child to string.";
    }

    public static void main(String[] args) {
        Child c = new Child("Vincent");
        Father f = new Father("John");
        Father f2 = new Child("Peter");
        //Child c2 = new Father() ;
        // not allowed

        int x = 1;// x is object reference type, 1-> int value
        System.out.println(f2.fatherMethod());
        System.out.println(f2);
    }
}
