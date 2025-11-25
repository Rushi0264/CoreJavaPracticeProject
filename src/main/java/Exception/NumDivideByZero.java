package Exception;

public class NumDivideByZero {
    public static void main(String[] args) {
        int a=100, b=0, c;

        try {
            c = a/b;
            System.out.println("Result is : "+c);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
            System.out.println(e.getMessage());
        }
    }
}
