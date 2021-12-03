package multithreading;

public class ThreadPriority {

    public static void main(String[] args) {
        Thread t1  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T1 thread");
            }
        });

        Thread t2  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("T2 thread");
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
