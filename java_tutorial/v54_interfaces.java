package java_tutorial;

interface A1{
    int a = 45;
    void B1(int decrement);
    void B2(int increment);
}

interface A2{
    int x = 40;
    void C1();
    void C2();
}

class Apply implements A1, A2{
    public int x = 5;
    void blowHorn(){
        System.out.println("hello");
    }
    public void B1(int decrement){
        System.out.println("good morning");
    }
    public void B2(int increment){
        System.out.println("good afternoon ");
    }
    public void C1(){
        System.out.println(" good evening ");
    }
    public void C2(){
        System.out.println(" good night ");
    }
}
public class v54_interfaces {
    public static void main(String[] args) {
        Apply obj = new Apply();
        obj.B1(1);
        // You can create properties in Interfaces
        System.out.println(obj.a);
        System.out.println(obj.x);

        // You cannot modify the properties in Interfaces as they are final
//         obj.a = 454;
//        System.out.println(obj.a);

        obj.C1();
        obj.C2();
    }
}

