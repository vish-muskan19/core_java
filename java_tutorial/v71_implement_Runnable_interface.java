package java_tutorial;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<5)
        {
            System.out.println("Thread runnable 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<5)
        {
            System.out.println("Thread runnable 2");
            i++;
        }
    }
}
public class v71_implement_Runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 =new MyThreadRunnable1();
        Thread tr1 =new Thread(t1);

        MyThreadRunnable2 t2 =new MyThreadRunnable2();
        Thread tr2 =new Thread(t2);

        tr1.start();
        tr2.start();
    }
}
