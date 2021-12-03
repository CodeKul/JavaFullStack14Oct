package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
                System.out.println(Thread.currentThread().getPriority());
            }
        });

        t1.setName("MyThread");

        t1.start();
    }
}
