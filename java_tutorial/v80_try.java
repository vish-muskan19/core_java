package java_tutorial;

public class v80_try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;

        // Without Try:
//        int c= a/b;
//        System.out.println("Result: "+c);

        // With Try:
        try {
            int c= a/b;
            System.out.println("Result: "+c);
        }
        catch (Exception e){
            System.out.println("We failed to div Reason:");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
