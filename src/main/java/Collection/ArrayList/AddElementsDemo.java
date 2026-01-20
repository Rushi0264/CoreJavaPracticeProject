package Collection.ArrayList;
//Write a Java program in a class named AddElementsDemo to create an ArrayList and add 5 integer elements
import java.util.ArrayList;

public class AddElementsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
    }
}
