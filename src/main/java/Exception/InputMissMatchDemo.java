package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age (Integer) : ");
            int age = sc.nextInt();

            System.out.println("your age is : "+age);
        }catch (InputMismatchException e){
            System.out.println("Invalid input please enter only Integer values..!!");
        }
    }
}
