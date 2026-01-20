package Collection.LinkedList;

import java.util.LinkedList;

public class ClearLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("List before clear : "+list);
        list.clear();
        System.out.println("List after clear : "+list);
    }
}
