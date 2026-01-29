package MultiThreading;

public class RunMethodDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Run Method");
    }

    public static void main(String[] args) {
        RunMethodDemo t1 = new RunMethodDemo();
        t1.run();
    }
}
