package MultiThreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t1 = new Thread(r);
        t1.start();

    }
}
