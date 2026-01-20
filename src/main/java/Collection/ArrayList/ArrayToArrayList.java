package Collection.ArrayList;

import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "C", "C++"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Array elements:");
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("ArrayList elements:");
        System.out.println(list);
    }
}
