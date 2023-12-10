package java_tutorial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class v100_java_time {
    public static void main(String[] args) {
        LocalDate d =LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter d2=DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate=dt.format(df);
        System.out.println(mydate);
    }
}
