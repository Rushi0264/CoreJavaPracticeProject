package Exception;

public class ArrayIndexOutOfBoundExceptions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            arr[6] = 23;
            for (int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
