package java_tutorial;

import java.util.Scanner;

public class v81_Handling_specific_Exceptions {
    public static void main(String[] args) {
        int [] a=new int[5];
//        a[0]=45;
//        a[1]=4;
//        a[2]=5;
//        a[3]=95;
//        a[4]=58;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arry index number");
        for(int i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }

        System.out.print("Enter the arry index: ");
        int index=sc.nextInt();

        System.out.print("Enter the number you want to divide the value with: ");
        int number=sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + a[index]);
            System.out.println("The value of array-value/number is: " + a[index]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occured ");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occured ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception  occured ");
            System.out.println(e);
        }
    }
}
