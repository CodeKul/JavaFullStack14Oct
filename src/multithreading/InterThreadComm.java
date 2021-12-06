package multithreading;

public class InterThreadComm {

    int num;

    boolean flag = true;

    public synchronized void setNum(int num) {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Set:" + num);
        this.num = num;
        flag= false;
        notify();
    }

    public synchronized void getNum() {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get:" + num);
        flag = true;
        notify();
    }
}

class Producer implements Runnable {

    public InterThreadComm interThreadComm;

    public Producer(InterThreadComm interThreadComm) {
        this.interThreadComm = interThreadComm;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            interThreadComm.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{

    public InterThreadComm interThreadComm;

    public Consumer(InterThreadComm interThreadComm){
        this.interThreadComm = interThreadComm;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {

        while (true){
            interThreadComm.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class InterThreadMain{
    public static void main(String[] args) {
        InterThreadComm interThreadComm =  new InterThreadComm();

        Producer producer = new Producer(interThreadComm);
        Consumer consumer = new Consumer(interThreadComm);
    }
}