package Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArray {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Object[] array = list.toArray();
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
