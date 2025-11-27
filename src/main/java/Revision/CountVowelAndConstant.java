package Revision;

public class CountVowelAndConstant {
    public static void main(String[] args) {
        String str = "programming";
        char[] ch = str.toCharArray();
        int vowel=0, constant=0;

        for (int i=0;i<ch.length;i++){
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                vowel++;
            }else {
                constant++;
            }
        }
        System.out.println("Count of vowels : "+vowel);
        System.out.println("Count of constant : "+constant);
    }
}
