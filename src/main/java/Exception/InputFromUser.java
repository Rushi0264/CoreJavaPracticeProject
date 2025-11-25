package Exception;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.print("Result is : "+result);

        }catch (ArithmeticException e){
            //System.out.println(num1+" or any number can not divide by zero..!!");
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}
