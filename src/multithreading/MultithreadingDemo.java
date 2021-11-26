package multithreading;

public class MultithreadingDemo extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In run");
    }


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        MultithreadingDemo obj = new MultithreadingDemo();
        obj.start();
    }
}

class Hello extends MultithreadingDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("In run");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        Thread t1 =  new Thread(hello);
        t1.start();
    }
}