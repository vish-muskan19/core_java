package java_tutorial;

/* Create an abstract class pen with methods write () and refill () as abstract methods*/
abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }
    /* Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()*/
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
/*  Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey
class and implements basicanimal interface with eat ( ) and sleep methods*/
class monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biteing...");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("hello sir");
    }
    @Override
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }
}

/* Create a class telephone with ring ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism */
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
}
class smart_telephone extends telephone{
    public void ring(){
        System.out.println("ring");
    }
    public void lift() {
        System.out.println("lift");
    }
    public void disconnected(){
        System.out.println("disconnected");
    }
    public void cutCall() {
        System.out.println("cut a call");
    }
}
/* Create an interface TVremote and use it to inherit another interface smart TVremote
Create a class TV which implements TVremote interface */
interface TVremote{
    void tv();
}
interface smart_TVremote extends TVremote{
    void tv1();
}
class TV implements smart_TVremote{
    public void tv()
    {
        System.out.println("tv");
    }
    public void tv1()
    {
        System.out.println("tv1");
    }
}

public class v60_ps11
{
    public static void main(String[] args) {
//        pen obj=new FountainPen();  //Q.1
//        obj.write();
//        obj.refill();
////        obj.changeNib(); // Not allowed
//
//        FountainPen obj1=new FountainPen(); // Q.2
//        obj1.changeNib();
//
//        human obj=new human(); //Q.3
//        obj.sleep();
//        obj.speak();
//
//        monkey obj1=new human(); // polymorphism
//        obj1.jump();
//        obj1.bite();
////        obj1.sleep(); //Cannot use speak method because the reference is monkey which does not have speak method
//
//        basicanimal obj2=new human();
//        obj2.eat();
//        obj2.sleep();

//        telephone obj=new smart_telephone(); //Q. 4
//        obj.ring();
//        obj.lift();
//        obj.disconnected();
////        obj.cutCall(); // Not allowed
//
//        smart_telephone obj1=new smart_telephone();
//        obj1.cutCall();

        TV obj=new TV();
        obj.tv();
        obj.tv1();
    }
}
