package java_tutorial;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class v99_gregorian {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        
        GregorianCalendar cal=new GregorianCalendar();  // Gregorian Calendar

        /*isLeapYear(int year)
        Checks if the year passed as a parameter is a leap year or not.
        This method returns a boolean value */
        System.out.println(cal.isLeapYear(2020));


        /* roll(int field, boolean up) :
           This method adds/subtracts a single unit of time from the specified time field.
           true = rolls up the value by 1. */

        cal.roll(Calendar.MONTH, true);
        cal.roll(Calendar.DATE, false);
        cal.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + cal.getTime());

        /* hashcode(): This method returns the hashcode of the calendar object */
        System.out.println("The hashcode for this calendar is : "+ cal.hashCode());

        /* TimeZone */
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        System.out.println(TimeZone.getAvailableIDs());
        System.out.println(TimeZone.getDefault());

    }
}
