package Exception;

public class ExceptionDemo {
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            int result = dividend / divisor;
            System.out.println("Result is : " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Divisor can't be 0..!");
        }
    }*/

    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[6] = 10;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
