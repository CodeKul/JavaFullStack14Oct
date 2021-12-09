package multithreading;

public class DeadLockDemo {
    public static void main(String[] args) {

        String resource1 = "printer";
        String resource2 = "scanner";

        Thread t1 = new Thread(()-> {
            synchronized (resource1){
                System.out.println(Thread.currentThread().getName()+" Locked "+resource1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2){
                    System.out.println(Thread.currentThread().getName()+" Locked "+resource2);
                }
            }

        });
         Thread t2 = new Thread(()-> {
            synchronized (resource2){
                System.out.println(Thread.currentThread().getName()+" Locked "+resource2);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
             synchronized (resource1){
                 System.out.println(Thread.currentThread().getName()+" Locked "+resource1);
             }
        });

         t1.setName("Laptop");
         t2.setName("Desktop");

         t1.start();
         t2.start();

    }
}
