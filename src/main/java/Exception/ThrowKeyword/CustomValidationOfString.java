package Exception.ThrowKeyword;

public class CustomValidationOfString {
    public static void validatePassword(String pass){
        if (pass.length() < 6){
            throw new IllegalArgumentException("(Week password) Password should be at least 6 character!!");
        }

        boolean hashDigit = false;
        for (char c : pass.toCharArray()){
            if(Character.isDigit(c)){
                hashDigit = true;
                break;
            }
        }

        if (!hashDigit){
            throw new IllegalArgumentException("(Week password) Password should be at least one digit");
        }

        System.out.println("Password Accepted.!!!");
    }

    public static void main(String[] args) {
        try{
            validatePassword("rushi");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            validatePassword("Rushikesh1");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
