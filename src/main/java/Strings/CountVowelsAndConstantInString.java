package Strings;

public class CountVowelsAndConstantInString {
    public static void main(String[] args) {
        String str = "Hello Java";
        int vowels = 0, constant = 0;
        str = str.toLowerCase();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch >='a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else {
                    constant++;
                }
            }
        }

        System.out.println("Count of vowels in given string : "+vowels);
        System.out.println("Count of constant in given string : "+constant);
    }
}
