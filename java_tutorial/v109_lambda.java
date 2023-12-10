package java_tutorial;

@FunctionalInterface
interface Demo_Ano{
    void meth1(int a);
//    void meth2();
}
//class Anony implements Demo_Ano{
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("hi");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("okay");
//    }
//}
public class v109_lambda {
    public static void main(String[] args) {
//        Anony a=new Anony();
//        a.meth1();

        // Anonymous Class
//        Demo_Ano obj=new Demo_Ano() {
//            @Override
//            public void meth1() {
//                System.out.println("hi");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("okay");
//            }
//        };
//        obj.meth1();

        // Lambda Expressions
        Demo_Ano obj= (a) ->{
            System.out.println("I am method 1 from this lambda "+a);
        };
        obj.meth1(6);
    }
}
