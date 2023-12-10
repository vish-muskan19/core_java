public class v31_methods
{
    static int logic(int x,int y)
    {
        int z;
        if (x>y)
        {
            z=x+y;
        }
        else
        {
            z=(+y)*5;
        }
        z=566;
        return z;
    }

    public static void main(String[] args) {
        int a = 5,b=7,c;
        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);

        c = logic(a, b);//static method
        System.out.println(a + " "+ b);
        System.out.println(c);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);
    }
}
