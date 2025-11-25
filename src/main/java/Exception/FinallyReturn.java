package Exception;

public class FinallyReturn {

    public static int sample(){
        try {
            int a=10/0;
            return 1;
        }catch (ArithmeticException e){
            Thread.sleep(2000);
            System.out.println("src.Exception caught");
            return 2;
        }

        finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(sample());
    }
}
