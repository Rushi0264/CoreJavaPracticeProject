package MultiThreading;

public class PrioritySetter extends Thread{
    @Override
    public void run() {
        System.out.println("Thread name : "+Thread.currentThread().getName());
        System.out.println("Get priority : "+currentThread().getPriority());
    }

    public static void main(String[] args) {
        PrioritySetter t1 = new PrioritySetter();
        t1.setPriority(7);
        t1.start();

        PrioritySetter t2 = new PrioritySetter();
        t2.setPriority(10);
        t2.start();
    }
}
