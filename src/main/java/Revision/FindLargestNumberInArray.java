package Revision;

public class FindLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,5};
        int large = arr[0];

        for (int i=0; i<arr.length; i++){
            if (arr[i] > large){
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
