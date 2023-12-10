package java_tutorial;

import java.util.Scanner;

class Exceptiononretry extends Exception{
    @Override
    public String getMessage(){
        return "Error";
    }
}

public class v86_ps14 {
    public static void throwexception(int i) throws Exceptiononretry{
        if (i<=5){
            throw new Exceptiononretry();
        }
    }

    public static void main(String[] args) {
//        int age = 78;
//        int year_born = 2000-78; // Logical error
//        System.out.println(6/0);

//        try{
//            int a=6000/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("HeHe");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HaHa");
//        }
//
        boolean flag = true;
        int [] x = new int[3];
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        for (int i=0;i<3;i++){
            x[i]=Sc.nextInt();
        }
        int index;
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index");
                index = Sc.nextInt();
                System.out.println("The value of marks[index] is " + x[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Error");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
//        if(i>=5){
//            try{
//                throw new Exceptiononretry();
//            }
//            catch(Exceptiononretry e){
//                System.out.println("\n"+e.getMessage());
//            }
//        }
//
        if(i>=5){
            try{
                throwexception(i);
            }
            catch(Exceptiononretry e){
                System.out.println("\n"+e.getMessage());
            }
        }
    }
}
