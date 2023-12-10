package java_tutorial;

import java.util.Date;

public class v97_date_class {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        Date d2=new Date(1621709639111l);
        System.out.println(d2);

        Date d3= new Date(2022,11, 22);  //both dates are different
        System.out.println(d3.compareTo(d));

        System.out.println(d.getTime());
        System.out.println(d.getYear());//19
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
    }
}
