package demoinheritance.src.parent;

public class Father {
    private String name;
   // public Father(){
   // }

   // when there is non empty constructor, the class removes empty constructor
   public Father (String name){
    this.name = name;
   }

   public String fatherMethod(){
        return "this is a father method";
   }
   @Override
   public String toString(){
        return "this is a father toString";
   }
}
