package Revision;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()){
            System.out.println("Not anagram!!");
        }

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1,a2)){
            System.out.println("String is anagram");
        }else {
            System.out.println("String not a anagram");
        }
    }
}
