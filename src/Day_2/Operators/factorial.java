//Write a program to find the factorial of a number using loops and arithmetic operators.
package Day_2.Operators;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
        {
            System.out.println("Factorial is 0");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial is "+fact);
    }
}
