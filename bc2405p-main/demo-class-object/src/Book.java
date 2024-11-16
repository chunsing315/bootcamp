import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Book {
  private String authorName;
  private LocalDate publishDate;

  // instance method (Object method)
  public String getAuthorName() {
    return this.authorName;
  }

  // instance method (Object method)
  public LocalDate getPublishDate() {
    return this.publishDate;
  }

  // instance method (Object method)
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  // instance method (Object method)
  public void setPublishDate(LocalDate publishDate) {
    this.publishDate = publishDate;
  }

  // static method
  public static String hello() {
    return "hello";
  }

  // static method
  public static void main(String[] args) {
    String book1AuthorName = "John";
    LocalDate book1PublishDate = LocalDate.of(1990, 12, 1);

    // instance method belongs to object
    Book book1 = new Book();
    book1.setAuthorName("John");
    book1.setPublishDate(LocalDate.of(1990, 12, 1));

    // static method belongs to Class
    Book.hello();
    System.out.println("hello");
  }
}
