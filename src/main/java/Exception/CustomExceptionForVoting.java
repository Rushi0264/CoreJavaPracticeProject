package Exception;

class AgeException1 extends Exception{
    AgeException1(String msg1){
        super(msg1);
    }
}

public class CustomExceptionForVoting {
    static void checkAge(int age) throws AgeException1{
        if (age >= 18){
            System.out.println("You are eligible for voting");
        }else {
            System.out.println("You are not eligible for voting");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(45);
        } catch (AgeException1 e) {
            System.out.println(e);
        }
    }
}
