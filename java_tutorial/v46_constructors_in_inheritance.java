package java_tutorial;

class Base1{
    Base1() {
        System.out.println("I am a base class constructor");
    }
    Base1(int a)
    {
        System.out.println("I am an overloaded construction with of a as: "+a);
    }
}
class Derived1 extends Base1{
    Derived1()
    {
//        super(5);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int a, int b) {
        super(a);
        System.out.println("I am an overloaded construction with value of b as: "+b);
    }
}
class child extends Derived1
{
    child()
    {
        System.out.println("I am a chile of derived constructor");
    }
    child(int a,int b, int c){
        super(a,b);
        System.out.println("I am an overloaded construction with value of c as: "+c);
    }
}
public class v46_constructors_in_inheritance
{
    public static void main(String[] args) {
        Base1 b=new Base1();
        System.out.println(" ");

        Derived1 d=new Derived1();
        System.out.println(" ");

        Derived1 d1=new Derived1(5,2);
        System.out.println(" ");

        child c=new child();
        System.out.println(" ");

        child cd=new child(1,2,3);
    }
}
