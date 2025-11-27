package Revision;

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message){
        super(message);
    }
}
class Voting{
    public static void checkAge(int age) throws InvalidAgeException{
        if (age < 18){
            throw new InvalidAgeException("Not eligible for voting");
        }else {
            System.out.println("Eligible for voting");
        }
    }
}


public class CustomExceptions{
    public static void main(String[] args) {

        try {
            Voting.checkAge(18);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}