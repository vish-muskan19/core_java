package java_tutorial;

class phone{
    public void showTime()
    {
        System.out.println("Time is 8am");
    }
    public void on()
    {
        System.out.println("Turning on phone....");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("plying music....");
    }
    @Override
    public void on(){
        System.out.println("Turing on smartphone......");
    }
}

public class v49_dynamic_method_dispatch
{
    public static void main(String[] args) {
//        phone obj=new phone();
//        smartphone obj1 =new smartphone();

        phone obj = new smartphone();
//        smartphone bjt1 =new phone(); //not allowed

        obj.showTime();
        obj.on(); //smartphone
//        obj,music();// not allowed
    }
}
