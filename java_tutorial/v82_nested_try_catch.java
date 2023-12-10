package java_tutorial;

import java.util.Scanner;

public class v82_nested_try_catch {
    public static void main(String[] args) {

        int [] a=new int[5];

        Scanner sc=new Scanner(System.in);

        boolean flag=true;
        while (flag) {

            System.out.println("Enter the array:");

            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }
            System.out.print("Enter the arry index: ");
            int index = sc.nextInt();

            System.out.print("Enter the number you want to divide the value with: ");
            int number = sc.nextInt();

            try {
                System.out.println(a[index]);
                try {
                    System.out.println("The value of array-value/number is: " + a[index] / number);
                    flag=false;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
//                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
//                System.out.println(e);
            }
        }
        System.out.println("Thanks for using this program");
    }
}
