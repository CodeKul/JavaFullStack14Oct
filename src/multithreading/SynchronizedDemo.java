package multithreading;

public class SynchronizedDemo {
    int  num;

    public void increase(){
      synchronized (this) {
          num++;
      }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo obj= new SynchronizedDemo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increase();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increase();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(obj.num);
    }
}
