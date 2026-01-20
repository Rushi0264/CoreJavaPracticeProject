package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayListBuiltMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");

        Collections.reverse(list);
        System.out.println(list);
    }
}
