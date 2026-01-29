package MultiThreading;

public class ThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Thread name : " + currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
    }
}
