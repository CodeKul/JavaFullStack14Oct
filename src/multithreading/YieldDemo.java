package multithreading;

public class YieldDemo  implements Runnable{

    @Override
    public void run() {
        Thread.yield();

        for(int  i=0;i<5;i++){
            System.out.println("In run method");
        }
    }

    public static void main(String[] args) {
        YieldDemo obj = new YieldDemo();
        Thread  t1= new Thread(obj);
        t1.start();

        for (int i=1;i<=5;i++){
            System.out.println("In main method");
        }

    }
}
