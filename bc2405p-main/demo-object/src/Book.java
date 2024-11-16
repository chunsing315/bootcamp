import java.time.LocalDate;
import java.util.Objects;

// public class Book extends Object {}
public class Book { // implicitly inherit Object.class
  private String author;
  private LocalDate publishDate;

  public Book(String author, LocalDate publishDate) {
    this.author = author;
    this.publishDate = publishDate;
  }

  public String getAuthor() {
    return this.author;
  }

  public LocalDate getPublishDate() {
    return this.publishDate;
  }

  // if you do not @Override, the hashCode() method by default representing the
  // object address
  @Override
  public int hashCode() {
    return Objects.hash(this.author, this.publishDate);
  }

  // if you override it, the purpose is to make it become ture even if they are
  // 2 different object in heap memory
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    // "instanceof" is checking if the object pointing by reference is an object
    // produced by Book.class
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj; //
    return Objects.equals(this.author, book.getAuthor())
        && Objects.equals(this.getPublishDate(), book.getPublishDate());
    // if (book.getAuthor().equals(this.author)
    // && book.getPublishDate().compareTo(this.publishDate) == 0) {
    // return true;
    // }
    // return false;
  }

  public static void main(String[] args) {
    Book b1 = new Book("John", LocalDate.of(2000, 12, 12));
    Book b2 = new Book("John", LocalDate.of(2000, 12, 12));

    System.out.println(b1.hashCode()); // 75848450
    System.out.println(b2.hashCode()); // 75848450

    Book b3 = new Book("John", LocalDate.of(2000, 12, 13));
    System.out.println(b3.hashCode()); // 75848451

    System.out.println(b1 == b2); // false

    // Beacuse b1 & b2 are different objects
    System.out.println(System.identityHashCode(b1)); // 1933863327
    System.out.println(System.identityHashCode(b2)); // 112810359

    // Object.class has equals() method
    // if you do not override, equals() by default checking object address
    // System.out.println(b1.equals(b2)); // false, if you do not override
    System.out.println(b1.equals(b2)); // true, after @Override
    System.out.println(b1.equals(b3)); // false, after @Override

    // if both objects are located in different address, equals() must return
    // false (No override)
    System.out.println(b1.equals(new Cat())); // false

    String str = "abc";
    System.out.println(str.hashCode()); // 96354
    System.out.println(97 * (int) Math.pow(31, 2) + 98 * 31 + 99); // 96354

    // Implication:
    // there will be another string value with same hash code.
    // 2 different string potentially can be with same hash code.
    String str2 = "abcdefghijklxy";
    System.out.println(str2.hashCode());

    String str3 = "bbcdefghijklxy";
    System.out.println(str3.hashCode()); // overflow

    Integer i3 = 365;
    System.out.println(i3.hashCode()); // 365

    System.out.println(new String("abc").equals(new String("abc"))); // true

    // "Compile time" determine if s1 is able to call equals()
    // "Run time" determine the implementation (method content) of equals() method
    Object s1 = new String("abcd");
    Object s2 = new String("abcd");
    System.out.println(s1.equals(s2)); // true (Runtime: String.equals())

    Object s3 = new Object();
    Object s4 = new Object();
    System.out.println(s3.equals(s4)); // false (Runtime: Object.equals())


  }
}
