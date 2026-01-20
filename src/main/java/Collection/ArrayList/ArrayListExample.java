package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        System.out.println(list);

        System.out.println(list.get(1));
    }
}
