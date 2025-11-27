package Exception;

public class ThrowsKeyWord {
    public static void main(String[] args) {
        ThrowsKeyWord th=new ThrowsKeyWord();
        try{
            th.show();
        } catch (ArithmeticException e) {

        }

    }
    public void show() throws ArithmeticException{
            int a=10/0;
    }

}
