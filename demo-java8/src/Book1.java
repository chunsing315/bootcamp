public class Book1 { //
    private double price;
    private double discount;
    private String author;



    // Type of instance method
    // getter, setter...
    // presentation -> definition, string.substring
    public boolean isTooExpensive() {
        return this.price > 100;
    }

    // transform (substring, replace)
    // return new
    // only a few StringBuilder is self-editing
    // return this
    public static void main(String[] args) {
        Book book = new Book(99.9,"Stephen King");
        System.out.println(book.price());
        System.out.println(book.author());
        System.out.println(book.toString());
        Book book2 = new Book(99.9,"Stephen King");
        Book book4 = new Book(99.9,"Stephen Kings");
        Book book3 = new Book(99.8,"Stephen King");
        System.out.println(book2.equals(book4));
        System.out.println(book.equals(book2));
        System.out.println(book3.equals(book2));
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book4.toString());
        

    }
}
