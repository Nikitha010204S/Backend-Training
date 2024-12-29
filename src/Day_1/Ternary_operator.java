package Day_1;

import java.util.Scanner;

//Write a program that reads an integer and prints "Even" if it is even,
// or "Odd" if it is odd, using a ternary operator.
public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result=(a%2==0?"Even":"Odd");
        System.out.println(result);

    }
}
