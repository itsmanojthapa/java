import java.time.*;

//New API 
//introduced java-v8
// 1 LocalDate
// 2 LocalTime
// 3 LocalDateTime

//here is a seprate class for date,localdate,time 
//and also a class availabe for date and time togather

// tese classes will represent the time in the from of seconds and nanoseconds
// when nonosec are equals to one sec the  seconds incremented and again nonosec start from zero onwards
//immutable u can cannot change date or time u can not change any thing
//but when ever u chnage any time u get new type of Object of type Local Date

public class JodaDateAndTimeAPI {
    public static void main(String[] args) {

        // LocalDate ld = LocalDate.now();
        // LocalDate ld = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        // LocalDate ld = LocalDate.of(2022, Month.MARCH, 4);
        // LocalDate ld = LocalDate.now(Clock.systemDefaultZone());
        LocalDate ld = LocalDate.parse("2020-03-04");
        // LocalDate ld = LocalDate.ofEpochDay(20); // epocj day is 1 jan 1970
        System.out.println(ld);

        // when u plush date time day it returns back and new object gets created
        // do not changes the current obj
        System.out.println(ld.plusDays(26));
        System.out.println(ld.minusMonths(1));
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt.minusHours(25));
        System.out.println(lt.plusHours(25));
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
    }
}
