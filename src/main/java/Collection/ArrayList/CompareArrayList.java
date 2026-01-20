package Collection.ArrayList;

import java.util.ArrayList;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(55);
        list.add(24);
        list.add(6);
        list.add(10);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(55);
        list1.add(24);
        list1.add(6);
        list1.add(10);

        if (list.equals(list1)){
            System.out.println("Both arraylist are equal");
        }else {
            System.out.println("Both arraylist are different");
        }
    }
}
