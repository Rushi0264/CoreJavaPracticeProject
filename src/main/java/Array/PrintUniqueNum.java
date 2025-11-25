package Array;

public class PrintUniqueNum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7};
        int[] arr3 = {9,10,11,12};
        int[] arr4 = new int[arr1.length+arr2.length+arr3.length];
        int num = 0;

        for(int i=0;i<arr1.length;i++){
            arr4[num++] = arr1[i];
        }

        for (int i=0;i<arr2.length;i++){
            arr4[num++] = arr2[i];
        }

        for (int i=0;i<arr3.length;i++){
            arr4[num++] = arr3[i];
        }

        int[] arr5 = new int[arr4.length];
        int size = 0;

        for (int i=0; i<num;i++){
            int count = 0;

            for (int j =0; j<num;j++){
                if (arr4[i]==arr4[j]){
                    count++;
                }
            }

            if(count == 1){
                arr5[size++] = arr4[i];
            }
        }

        for (int i=0; i<size;i++){
            System.out.println(arr5[i]);
        }
    }
}


        /*for (int i=0;i<=arr1.length;i++){
            for (int j=0;j<=arr2.length;j++){
                if (arr1[i] != arr2[j]){
                    for (int k=0; k<=arr3.length;k++){
                        if (arr2[j] != arr3[k]){
                            //arr4[] = arr3[k];
                        }
                    }
                }
            }
        }*/
