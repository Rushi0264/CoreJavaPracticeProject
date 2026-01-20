package Collection.LinkedList;

import java.util.LinkedList;

public class GetFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.addFirst("Alphabets");
        list.addLast("Thank you");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
