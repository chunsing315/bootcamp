package demoObject.src;
import java.time.LocalDate;
import java.util.Objects;

public class Book extends Object{ //implicitly inherit Object.class
    private String author;
    private LocalDate pubDate;


    public Book(String author, LocalDate pubDate) {
        this.author = author;
        this.pubDate = pubDate;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getPubDate() {
        return pubDate;
    }
    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    //if not override, hasCode() by default represents the object address
    @Override
    public int hashCode(){
        return Objects.hash(this.author,this.pubDate);
    }

    // if you override it, the putrpose is to make it become true even if different object in heap
    @Override
    public boolean equals(Object obj){
        // same addree, return true and getout
        if (this == obj) {
            return true;
        } 
        // checking if obj is a child of Book.
        if (!(obj instanceof Book)){
            return false;
        } 
        Book book = (Book) obj; //this downcast must be ok because obj in instance of Book
        /*if (book.getAuthor().equals(this.author) && (book.getPubDate().compareTo(this.pubDate)==0)){
            return true;
        }
        return false; */

        return Objects.equals(this.author, book.getAuthor()) 
        && Objects.equals(this.pubDate, book.getPubDate());
    }


    public static void main(String[] args) {
        Book b1 = new Book("John", LocalDate.of(2000,12,12));
        Book b2 = new Book("John", LocalDate.of(2000,12,12));
        Book b3 = new Book("John", LocalDate.of(2000,12,13));
        System.out.println(b2.hashCode()); //in overriden hashCode, they are the same, because only Local date and author are used to hash
        System.out.println(b1.hashCode());
        System.out.println(b1.equals(2));
        System.out.println(b2);
        System.out.println(b3.hashCode());
        System.out.println(System.identityHashCode(b1)); //b1 and b2 are different object
        System.out.println(System.identityHashCode(b2)); //b1 and b2 are different object
        
        //Object.class has equals() method
        System.out.println(b1.equals(b2)); //check object address, by default i.e. identityHashCode(b1)=identityHashCode(b2)
        System.out.println(b1.equals(new Cat())); //false
        //if both objects are located in different address ==> false
        System.out.println(b1.equals(b3)); 

        String str2 = "bbbabcdefghijklxyz";
        System.out.println(str2.hashCode()); //overflow

        Object i3= 365;
        System.out.println(i3.hashCode());

        Object s1 = new String("abcd");
        Object s2 = new String("abcd");

        //Compile time determin if s1 is able to call equals()
        //Run time determin the implementation (method content) of equals() method
        System.out.println(s1.equals(s2)); //true. this is runtime method: it is on the object. object does not have string's overriden equals.
        //but the pointed object is still the same.
        String s3 = new String("abcd");
        Object s4 = new String("abcd");
        System.out.println(s3.equals(s4)); //we are calling String's equal. 

        Object s5 = new Object();
        Object s6 = new Object();
        System.out.println(s6.equals(s5)); //we are calling Object's equal. 





    }

}


