package Day_1;
//Implement a program that shifts an integer left and right by 2 positions and prints the result.
//
//Use the ^ operator to demonstrate XOR functionality between two integers.

import java.util.Scanner;

public class Bitwise_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int leftshift=num1<<2;
        int rightshift=num1>>2;
        System.out.println("Leftshift: " + leftshift);
        System.out.println("Rightshift: " + rightshift);

        int xor=num1^num2;
        System.out.println("xor: " + xor);

    }
}

