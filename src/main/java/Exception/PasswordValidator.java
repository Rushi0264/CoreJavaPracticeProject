package Exception;

class InvalidPasswordException extends Exception{
    InvalidPasswordException(String message){
        super(message);
    }
}

public class PasswordValidator {
    static void validatePassword(String password) throws InvalidPasswordException{
        if (password.length() < 6){
            throw new InvalidPasswordException("Password must be at least 6 character");
        }
        if (!password.matches(".*\\d.*")){
            throw new InvalidPasswordException("Password must contain at least one digit");
        }
        if (password.contains(" ")){
            throw new InvalidPasswordException("Password must not contains spaces");
        }
    }

    public static void main(String[] args) {
        String pwd = "Rushikesh12";
        try {
            validatePassword(pwd);
            System.out.println("Password is valid : "+pwd);
        }catch (InvalidPasswordException e){
            System.out.println("Invalid password : "+e.getMessage());
        }
    }
}
