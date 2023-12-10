package java_tutorial;

class MyMainEmployee
{
    private int id;
    private String name;

    public MyMainEmployee()
    {
        id=45;
        name="muskan";
    }
    public MyMainEmployee(String myname)
    {
        id=1;
        name=myname;
    }
    public MyMainEmployee(String n, int i)
    {
        id=i;
        name=n;
    }
    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
public class v42_constructors
{
    public static void main(String[] args) {
        MyMainEmployee e =new MyMainEmployee();
//        e.setId(65);  // getter & setter
//        e.setName("ashen");
//        System.out.println(e.getId());
//        System.out.println(e.getName());

        System.out.println(e.getId());  // constructor auto move hojata h
        System.out.println(e.getName());

        MyMainEmployee me=new MyMainEmployee("harsh");
        System.out.println(me.getName());
        System.out.println(me.getId());

        MyMainEmployee m=new MyMainEmployee("harsh",85);
        System.out.println(m.getName());
        System.out.println(m.getId());
    }
}
