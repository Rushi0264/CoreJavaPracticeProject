package StringMethods;

public class FindDuplicateCharInString {
    String str = "Hello Java";

    public void charCount(){
        char[] charArr = str.toCharArray();
        int count = 0;

        for (int i=0;i<charArr.length;i++){
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        FindDuplicateCharInString obj = new FindDuplicateCharInString();
        obj.charCount();
    }
}
