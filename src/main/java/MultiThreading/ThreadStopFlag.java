package MultiThreading;

public class ThreadStopFlag extends Thread{

    private boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Thread is running..!");
            try{
                sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Thread stoped");
    }

    public void stopThread(){
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStopFlag t1 = new ThreadStopFlag();
        t1.start();
        t1.sleep(2000);

        t1.stopThread();
    }
}
