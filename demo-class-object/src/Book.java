import java.time.LocalDate;

public class Book {  //class can survive by itself
    private String isbn;
    private String author;
    private LocalDate pubDate;

    //instance method (Object method)
    public void setISBN(String isbn){ //void is still a return type, but it is required to return nothing.
        this.isbn = isbn;
    }
    //instance method (Object method)
    public void setAuthor(String author){
        this.author = author;
    }
    //instance method (Object method, it belongs to object)
    public void setPubDate(LocalDate pubDate){
        this.pubDate = pubDate;
    }
    
    

    public String getISBN(){
        return this.isbn;
    }
    public String getAuthor(){
        return this.author;
    }
    public LocalDate getPubDate(){
        return this.pubDate;
    }
    public static String hello(String s){
        return s+"!!!";
    }

    
    public static void main(String[] args) { //static object belong to Class (Dead); like sysout.
        String b1AuthorName = "John";
        LocalDate b1PubDate = LocalDate.of(2025,1,12);

        //calling a instance method, you may have thousands of books
        Book b1 = new Book();
        b1.setAuthor(b1AuthorName);
        b1.setPubDate(b1PubDate);
        System.out.println(b1.getAuthor());  // static method: produce sth by the input parameter. only tool, not belong to any Objects.
        System.out.println(b1.getPubDate());
        System.out.println(Book.hello("peter"));// static method

    }
}


