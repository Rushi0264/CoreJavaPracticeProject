package Collection.LinkedList;

import java.util.LinkedList;

public class CheckEmptyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        if (!list.isEmpty()){
            System.out.println("List contain data : "+list);
        }else {
            System.out.println("List is empty..!");
        }
    }
}
