package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorIterationDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
