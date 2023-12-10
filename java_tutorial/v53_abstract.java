package java_tutorial;

// ek abstract method puri class ko abstract bna deta h
abstract class parent{
    public parent() {
        System.out.println("parent for constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet1();
}
class child1 extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet1(){
        System.out.println("good evening");
    }
}
abstract class child2 extends parent{

    public void th(){
        System.out.println("good morning");
    }
}
public class v53_abstract {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        child1 c=new child1();
        c.sayHello();
        c.greet();
        c.greet1();
        //Child3 c3 = new Child3(); -- error

    }
}
