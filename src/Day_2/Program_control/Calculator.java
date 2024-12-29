//Create a program to simulate a simple calculator using switch-case.

package Day_2.Program_control;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op= sc.next().charAt(0);
        double result = 0;
        switch (op)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a + b;
                break;

        }
        System.out.println("Result : "+ result);
    }
}
