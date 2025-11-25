package Exception.ThrowKeyword;

import java.util.Scanner;

public class PasswordValidationUserInput {
    public static void checkPassword(String password){
        if (password.length() < 6){
            throw new IllegalArgumentException("Weak password.. (Password length should must be 6 characters)");
        }

        boolean hashDigit = false;
        for (char c : password.toCharArray()){
            if (Character.isDigit(c)){
                hashDigit = true;
                break;
            }
        }

        if (!hashDigit){
            throw new IllegalArgumentException("Weak password.. (Password should must be contain at least one digit)");
        }

        System.out.println("Password Accepted!!! (Strong Password)");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password : ");
        String password = sc.nextLine();

        try {
            checkPassword(password);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
