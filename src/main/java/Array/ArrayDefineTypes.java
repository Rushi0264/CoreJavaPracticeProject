package Array;

public class ArrayDefineTypes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;


        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        try {
            for (int i=0;i<arr1.length;i++){
                System.out.print(" "+arr1[i]);
            }
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
