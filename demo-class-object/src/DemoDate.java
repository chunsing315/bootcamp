import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoDate {
    public static void main(String[] args) {
        //17 types (8 primitive + 8 wrapper class + String)
        System.out.println((LocalDate.of(2024,5,31)));
        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2024,12,25);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ld.toString());
        System.out.println(ldt); //same
        System.out.println(ld.plusDays(1L));
        System.out.println(ld.plusMonths(18));

        //Month month = ld.getMonth();
        //String monthString = month.toString();

        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonth().toString());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfWeek());
        long daysbetween = TimeUnit.DAYS.between(ld2,ld);
        System.out.println(daysbetween);



    }
}
