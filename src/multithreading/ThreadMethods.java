package multithreading;

public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getId());
//                System.out.println(Thread.currentThread().getPriority());
//                System.out.println(Thread.currentThread().isAlive());
                System.out.println(Thread.currentThread().isDaemon());

            }
        });

        t1.setName("MyThread");
        t1.setDaemon(true);
        t1.start();
    }
}
