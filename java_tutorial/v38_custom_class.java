class Employee1
{
    int id,salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is: " + id);
        System.out.println("and my name is: "+ name);
        System.out.println("and my salary is "+ salary);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class v38_custom_class
{
    public static void main(String[] args)
    {
        Employee1 obj=new Employee1(); // Instantiating a new Employee Object
        Employee1 ob=new Employee1();

//        obj.printDetails();
//        int salary = obj.getSalary();
//        System.out.println(salary);

        // Setting Attributes for obj
        obj.id=12;
        obj.salary=35;
        obj.name="muskan";

        // Setting Attributes for ob
        ob.id=13;
        ob.salary=40;
        ob.name="ashen";

        // Printing the Attributes
        obj.printDetails();
        ob.printDetails();

        int Salary = obj.getSalary();

//        System.out.println(obj.id);
//        System.out.println(obj.name);
    }
}
