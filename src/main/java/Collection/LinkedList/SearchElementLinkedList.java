package Collection.LinkedList;

import java.util.LinkedList;

public class SearchElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        String searchElement = "Python";
        if (list.contains(searchElement)){
            System.out.println("Element found in list : "+searchElement);
        }
        else {
            System.out.println("Element not fount in list : "+searchElement);
        }
    }
}
