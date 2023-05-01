import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;

// y = Year
// M = month
// d= day
// h =  Hour(0-12)
// H = Hour(0-23)
// m = minute
// s = seconds
// S = milliseconds
// z = time zone 
// Z = offset

public class DateTimeFormatter {
    public static void main(String[] args) {

        // LocalDateTime dt = LocalDateTime.now();
        // ZonedDateTime zdt = ZonedDateTime.now();
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        // DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd-MM-yyyy hh.mm.ss z Z
        // " ) ;
        // System.out.println(df.format(dt));
        // System.out.println(df2.format(zdt));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.get(ChronoField.AMPM_OF_DAY));

    }
}