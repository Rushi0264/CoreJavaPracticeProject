package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {
    public static void main(String[] args) {
/*        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(64);
        list.add(61);
        list.add(5);

        for (int i=0; i<list.size();i++){
            for (int j=i+1; j<list.size(); j++){
                if (list.get(i) < list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);*/


        LinkedList<String> list = new LinkedList<>();
        list.add("Alphabets");
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        list.add("Thank you");

        Iterator<String> descItr = list.descendingIterator();
        while (descItr.hasNext()){
            System.out.println(descItr.next());
        }


    }
}
