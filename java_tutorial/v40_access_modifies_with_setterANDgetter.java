package java_tutorial;

class Employee
{
    private int Id;
    private String Name;

    public void setId(int i)
    {
        Id = i;
    }
    public int getId()
    {
        return Id;
    }
    public void setName(String n)
    {
        Name = n;
    }
    public String getName()
    {
        return Name;
    }
}
public class v40_access_modifies_with_setterANDgetter
{
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(5);
        System.out.println(emp.getId());

        emp.setName("muskan");
        System.out.println(emp.getName());
    }
}
