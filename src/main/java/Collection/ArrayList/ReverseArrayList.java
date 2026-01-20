package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");

        int start = 0;
        int end = list.size()-1;

        while (start < end){
            String temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }
        System.out.println(list);
    }
}
