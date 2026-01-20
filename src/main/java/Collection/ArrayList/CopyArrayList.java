package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args) {
        List<String> sourseList = new ArrayList<>();
        sourseList.add("Java");
        sourseList.add("Python");
        sourseList.add("C");

        ArrayList<String> copyList = new ArrayList<>();
        copyList.addAll(sourseList);
        System.out.println(copyList);
    }
}
