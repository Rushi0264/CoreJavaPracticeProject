package Collection.ArrayList;

import java.util.ArrayList;

public class SortDescending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(55);
        list.add(24);
        list.add(6);
        list.add(10);

        for (int i=0;i<list.size();i++){
            for (int j=i+1;j<list.size();j++){
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Descending order : "+list);
    }
}
