package java_tutorial;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe()
    {
        System.out.println("constructors");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class v45_inheritance
{
    public static void main(String[] args) {
        Base b=new Base();
        b.setX(5);
        System.out.println(b.getX());

        Derived d=new Derived();
        d.setX(6);
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());
    }
}
