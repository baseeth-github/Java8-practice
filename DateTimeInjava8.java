import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeInjava8 {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();
        System.out.println("LocalDate " +localDate);
        LocalDate customisedDate= LocalDate.of(1998,3,15);
        LocalTime localTime= LocalTime.now();
        System.out.println("LocalTime "+localTime);
        LocalDateTime localDateTime=LocalDateTime.of(1998,3,15,20,30,55);
        System.out.println("LocalDateTime "+localDateTime);
        Instant inst=Instant.now();
        System.out.println("Instant "+inst);


    }
}
