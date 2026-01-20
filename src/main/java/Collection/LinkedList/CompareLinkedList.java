package Collection.LinkedList;

import java.util.LinkedList;

public class CompareLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");

        if (list1.equals(list2)){
            System.out.println("Both LinkedList are same");
        }else {
            System.out.println("Both LinkedList are different");
        }
    }
}
