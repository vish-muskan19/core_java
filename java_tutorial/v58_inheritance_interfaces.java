package java_tutorial;


interface  parent_Interface{
    void meth1();
    void meth2();
}
interface child_interface extends parent_Interface{
    void meth3();
    void meth4();
}
class family_interface implements child_interface{
    public void meth1(){
        System.out.println("farther");
    }
    public void meth2(){
        System.out.println("mother");
    }
    public void meth3(){
        System.out.println("sister");
    }
    public void meth4(){
        System.out.println("brother");
    }
}
public class v58_inheritance_interfaces
{
    public static void main(String[] args) {
        family_interface obj=new family_interface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
}
