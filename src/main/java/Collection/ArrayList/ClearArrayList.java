package Collection.ArrayList;

import java.util.ArrayList;

public class ClearArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(55);
        list.add(24);
        list.add(6);
        list.add(10);
        System.out.println("List before clear : "+list);
        list.clear();
        System.out.println("List after clear : "+list);
    }
}
