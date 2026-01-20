package Collection.ArrayList;

import java.util.ArrayList;

public class InsertAtIndexDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List before insertion : "+list);
        list.add(2,60);
        list.add(4,80);
        System.out.println("List after insertion : "+list);
    }
}
