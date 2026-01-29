package MultiThreading;

public class ThreadExecutionOrder extends Thread{
    @Override
    public void run() {
        System.out.println("Executing thread : "+currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadExecutionOrder t1 = new ThreadExecutionOrder();
        ThreadExecutionOrder t2 = new ThreadExecutionOrder();
        ThreadExecutionOrder t3 = new ThreadExecutionOrder();

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
