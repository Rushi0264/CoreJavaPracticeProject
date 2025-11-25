package Strings;

public class ConcatinateStrings {
    public static void main(String[] args) {
        String firstName = "Rushikesh";
        String lastName = "Chepte";
        String fullName = firstName +" "+ lastName;

        System.out.println(fullName);


        String str = "abc";
        String str2 = "abc";
        System.out.println(str == str2);//true

        str.toUpperCase();
        System.out.println(str);//abc
    }
}
