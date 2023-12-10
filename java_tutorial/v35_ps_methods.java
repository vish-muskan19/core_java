public class v35_ps_methods
{
//    1 Write a Java method to print the multiplication table of a number n.
    static void multilication(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    /* 2 Write a program using functions to print the following pattern:
        *
        **
        ***
        ****  */
    static void pattern(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    3 Write a recursive function to calculate the sum of first n natural numbers
    static int recursive_fun(int n)
    {
        if (n==1)
        {
            return 1;
        }
        return n + recursive_fun(n-1);
    }
   /* 4 Write a function to print the following pattern:
        ****
        ***
        **
        *        */
    static void pattern1(int n)
    {
        for (int i=n; i>0; i--)
        {
            for (int j=0;j<i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
//    5 Write a function to print the nth term of the Fibonacci series using recursion.
    static int Fibonacci_series(int n)
    {
      /*  if (n==1)
        {
            return 0;
        }
        else if (n==2)
        {
            return 1;
        }*/
        if(n==1||n==2)  //short me
        {
            return n-1;
        }
        else
        {
            return Fibonacci_series(n-1) + (n-2);
        }
    }
//    6 Write a function to find the average of a set of numbers passed as arguments
    static int average(int...arr)
    {
        int result=0;
        for (int a:arr)
        {
            result +=a;
        }
        return result/ arr.length;
    }
//   7 Repeat problem 4 using Recursion.
//    static void Recursion_revers(int n)
//    {
//        if (n<1)
//        {
//            Recursion_revers(n+1);
//            for (int i=n; i<=n; i--)
//            {
//                for (int j=0;j<n-1;j++)
//                {
//                    System.out.println("*");
//                }
//                System.out.println("");
//            }
//        }
//    }

//   8 Repeat problem 2 using Recursion.
    static void Recursion_patten(int n)
    {
        if (n>0)
        {
            Recursion_patten(n-1);
            for (int i=0; i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        multilication(5); //Q.1
        pattern(5); //Q.2

        int c=5;  //Q.3
        System.out.println(recursive_fun(5));

        pattern1(5); //Q.4

        int result=6;  //Q.5
        System.out.println(Fibonacci_series(result));
        System.out.println(Fibonacci_series(7));

        System.out.println(average(4,5,6,1,3,2)); //Q.6

//        Recursion_revers(5); //Q.7
        Recursion_patten(5); //Q.8
    }
}
