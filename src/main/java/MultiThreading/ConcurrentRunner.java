package MultiThreading;

public class ConcurrentRunner extends Thread{
    @Override
    synchronized public void run() {
        System.out.println("Current thread : "+currentThread().getName());
    }

    public static void main(String[] args) {
        ConcurrentRunner t1 = new ConcurrentRunner();
        ConcurrentRunner t2 = new ConcurrentRunner();

        t1.start();
        t2.start();
    }
}
