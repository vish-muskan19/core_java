package java_tutorial;


class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative!";
    }
    public String toMessage(){
        return "Radius cannot be negative";
    }
}
public class v84_throw_throws
{
    public static double area(int r)throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI * r * r;
        return result;
    }
    public static int div(int a,int b) throws ArithmeticException{ // usne phle se bta diya ki error dega Ar...
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c=div(6,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        try {
            double ar=area(6);
            System.out.println(ar);
        }
        catch (NegativeRadiusException e) {
            throw new RuntimeException(e);
        }
    }
}
