package Revision;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello i am rushi";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words){
            StringBuilder sb = new StringBuilder(word);
            result+=sb.reverse().toString()+" ";
        }
        System.out.println(result);
    }
}
