import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
    private String fname;
    private String lname;
    private double height;
    private double weight;

    public String getfname(){
        return this.fname;
    }
    public String getlname(){
        return this.lname;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }

    public double BMI(){
        return BigDecimal.valueOf(this.weight).divide(BigDecimal.valueOf(Math.pow(this.height,2)),RoundingMode.HALF_UP).doubleValue();
    }

    public static double BMIStatic(double weight, double height ){
        return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(Math.pow(height,2)),RoundingMode.HALF_UP).doubleValue();
    }

    public void setFname (String fname){
        this.fname= fname;
    }
    public void setLname (String lname){
        this.lname= lname;
    }
    public void setweight (double weight){
        this.weight= weight;
    }
    public void setheight (double height){
        this.height= height;
    }
    public String fullname(){
        return this.fname + " " +this.lname;
    }

    public String toString(){
        return "Person's name: "+this.getfname()+" "+this.getlname()+"        Person's height: "+this.getHeight()+" m"+"        Person's weight: "+this.getWeight()+" kg"+"        Person's BMI: "+this.BMI();        
    }

    //Empty Constructor
    public Person(){

    }

    //All Arguments Constructor
    public Person(String fname, String lname, double height, double weight){
        this.fname = fname;
        this.lname= lname;
        this.height= height;
        this.weight= weight;
    }

    public static void main(String[] args) {
        Person p1 = new Person(); //new Person() object in memory. it is a Constructor
        //create a person with given attribute
        Person p2 = new Person("Peter","Bluberry",1.52,55);
        Person p3 = p2;
        p1.setLname("Stanley");
        p1.setFname("Morgan");
        p1.setheight(1.77);
        p1.setweight(84.5);
        System.out.println(p1.toString());
        System.out.println(p2.fullname());
        System.out.println(p2.fullname()+"'s old weight: " +p2.getWeight());
        p2.setweight(30.2);
        System.out.println(p2.fullname()+"'s new weight: " +p2.getWeight());
        System.out.println("p2's name: "+p2.fullname());
        System.out.println("p3 is p2, so it's name: "+p3.fullname());
        System.out.println("what if i change p3's name to Deutsche Bank?");
        p2.setFname("Deutsche");
        p2.setLname("Bank");
        System.out.println("p2's name: "+p2.fullname());
        System.out.println("p3 is p2, so it's name: "+p3.fullname());
        System.out.println("p2 also change because the memory underlying changed.");
        new Person(); // can new it, but no one can recall this guy.
        // two pointer pointing to the same memory let you free up the first pointer to point at sth else
        //this allows you to swap. heap memory is untouchable without memory
        // Object Reference has object address to find object in heap memory. object has attribute:
        // p1.setAge(13) => this.age=13
        // ^ stack memory      ^ heap memory
            
        
        
    }

}

