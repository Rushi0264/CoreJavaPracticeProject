package MultiThreading;

public class StartMethod extends Thread{
    @Override
    public void run() {
        System.out.println("Start method");
    }

    public static void main(String[] args) {
        StartMethod t1 = new StartMethod();
        t1.start();
    }
}
