package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.addFirst("Alphabets");
        list.addLast("Thank you");

        for (String s :list){
            System.out.println(s);
        }
    }
}
