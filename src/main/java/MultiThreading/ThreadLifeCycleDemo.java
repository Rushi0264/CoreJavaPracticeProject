package MultiThreading;

public class ThreadLifeCycleDemo extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Thread state (RUNNING) : " + getState());
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycleDemo t = new ThreadLifeCycleDemo();

        //NEW state
        System.out.println("Thread state (NEW) : "+t.getState());

        //runnable
        t.start();
        System.out.println("Thread state (AFTER START) : "+t.getState());

        Thread.sleep(500);
        System.out.println("Thread state (TIMED_WAITING) : "+t.getState());

        t.join();//wait until thread completes

        System.out.println("Thread state (TERMINATE) : "+t.getState());
    }
}
