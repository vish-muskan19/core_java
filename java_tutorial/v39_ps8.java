/* 1 Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)*/
class Employee2
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
/* 2 Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.*/
class  cellphone
{
    public void ring()
    {
        System.out.println("Ringing......");
    }
    public void vibrat()
    {
        System.out.println("Vibrating......");
    }
    public void call()
    {
        System.out.println("Calling......");
    }
}
/* 3 Create a class Square with a method to initialize its side, calculating area, perimeter etc.*/
class Square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
class Cricle_cal
{
    int radius;
    float PI=3.14f;
    public float cal()
    {
        return PI * radius * radius;
    }
}
class Rectengle_cal
{
    int length, breadth;
    public int rect()
    {
        return length*breadth;
    }
}
/* 4 Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc*/
class TommyVecetti
{
    public void hit()
    {
        System.out.println("Hittng the enemy");
    }
    public void run()
    {
        System.out.println("runing from the enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}
public class v39_ps8
{
    public static void main(String[] args) {
        Employee2 e=new Employee2();
        e.setName("abc"); // Q.1
        System.out.println(e.getName());

        e.salary=2500;
        System.out.println(e.getSalary());

        cellphone cell=new cellphone(); //Q.2
        cell.ring();
        cell.vibrat();
        cell.call();

        Square sq=new Square();//Q.3
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Cricle_cal c=new Cricle_cal();
        c.radius=3;
        System.out.println(c.cal());

        Rectengle_cal r=new Rectengle_cal();
        r.length=5;
        r.breadth=6;
        System.out.println(r.rect());

        TommyVecetti tv=new TommyVecetti(); //Q.4
        tv.hit();
        tv.run();
        tv.fire();
    }
}
