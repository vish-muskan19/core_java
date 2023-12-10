public class v25_ps4 {
    public static void main(String[] args) {

/*        Write a program to print the following pattern :
        ****
        ***
        **
        *     */
//        for (int i = 4; i > 0; i--)
//        {
//            for (int j=0; j<i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Write a program to sum first n even numbers using a while loop.
//        int n=5,sum=0;
//        for(int i=0; i<n ; i++)
//        {
//            sum=sum+(2*i);
//        }
//        System.out.println("sum of the number is:-"+sum);


//        Write a program to print the multiplication table of a given number n.
//        int n=5;
//        for(int i=1; i<10; i++)
//        {
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

//        Write a program to print a multiplication table of 10 in reverse order.
//        int n=10;
//        for (int i = n; i > 0; i--)
//        {
//                System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }

//        Write a program to find the factorial of a given number using for loops.
        // What is factorial n = n * n-1 * n-2 ..... 1
        // 5! = 5*4*3*2*1 = 120

//        int factorial=1,n=5;
//        for (int i=1;i<=n;i++)
//        {
//            factorial *= i;
//            System.out.println(factorial);
//        }
//        System.out.println(factorial);


//        Repeat problem 5 using a while loop
//        int n=1,i=1,factorial=1;
//        while (i<=n)
//        {
//            factorial *= i;
//            i++;
////            System.out.println(factorial);
//        }
//        System.out.println(factorial);

//        Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int n=8,sum=0;
        for(int i=1;i<=2;i++)
        {
            sum += n*i;
//            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
