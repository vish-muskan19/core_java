package java_tutorial;

import java.util.Scanner;

public class v85_finally_block {
    public static int greet() {
        try {
            int a = 50, b = 2;
            int c = a / b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }


    public static void main(String[] args) {
        int a=greet();
        System.out.println(a);

        int x=3,y=6;
        while (true){
            try {
                System.out.println(x/y);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally block values of y:"+y);
            }
            y--;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplication greater than 5");
        int number = sc.nextInt();
        try {
            for (int i = 1; i <= 10; i++)
            {
                if (number<5){
                    throw new ArithmeticException("Please enter a number greater than 5\n");
                }
                else {
                    System.out.println(number + " x " + i + " = " + number * i);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am code of finally block.");
        }

        try {
            System.out.println(50/0);
        }finally {
            System.out.println("yes!!!!");
        }
    }
}
