public class Book1 {
  private double price;
  private String author;

  public Book1(double price, String author) {
    this.price = price;
    this.author = author;
  }

  // Type of instance method:
  // getter, setter..
  // presentation -> defintion, String.substring
  public boolean isTooExpensive() {
    return this.price > 100;
  }
  // transform (String.replace)

  public static void main(String[] args) {
    Book book = new Book(99.9, "John");
    System.out.println(book.price()); // 99.9
    System.out.println(book.author()); // "John"
    // System.out.println(book.price); // private

    Book book2 = new Book(99.9, "John");
    Book book3 = new Book(99.9, "Ann");
    // equals()
    System.out.println(book.equals(book2)); // true
    System.out.println(book.equals(book3)); // false
    // hashCode()
    System.out.println(book.hashCode() == book2.hashCode()); // true
    System.out.println(book.hashCode() == book3.hashCode()); // false
    // toString()
    System.out.println(book);
    System.out.println(book2);
    System.out.println(book3);
  }

}
