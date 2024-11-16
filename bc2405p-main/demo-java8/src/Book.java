public record Book(double price, String author) {
  // with:
  // 1. getter -> price(), author()
  // 2. One default constructor only - all-args constructor
  // 3. attributes are private final
  // 4. Already support equals(), hashCode(), toString
  // 5. Class is final (cannot be extended)
  // 6. Support custom instance method
  // 7. Support static method
  // 8. Support static, static final
  // 9. Do NOT support final custom instance variable (price & author)
  // 10. DO NOT support custom constructor

  // Constant
  public static final double MIN_PRICE = 10.0;

  // No custom constructor
  // public Book(String author) {
  //   this.author = author;
  // }

  // public final double  = 0.0;

  public static double calculateFinalPrice(double price, double discount) {
    return price * (1 - 0.2);
  }

  public boolean isTooExpensive() {
    return this.price > 100;
  }

  // all attribute are final
  // public void setPrice(double price) {
  //   this.price = price;
  // }
}
