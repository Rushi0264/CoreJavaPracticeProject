package StringMethods;

public class StringsReversed {
    public static void main(String[] args) {
        String str = "Rushi";
        char[] arr = str.toCharArray();
        String rev = "";
        System.out.println("Original string : "+str);

        for (int i=arr.length-1;i>=0;i--){
            rev += arr[i];
        }
        System.out.println("Reversed string : "+rev);
    }
}
