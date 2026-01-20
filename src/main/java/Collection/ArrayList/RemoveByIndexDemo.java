package Collection.ArrayList;

import java.util.ArrayList;

public class RemoveByIndexDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("List before remove element : "+list);
        list.remove(2);
        System.out.println("List after remove element : "+list);
        System.out.println("After removing then index value be changed : "+list.get(2));
    }
}
