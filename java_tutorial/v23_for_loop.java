package java_tutorial;
import java.util.Scanner;

public class v23_for_loop {
    public static void main(String[] args) {
//        for(int i=7; i!=0; --i)
//        {
//            System.out.println(i);
//        }
//        for (int i=1; i<=10; i++)
//        {
//            System.out.println(i);
//        }

        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number:-");
//        int n=sc.nextInt();
        int n=6;
        for(int i=0; i<n; i++)
        {
            System.out.println( 2*i+1);
        }
    }
}
