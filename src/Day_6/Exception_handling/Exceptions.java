//Write a program that:
//Accepts two integers from the user as input.
//Attempts to divide the first integer by the second.
//Implements exception handling to manage the following scenarios:
//Division by zero: Display an error message "Error: Division by zero is not allowed.".
//Invalid input: Display an error message "Error: Please enter valid integers.".
//Any other exceptions: Display "An unexpected error occurred.".

package Day_6.Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number 1:");
            int num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            int num2 = sc.nextInt();
            try {
                if (num2 == 0) {
                    throw new ArithmeticException();
                }
                int res = num1 / num2;
                System.out.println("Result :" + res);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
