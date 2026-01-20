package Collection.ArrayList;

import java.util.ArrayList;

public class SearchElementDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("HTML");
        list.add("CSS");
        //System.out.println("Search element : "+list.get(1));
        String searchElement = "Python";
        if (list.contains(searchElement)){
            System.out.println("Yes list contains element : "+searchElement);
        }
        else {
            System.out.println("No list don't contains element : "+searchElement);
        }
    }
}
