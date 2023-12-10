package java_tutorial;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<10){
            System.out.println("I am happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<10){
            System.out.println("I am sad!");
            i++;
        }
    }
}
class MyThread3 extends Thread{
    @Override
    public void run(){
        System.out.println("Currently Executing Thread : " + Thread.currentThread().getName());
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    }
}
public class v70_multiple_Thread
{
    public static void main(String[] args)
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();

        t3.setName("t3 thread");

        t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
        t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
        t3.setPriority(Thread.NORM_PRIORITY); // setting priority of t3 thread to NORM_PRIORITY (5)

        t1.start();
        t2.start();
        t3.start();
    }
}
