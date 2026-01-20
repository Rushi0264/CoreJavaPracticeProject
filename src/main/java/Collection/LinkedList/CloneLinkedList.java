package Collection.LinkedList;

import ObjectClass.CloneMethod.CloneTest;

import java.util.LinkedList;

public class CloneLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        LinkedList<String> cloneList = (LinkedList<String>) list.clone();
        System.out.println(list);
        System.out.println(cloneList);
    }
}
