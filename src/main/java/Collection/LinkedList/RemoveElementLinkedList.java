package Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class RemoveElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.remove("Python");
        System.out.println(list);
    }
}
