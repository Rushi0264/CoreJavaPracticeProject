package Revision;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        boolean isPalindrome = false;

        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        if (str.equals(rev)){
            isPalindrome = true;
        }else {
            isPalindrome = false;
        }
        System.out.println(isPalindrome);
    }
}
