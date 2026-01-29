package MultiThreading;

public class ThreadPriorityCheck extends Thread{
    @Override
    public void run() {
        System.out.println("Running thread : "+Thread.currentThread().getName());
        System.out.println("Thread priority : "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorityCheck t1 = new ThreadPriorityCheck();
        t1.start();
    }
}
