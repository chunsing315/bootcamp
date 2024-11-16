import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // 17 types (8 primitives + 8 wrapper classes + String)
    // simliar to valueOf
    LocalDate ld = LocalDate.of(2022, 12, 31);
    System.out.println(ld); // 2022-12-31

    // LocalDate ld2 = LocalDate.of(2022, 12, 32); // java.time.DateTimeException

    System.out.println(ld.plusDays(1L)); // 2023-01-01
    System.out.println(ld.plusMonths(3L));
    System.out.println(ld.plusYears(2L)); 
    System.out.println(ld.plusWeeks(1L)); 
    System.out.println(ld.minusDays(100L));

    Month month = ld.getMonth();
    String monthString = month.toString();
    System.out.println(ld.getMonth()); // DECEMBER
    System.out.println(ld.getMonth().toString()); // DECEMBER

    System.out.println(ld.getYear()); // 2022, int
    System.out.println(ld.getDayOfMonth()); // 31, int
    System.out.println(ld.getDayOfYear()); // 365
    System.out.println(ld.getDayOfWeek()); // SATURDAY

  }
}
