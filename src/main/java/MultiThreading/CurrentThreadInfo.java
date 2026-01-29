package MultiThreading;

public class CurrentThreadInfo extends Thread{
    @Override
    public void run() {
        System.out.println("Current thread info : "+currentThread().getName());
    }

    public static void main(String[] args) {
        CurrentThreadInfo t1 = new CurrentThreadInfo();
        t1.start();
    }
}
