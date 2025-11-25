package Exception;

class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}

public class CustomException {

    static void ageCheck(int age) throws AgeException{
        if (age < 18){
            throw new AgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        try {
            ageCheck(16);
        }catch (AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
