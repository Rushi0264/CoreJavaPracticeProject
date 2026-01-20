package Collection.ArrayList;

import java.util.ArrayList;

public class CheckEmptyDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");
        System.out.println("Check list is empty or not : "+list.isEmpty());
    }
}
