public enum Currency {
  HKD("Hong Kong Dollar.", 1), // similar to new Currency("Hong Kong Dollar.")
  USD("US Dollar.", 2), //
  JPY("YEN.", 3), //
  ;

  // instance variable
  private final String description;
  private final int DBValue;

  // Constructor
  private Currency(String description, int DBValue) {
    this.description = description;
    this.DBValue = DBValue;
  }

  // instance methods
  public String getDescription() {
    return this.description;
  }

  public int getDBValue() {
    return this.DBValue;
  }

  @Override
  public String toString() {
    return "Currency(" //
        + "description=" + this.description //
        + "DBValue=" + this.DBValue //
        + ")";
  }

  // 2 -> USD, 3 -> JPY
  public static Currency get(int DBValue) {
    for (Currency curr : Currency.values()) {
      if (DBValue == curr.getDBValue())
        return curr;
    }
    return null; // throw exception (we teach later...)
  }

  public static int get(Currency currency) {
    return currency.getDBValue();
  }

  public static String fullDescription(Currency currency) {
    // if (currency == Currency.HKD) {
    // return "It is Hong Kong Dollar.";
    // } else if (currency == Currency.USD) {
    // return "Hello world";
    // } else if (currency == Currency.JPY) {
    // return String.valueOf(currency.getDBValue());
    // }
    // return null;

    // Alternative: switch (before java 14) + enum (perfect match)
    switch (currency) {
      case HKD:
        return "It is Hong Kong Dollar.";
      case USD:
        return "Hello world";
      case JPY:
        return String.valueOf(currency.getDBValue());
      default:
        return null;
    }
  }

  public static void main(String[] args) {
    // Currency currency = "HKD";
    // Currency currency = Weekday.MONDAY;
    Currency currency = Currency.HKD;
    if (currency == Currency.USD) {
      System.out.println("it is " + currency.getDescription());
    } else if (currency == Currency.HKD) {
      System.out.println("it is " + currency.getDescription()); // it is Hong
                                                                // Kong Dollar.
    } else if (currency == Currency.JPY) {
      System.out.println("it is " + currency.getDescription());
    }

    System.out.println(currency); // "Currency(description=Hong Kong
                                  // Dollar.DBValue=1)"

    // ENUM already override Object.toString() -> HKD
    System.out.println(currency.toString()); // "Currency(description=Hong Kong
                                             // Dollar.DBValue=1)"

    // default instance methods provided by ENUM.class
    // 1. name()
    System.out.println(currency.name()); // "HKD"

    // 2. values() -> for-each loop
    for (Currency c : Currency.values()) {
      System.out.println(c.getDescription());
    }

    System.out.println(Currency.values().length); // 3

    System.out.println(Currency.HKD.hashCode()); // 705927765
    System.out.println(Currency.USD.hashCode()); // 366712642

    System.out.println(Currency.JPY.equals(currency)); // false
    System.out.println(Currency.HKD.equals(currency)); // true

    System.out.println(currency.equals(Currency.HKD)); // not a good coding
                                                       // style
    System.out.println(currency != null && currency.equals(Currency.HKD)); // better

    String x = "abc";

    // NOT OK
    if (x.equals("abc")) { // potentially null pointer exception

    }

    // OK
    if ("abc".equals(x)) { // false or true

    }

    System.out.println(Currency.get(2)); // toString(), Currency(description=US
                                         // Dollar.DBValue=2)

    // 3. valueOf() -> static method
    System.out.println(Currency.valueOf("HKD").name()); // "HKD", "HKD" ->
                                                        // Currency enum ->
                                                        // name() -> "HKD"
    System.out.println(Currency.valueOf("123").name()); // java.lang.IllegalArgumentException
  }



}
