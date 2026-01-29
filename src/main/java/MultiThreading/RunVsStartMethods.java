package MultiThreading;

public class RunVsStartMethods extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running : "+currentThread().getName());
    }

    public static void main(String[] args) {
        RunVsStartMethods t1 = new RunVsStartMethods();
        System.out.println("Calling run() ");
        t1.run();

        System.out.println("Calling start() ");
        t1.start();
    }
}
