import java.util.*;

//OLD Date and Time API 
public class CalenderAndTimeZone {
    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.isLeapYear(2020));
        // System.out.println(gc.isLeapYear(new Date().getYear() + 1900));

        // In this method we have to field
        // and those field are available in a class Calender
        // System.out.println(gc.get(Calendar.WEEK_OF_MONTH));// Starts from 1
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.MINUTE));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(gc.getTimeZone().getDisplayName() + " \n" + gc.getTimeZone().getID());
    }
}
