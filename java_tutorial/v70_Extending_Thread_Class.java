package java_tutorial;

class MyThreading1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<5)
        {
            System.out.println("My Thread 1");
            i++;
        }
    }
}
class MyThreading2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<5)
        {
            System.out.println("My Thread 2");
            i++;
        }
    }
}
public class v70_Extending_Thread_Class {
    public static void main(String[] args) {
        MyThreading1 obj=new MyThreading1();
        MyThreading2 obj1=new MyThreading2();
        obj.start();
        obj1.start();
    }
}
