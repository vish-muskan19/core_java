public class v33_varargs
{
    static int sum(int x,int ...arr) //complesory argument dena h kyu ki int x kiya h
//    static int sum(int ...arr)
    {
        int result = x;
//        int result = 0;
//        for (int i=0; i<arr[0];i++)
        for (int a:arr)
        {
           result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of nothing is:"+sum(2));

        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 4,5 and 3 is:"+sum(4,5,3));
    }
}
