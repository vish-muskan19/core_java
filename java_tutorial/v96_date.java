package java_tutorial;

public class v96_date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("Number of seconds passed:"+System.currentTimeMillis()/1000);
        System.out.println("Number of hours passed:"+System.currentTimeMillis()/1000/3600);
        System.out.println("Number of days passed:"+System.currentTimeMillis()/1000/3600/24);
        System.out.println("Number of year passed:"+System.currentTimeMillis()/1000/3600/24/365);

//        Question: Is it safe to store the number of milliseconds in a variable of type long?
        System.out.println(Long.MAX_VALUE); //
        System.out.println(System.currentTimeMillis());
    }
}
