package Exception.ThrowKeyword;

public class CheckString {
    public static void stringCheck(String str){
        if (str == ""){
            throw new NullPointerException("String cannot be empty!!");
        }else {
            System.out.println("Valid String because it have some content!!");
        }
    }

    public static void main(String[] args) {
        try{
            stringCheck("");
        }catch (NullPointerException e){
            System.out.println("Invalid : "+e.getMessage());
        }

        try {
            stringCheck("Hello_Java");
        }catch (NullPointerException e){
            System.out.println("Invalid : "+e.getMessage());
        }
    }
}
