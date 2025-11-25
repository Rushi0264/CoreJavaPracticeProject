package Exception.ThrowKeyword;

import java.util.Scanner;

class InvalidMarkException extends Exception{
    public InvalidMarkException(String message){
        super(message);
    }
}

public class MarksValidation {
    public static void validateMarks(int marks) throws InvalidMarkException{
        if (marks < 0 || marks > 100){
            throw new InvalidMarkException("Invalid Marks! Marks must be between 0 and 100.");
        }
    }

    public static void printGrade(int marks){
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        try {
            validateMarks(marks);
            printGrade(marks);
        }catch (InvalidMarkException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
