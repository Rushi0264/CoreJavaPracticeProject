package Exception;

import java.lang.NullPointerException;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        //System.out.println("A"+null);
        try {
            String str = null;
            System.out.println("String length is : "+str.length());
        }catch (NullPointerException e){
            System.out.println("Null Error");
        }catch (Exception e){
            System.out.println("General src.Exception");
        }
        //System.out.println("A".concat("B"));
    }
}
