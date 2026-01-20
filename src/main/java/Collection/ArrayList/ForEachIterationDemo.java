package Collection.ArrayList;

import java.util.ArrayList;

public class ForEachIterationDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");

        for (String s : list){
            System.out.println(s);
        }
    }
}
