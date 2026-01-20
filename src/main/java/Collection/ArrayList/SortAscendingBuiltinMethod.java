package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortAscendingBuiltinMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(55);
        list.add(24);
        list.add(6);
        list.add(10);
        Collections.sort(list);
        for (int i : list) {
            System.out.println("Sorted list : " + i);
        }
    }
}
