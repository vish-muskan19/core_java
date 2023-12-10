public class v34_recursion
{
    static int factorial(int n)
    {
        // factorial(0) = 1
        // factorial(n) = n * n-1 *....1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial(n) = n * factorial(n-1)
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    static int factorial_item(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            int product = 1;
            for (int i=1;i<=n;i++)
            {
                product *= i;
            }
            return product;
        }
    }
//    static int Fibonacci_series(int n)
//    {
//        int n1=0,n2=1;
//        for (int i=2; i<=n; ++i)
//        {
//            int n3= n1 + n2;
//            n1=n2;
//            n2=n3;
//        }
//        return n2;
//    }
    public static void main(String[] args)
    {
        int x=4;
        System.out.println("The value of factorial x is:"+factorial(x));
        System.out.println("The value of factorial x is:"+factorial(5));

        System.out.println("The value of factorial x is:"+factorial_item(x));
//        System.out.println("The value of factorial x is:"+Fibonacci_series(x));
    }
}
