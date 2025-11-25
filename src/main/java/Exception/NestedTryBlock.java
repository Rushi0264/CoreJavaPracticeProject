package Exception;

public class NestedTryBlock {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println("This is my first try block..!");
            try {
                arr[6] = 10;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
