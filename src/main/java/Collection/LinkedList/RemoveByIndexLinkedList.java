package Collection.LinkedList;

import java.util.LinkedList;

public class RemoveByIndexLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.remove(1);
        System.out.println(list);
    }
}
