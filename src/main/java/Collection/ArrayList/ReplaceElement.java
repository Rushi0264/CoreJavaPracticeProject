package Collection.ArrayList;

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

/*        list.set(1,"C language");
        System.out.println(list);*/

        int index=1;
        String newElement = "C language";

        list.set(index, newElement);
        System.out.println(list);
    }
}
