package StringMethods;

public class SubStringMethod {
    public static void main(String[] args) {
        try {
            String str1 = "Java Programming";
            System.out.println("Substring of str1 : " + str1.substring(5, 17));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Substring not created");
        }
    }
}
