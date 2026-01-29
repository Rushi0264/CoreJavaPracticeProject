package MultiThreading;

public class ThreadNamePrint extends Thread{
    @Override
    public void run() {
        System.out.println("Thread name : "+currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadNamePrint t1 = new ThreadNamePrint();
        ThreadNamePrint t2 = new ThreadNamePrint();
        t1.start();
        t2.start();
    }
}
