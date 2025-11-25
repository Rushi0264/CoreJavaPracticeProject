package Exception.ThrowKeyword;

public class Divide {
    public static void divideNumber(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Number can't divide by zero");
        }else {
            System.out.println("Result : "+a/b);
        }
    }

    public static void main(String[] args) {

        //src.Exception occur here
        try {
            divideNumber(12,0);
        }catch (ArithmeticException e){
            System.out.println("src.Exception occur : "+e.getMessage());
        }

        //Print result here
        try{
            divideNumber(20,4);
        }catch (ArithmeticException e){
            System.out.println("src.Exception occur : "+e.getMessage());
        }
    }
}
