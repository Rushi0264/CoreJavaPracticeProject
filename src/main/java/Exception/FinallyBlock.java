package Exception;

public class FinallyBlock {
    public static void main(String[] args) {
        int a=44, b=0, c;
        try {
            c=a/b;
            System.out.println("Result is : "+c);
        }
        catch (ArithmeticException e){
            System.out.println("src.Exception found");
        }
        finally {
            System.out.println("Always executes");
        }
    }
}
