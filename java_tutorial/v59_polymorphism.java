package java_tutorial;

interface cellphone{
    void GPS();
    void camera();
    private void A()
    {
        System.out.println("hello");
    }
    default void B(){
        A();
        System.out.println("good morning");
    }
}
interface smart extends cellphone {
    void media_player(int song);
    String[] getNetworks();
//    void connectToNetwork(String network);
}
class Smartphone1 implements smart {
    public void GPS() {
        System.out.println("GPS on.....");
    }

    public void camera() {
        System.out.println("camera on.....");
    }
    public void B(){
        System.out.println("B on.....");
    }
    public void media_player(int song) {
        System.out.println("media player on.. "+song);
    }

    public String[] getNetworks() {
        String[] networkList = {"a","b","c","d"};
        return networkList;
    }
}
public class v59_polymorphism {
    public static void main(String[] args) {
        cellphone obj=new Smartphone1(); // This is a smartphone but, use it as a camera
        obj.camera();
        obj.B();
//        obj.media_player(); --> Not allowed
//        obj.getNetworks(); --> Not allowed

        System.out.println(" ");

        Smartphone1 obj1=new Smartphone1();
        obj1.camera();
        obj1.GPS();
        obj1.B();
        obj1.media_player(45);

        String[] ar=obj1.getNetworks();
        for (String element:ar)
        {
            System.out.print(element+" ");
        }
    }
}
