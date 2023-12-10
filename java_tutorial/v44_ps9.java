package java_tutorial;

class  cylinder {
    private int radius, height;

    //   3  Use a constructor and repeat ➊


    //   1 create a class cylinder and use getter and setters to set its radius and height
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //   2 use ➊ to calculate surface and volume of the cylinder
    public double surfaceArea() {
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
    }

    public double value() {
        return 2 * Math.PI * radius * radius * height;
    }
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}

//   4 Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
    class Rectangle_constructor {
    private int lenght ,breadth;

    public Rectangle_constructor() {
        this.lenght = 4;
        this.breadth = 5;
    }
    public Rectangle_constructor(int lenght, int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }
}



public class v44_ps9
{
    public static void main(String[] args) {
//        cylinder c =new cylinder();
//        c.setRadius(9);  // Q.1
//        c.setHeight(12);
//        System.out.println(c.getRadius());
//        System.out.println(c.getHeight());

//        System.out.println(c.surfaceArea()); // Q.2
//        System.out.println(c.value());

        cylinder cl=new cylinder(9,12); //Q.3
        System.out.println(cl.getRadius());
        System.out.println(cl.getHeight());

        Rectangle_constructor r=new Rectangle_constructor();  //Q.4
        System.out.println(r.getLenght());
        System.out.println(r.getBreadth());

        Rectangle_constructor rc=new Rectangle_constructor(1,2);
        System.out.println(rc.getLenght());
        System.out.println(rc.getBreadth());
    }
}
