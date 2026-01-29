package MultiThreading;

public class SleepMethodEx extends Thread{
    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Running thread");
    }

    public static void main(String[] args) {
        SleepMethodEx t1 = new SleepMethodEx();
        t1.start();
    }
}
