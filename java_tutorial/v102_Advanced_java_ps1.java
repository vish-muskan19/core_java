package java_tutorial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class v102_Advanced_java_ps1
{
    public static void main(String[] args) {

/* 1  Create an ArrayList and store the names of ten students inside it. Print it using a for each loop. */
        ArrayList a=new ArrayList();
        a.add("student 1");
        a.add("student 2");
        a.add("student 3");
        a.add("student 4");
        a.add("student 5");
        for (Object element:a){
            System.out.println(element);
        }

/* 2 Use the Date class in Java to print the time in the following format : 21:47:02. */
        Date D=new Date();
        System.out.println(D.getHours()+":"+D.getMinutes()+":"+D.getSeconds());

/* 3 Repeat question number 2 using the Calendar class. */
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

/* 4 Repeat question number 2 using java.time API. */
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H|m|s"); // This is the format
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println(myDate);

/* 5 Create a Set in java. Try to store the duplicate values elements inside this set and verify that only one instance is stored. */
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);
        System.out.println(s);
    }
}
