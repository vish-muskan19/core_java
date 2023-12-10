package java_tutorial;

/* 1 Create a class circle and use inheritance to create another class cylinder from it
Create a method for area and volume in 1 */

class Circle{
    public int radius;
    Circle() {
        System.out.println("I am non param of circle");
    }
    Circle(int radius) {
        System.out.println("I am circle parameterized constructor");
        this.radius = radius;
    }
    public double circle_area(){
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int height, int raduis) {
        super(raduis);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = height;
    }
    public double cylinder_volume(){
        return Math.PI * this.radius * this.radius * this.height;
    }
}
/*  2  Create a class rectangle and use inheritance to create another class cuboid, try to keep it as close to the real-world scenario as possible
create methods for area & volume in 2 also create getters and setters*/
class rectangle_ps{
    public int length,breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double rectangle_cal(){
        return this.length * this.breadth;
    }
}
class cuboid extends rectangle_ps{
    public int width,height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double cuboid_cal(){
        return this.width * this.height * this.length;
    }
}
/* 3 What is the order of constructor execution for the following inheritance hierarchy
                    Base
                   Derived 1
                   Derived 2
Derived obj = new Derived 2( );
Which constructor(s) will be executed & in what order? */
class Base2{
    public Base2() {
        System.out.println("I am a base constructor");
    }
}
class Derived_1 extends Base1{
    Derived_1()
    {
        System.out.println("I am a derived 1 constructor ");
    }
}
class Derived_2 extends Derived_1{
    public Derived_2() {
        System.out.println("I am a derived 2 constructor");
    }
}


public class v52_ps10
{
    public static void main(String[] args) {
//        Circle objc=new Circle(); // Q.1
//        Circle obj=new Circle(12);
//
//        Cylinder1 obj1=new Cylinder1(4,12);
//        System.out.println(obj1.cylinder_volume());
//
//        Circle objcc=new Cylinder1(4,12); //Dynamic method Dispatch

//        rectangle_ps obj=new rectangle_ps();  // Q.2
//        obj.setLength(9);
//        System.out.println(obj.getLength());
//        obj.setBreadth(5);
//        System.out.println(obj.getBreadth());
//        System.out.println(obj.rectangle_cal());
//
//        cuboid obj1=new cuboid();
//        obj1.setLength(9);
//        obj1.setWidth(7);
//        obj1.setHeight(8);
//        System.out.println(obj1.getLength());
//        System.out.println(obj1.getWidth());
//        System.out.println(obj1.getHeight());
//        System.out.println(obj1.cuboid_cal());

        Derived_2 obj = new Derived_2(); // Q.3


    }
}
