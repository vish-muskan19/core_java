package java_tutorial;
import java.util.Scanner;

public class v18_ps4_conditions
{
    public static void main(String[] args) {
        int a=10;
//        if(a==11)
//        {
//            System.out.println("i an 11");
//        }
//        else
//        {
//            System.out.println("i an not 11");
//        }
//        int sub1,sub2,sub3 ;
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your marks sub1:-");
//        sub1= sc.nextInt();
//        System.out.println("Enter your marks sub2:-");
//        sub2= sc.nextInt();
//        System.out.println("Enter your marks sub3:-");
//        sub3= sc.nextInt();
//
//        float total=((sub1+sub2+sub3)/3.2f);
//        System.out.println(total);
//
//        if (total>=40 && sub1>=33 && sub2>=33 && sub3>=33)
//        {
//            System.out.println("pass");
//        }
//        else
//        {
//            System.out.println("fail");
//        }
//
//        float tax=0;
//        float income;
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your income:-");
//        income=sc.nextFloat();
//
//        if(income<2.5)
//        {
//            tax=tax+0;
//        }
//        else if (income>2.5f && income<=5f)
//        {
//            tax=tax + 0.05f * (income - 2.5f);
//            System.out.println(tax);
//        }
//        else if (income>5f && income<=10.0f)
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if (income>10.0f)
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.05f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("the total tax paid by the empl:-"+tax);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the URL:-");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }

    }
}
