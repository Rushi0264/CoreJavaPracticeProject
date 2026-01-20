package Collection.LinkedList;

import java.util.LinkedList;

public class InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.add(1,"HTML");
        System.out.println(list);
    }
}
