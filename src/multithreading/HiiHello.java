package multithreading;

public class HiiHello {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Hii");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
            }
        });

        t1.start();
        t2.start();

    }
}
