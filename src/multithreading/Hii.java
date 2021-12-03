package multithreading;

public class Hii extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Main{

    public static void main(String[] args) {
        Hii obj = new Hii();
        Hello1 obj1 = new Hello1();

        obj.start();
        obj1.start();
    }
}