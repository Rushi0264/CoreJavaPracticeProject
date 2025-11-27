package Revision;

public class FindDupCharFromString {
    public static void main(String[] args) {
        String str = "banana";
        char[] ch = str.toCharArray();
        String dup = "";

        for (int i=0; i<ch.length; i++){
            int count=0;

            for (int j=i+1;j< ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }

            if (count > 0 && dup.indexOf(ch[i]) == -1){
                dup+=ch[i];
            }
        }
        System.out.println("Duplicate characters : "+dup);
    }
}
