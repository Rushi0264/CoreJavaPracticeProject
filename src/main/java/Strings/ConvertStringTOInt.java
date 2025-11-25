package Strings;

public class ConvertStringTOInt {
    public static void main(String[] args) {
        String str = "123";
        int num = 0;

        for (char ch : str.toCharArray()){
            num = num * 10 + (ch - '0');
        }
        System.out.println(num);
    }
}
