package Exception.ThrowKeyword;

public class AgeChecker {
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Your age is must be at least 18 year");
        }else {
            System.out.println("Your age is old..\n enough!!!");
        }
    }

    public static void main(String[] args) {

        //This block throw an exception
        try {
            checkAge(15);
        }catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }

        //This block execute normally flow
        try{
            checkAge(20);
        }catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
