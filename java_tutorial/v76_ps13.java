package java_tutorial;

class ps1 extends Thread{
    public void run(){
        while (true){
            System.out.println("Good morning");
            try {  //Q2
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ps2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Welcome");
            System.out.println("Name "+Thread.currentThread().getName()); //Q.3
            System.out.println("Priority "+Thread.currentThread().getPriority());
            System.out.println("State "+Thread.currentThread().getState()); //Q.4

        }
    }
}

public class v76_ps13 {
    public static void main(String[] args) {
        ps1 t1=new ps1();
        ps2 t2=new ps2();

        t2.setName("muskan");
        t2.setPriority(Thread.NORM_PRIORITY);
        System.out.println(t2.getState());

        t1.start();
        t2.start();
    }
}
