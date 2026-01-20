package Collection.ArrayList;

import java.util.ArrayList;

public class StudentMarkList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(50);
        marks.add(56);
        marks.add(44);
        System.out.println("Second student marks : "+marks.get(1));
    }
}
