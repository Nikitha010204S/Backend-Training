//Write a program to swap two numbers without using a third variable (use XOR).

package Day_2.Operators;

import java.util.Scanner;

public class Swap_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("Value of a is :" +a);
        System.out.println("Value of b is :" +b);
    }
}
