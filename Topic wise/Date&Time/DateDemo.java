import java.util.*;

//OLD Date and Time API 
// 1 Date class 
// 2  calender class
// 3 TimeZone class

// miliseconds 1 Jan,1970
// date d object will contain date and time both
// date is mutable we can set date and time d.set

public class DateDemo {
    public static void main(String[] args) {
        // No of miliseconds passed from 1st Jan,1970 to till
        // System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);
        // System.out.println(Long.MAX_VALUE);

        // This Date works depenling upon no of miliseconds passed since 1970
        // Date d = new Date(System.currentTimeMillis());

        // deprecated API
        // Date d = new Date("1/1/2022");
        Date d = new Date();
        // System.out.println(d); // Date and Time conbined
        // days of a week stars from 0
        // System.out.println(d.getDate());
        // System.out.println(d.getMonth());
        // Starting calender year is 1900
        // System.out.println(d.getYear() + 1900);

        System.out.println(d.getTime());

    }
}