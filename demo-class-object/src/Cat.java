import java.time.LocalDate;

public class Cat { //Class Name > name convention > able to describe physical object
    //state
    //attribute
    // object is in memory, file is in hard disk. 
    // what is "this"?
    private String name;
    private int age;


    // if no constructure, by default the class has empty constructor



    //behavior
    //instance medthod
    // setAge is only callable by the project
    // "this" > object pointed b y c1
    public void setAge(int x){ //someone throw something into the cat 🤣, the cat will eat it. The set is without return, so void. I am the creator of the rules of this world. In my world, cats has only age and name. That's the structue of the world
        this.age=x;
    } // this class can live on its own
    //instance method is able to access (read&write) the object attributes
    //static method should not access object attributes/ behaviors
    public void setName(String x){ 
    //  v object attribute, belong to object
        this.name=x;
        //        ^ input parameter, belongs to class
    } // this class can live on its own

    public int getAge() {
        return this.age;
    }

    public String describe(){
        return ("The age of this cat is "+this.age+", and the name of this cat is "+this.name+".");
    }

     public static void main(String[] args) { //static object belong to Class (Dead); like sysout.
        String b1AuthorName = "John";
        LocalDate b1PubDate = LocalDate.of(2025,1,12);

        //calling a instance method, you may have thousands of books
        Book b1 = new Book();
        b1.setAuthor(b1AuthorName);
        b1.setPubDate(b1PubDate);
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPubDate());

        Cat c3 = new Cat();
        System.out.println(c3.getAge()); //default value of string =0
    }
}