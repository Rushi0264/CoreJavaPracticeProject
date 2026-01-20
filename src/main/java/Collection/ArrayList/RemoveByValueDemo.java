package Collection.ArrayList;

import java.util.ArrayList;

public class RemoveByValueDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("Java");
        System.out.println("List before remove : "+list);
        //System.out.println(list.remove("HTML"));
        list.remove("Java");
        //System.out.println(list.contains("HTML"));
        System.out.println("List after remove element : "+list);
    }
}
