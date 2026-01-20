package Collection.ArrayList;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C");
        list1.add("JS");
        list1.add("R language");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("C");

        list1.retainAll(list2);

        System.out.println("Common elements : "+list1);
    }
}
