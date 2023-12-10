package java_tutorial;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record_4k_Video(){
        greet();
        System.out.println("Recording in 4k video..... ");
    }
}
interface wifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class MyCellphone{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }
}
class MySmartphone extends  MyCellphone implements wifi,Camera{
    public void takeSnap(){
        System.out.println("tacking snap...");
    }
    public void recordVideo(){
        System.out.println("taking video.....");
    }
//    public void record_4k_Video(){
//        System.out.println("@Override Recording in 4k video..... ");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of network");
        String[] networkList={"muskan","ashen","harsh"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("connecting to "+network);
    }

}
public class v57_default_methods
{
    public static void main(String[] args) {
        MySmartphone obj=new MySmartphone();

//        obj.greet(); --> Throws an error!

        obj.record_4k_Video();
        String[] ar= obj.getNetworks();

        for (String item:ar)  // using in for-each
        {
            System.out.print(item+" ");
        }
        
    }
}
