package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alphabets");
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("Thank you");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
