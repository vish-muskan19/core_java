package java_tutorial;

class construtor_thread1 extends Thread{
    public construtor_thread1(String Name) {
        super(Name);
    }
    public void run(){
        int i=0;
        while (i<5){
            System.out.println("construtor thread");
            i++;
        }
    }
}
class construtor_thread2 extends Thread implements Runnable{
    public construtor_thread2(Runnable r) {
        super(r);
    }

    @Override
    public void run() {
        int i=0;
        while (i<5){
            System.out.println("construtor thread");
            i++;
        }
    }
}

class construtor_thread3 extends Thread implements Runnable{
    public construtor_thread3(Runnable r, String name) {
        super(r, name);
    }

        public void run() {
            int i=0;
            while (i<5){
                System.out.println("construtor thread");
                i++;
            }
    }
}

public class v73_thread_constructor {
    public static void main(String[] args) {
        construtor_thread1 t1=new construtor_thread1("muskan");
        t1.start();
        System.out.println("The Name of the thread t is "+t1.getName());

        construtor_thread2 t2=new construtor_thread2(null);
        Thread c1=new Thread(t2);
        c1.start();
        System.out.println("The id of thread t1 is " + c1.getId());
        System.out.println("The name of thread t1 is " + c1.getName());

        construtor_thread3 t3=new construtor_thread3(null,"muskan");
        Thread c2=new Thread(t3);
        c2.start();
        System.out.println("The id of thread t1 is " + c2.getId());
        System.out.println("The name of thread t1 is " + c2.getName());
    }
}
