package Strings;

public class FindDuplicateCharacter {
    public static void main(String[] args) {
        String str = "Banana";
        char[] ch = str.toCharArray();
        String dupChar = "";
        for (int i=0; i<ch.length; i++){
            int count=0;

            for (int j=i+1; j<ch.length; j++){
                if (ch[i] == (ch[j])){
                    count++;
                }
            }

            if (count > 0 && dupChar.indexOf(ch[i]) == -1){
                dupChar += ch[i];
            }
        }
        System.out.println("Duplicate character : "+dupChar);
    }
}
