package java_tutorial;

class Thread1 extends Thread{
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("Name "+Thread.currentThread().getName());
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("Priority "+Thread.currentThread().getPriority());
            i++;
        }
    }
}

public class v75_thread_methods
{
    public static void main(String[] args) {
        Thread1 t1 =new Thread1();
        Thread2 t2 =new Thread2();

        t1.setName("muskan");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
        t2.start();

    }
}
