package Collection.LinkedList;

import java.util.LinkedList;

public class RemoveFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.addFirst("Alphabets");
        list.addLast("Thank you");

        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
