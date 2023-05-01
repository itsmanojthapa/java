import java.time.*;

//New Time API
// java.time Classes
// for each minor thing exist seprate Class
// 1 ZonedDateTime
// 2 OffsetDateTime
// 3 OffsetTime 
// 4 Zoneld 
// 5 MOnthDay 
// 6 YearMonth 
// 7 Year 
// 8 Period 
// 9 Duration 
// 10 Instant 

public class JavaDotTimeClasses {
    public static void main(String[] args) {

        // ZonedDateTime zdt = ZonedDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);
        // almost methods are same LoacalDate and Time
        System.out.println(odt.plusHours(5));

        MonthDay md = MonthDay.now();
        System.out.println(md.atYear(2000));
        System.out.println(md);

        Period p = Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);

    }
}