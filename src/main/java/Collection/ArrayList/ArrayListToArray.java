package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        Object[] array = list.toArray();
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
