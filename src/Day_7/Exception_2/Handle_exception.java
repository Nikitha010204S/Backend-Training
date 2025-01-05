//Write a Java program that takes two numbers as input from the user and divides the first number by the
// second. Handle the following exceptions:
//ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
//InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input.
// Please enter numeric values."
//General Exception: For any other unexpected errors, display a generic error message: "An error occurred:
// [error message]."

package Day_7.Exception_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handle_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = new int[10];
            arr[11]=90;
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        try {
            if (num2 == 0) {
                throw new ArithmeticException();
            } else {
                int res = num1 / num2;
                System.out.println("Result : " + res);
            }
        }

     catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed.");
            }
        }

        catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }

        catch (Exception e) {
                System.out.println("An error occured : " + e.getMessage());

            }
        }
    }

