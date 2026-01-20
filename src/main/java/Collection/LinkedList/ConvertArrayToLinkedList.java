package Collection.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ConvertArrayToLinkedList {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "C", "C++"};
        System.out.println("Array elements :");
        for (String s : arr){
            System.out.println(s);
        }


        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(arr));
        System.out.println("LinkedList element : "+linkedList);
    }
}
