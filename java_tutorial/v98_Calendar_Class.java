package java_tutorial;

import java.util.Calendar;
import java.util.TimeZone;

public class v98_Calendar_Class {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType()); //getCalendarType() returns the type of the calendar
        System.out.println(c.getTimeZone());

        Calendar c1=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//        Calendar c1=Calendar.getInstance();


        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());

        System.out.println("Current year is :"+c.get(Calendar.YEAR));  //get(int field) :
        System.out.println("Current Month is :"+c.get(Calendar.MONTH));
        System.out.println("Current Day of month is :"+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Current Day of week is :"+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current Hour of Day is :"+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current Minute is :"+c.get(Calendar.MINUTE));
        System.out.println("Current Second is :"+c.get(Calendar.SECOND));
        System.out.println("Current hour is :"+c.get(Calendar.HOUR));

        System.out.println("Current date is : " + c.getTime());  //add(int field, int amount) :
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

        System.out.println(c.getWeeksInWeekYear()); //getWeeksInWeekYear() :

        System.out.println("The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR)); //getMaximum(int field)

    }
}
