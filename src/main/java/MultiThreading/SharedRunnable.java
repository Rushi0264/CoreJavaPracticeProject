package MultiThreading;

public class SharedRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running Thread : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SharedRunnable sharedRunnable = new SharedRunnable();

        Thread t1 = new Thread(sharedRunnable,"Thread 1");
        Thread t2 = new Thread(sharedRunnable,"Thread 2");
        Thread t3 = new Thread(sharedRunnable,"Thread 3");
        Thread t4 = new Thread(sharedRunnable,"Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
