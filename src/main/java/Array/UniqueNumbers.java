package Array;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,3,7,8,9};
        int[] arr3 = {6,7,8,9,10,11};
        int[] arr4 = new int[arr1.length+arr2.length+arr3.length];
        int index = 0;

        for (int i=0;i<arr1.length;i++){
            arr4[index++] = arr1[i];
        }
        for (int i=0; i<arr2.length;i++){
            arr4[index++] = arr2[i];
        }
        for (int i=0; i<arr3.length;i++){
            arr4[index++] = arr3[i];
        }

        int[] arr5 = new int[arr4.length];
        int size=0;

        for (int i=0;i<index;i++){
            int count=0;
            for (int j=0;j<index;j++){
                if (arr4[i] == arr4[j]){
                    count++;
                }
            }
            if (count == 1){
                 arr5[size++] = arr4[i];
            }
        }

        for (int i=0;i<size;i++){
            System.out.println(arr5[i]);
        }
    }
}
