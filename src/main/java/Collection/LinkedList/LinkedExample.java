package Collection.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("Song A");
        list.addLast("Song B");
        list.addFirst("Song Z");
        System.out.println("Now playing : "+list.pollFirst());
        System.out.println("Next up : "+list.peekFirst());
    }
}
