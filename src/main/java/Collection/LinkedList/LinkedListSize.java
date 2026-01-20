package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListSize {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.addFirst("Alphabets");
        list.addLast("Thank you");

        System.out.println("Size of linkedlist : "+list.size());
    }
}
