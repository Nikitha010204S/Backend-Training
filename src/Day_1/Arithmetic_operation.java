package Day_1;
//Write a program that takes two integers from the user and performs all arithmetic operations,
// printing each result.

import java.util.Scanner;

public class Arithmetic_operation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition:" +add);
        System.out.println("Subtraction:" +sub);
        System.out.println("Multiplication:" +mul);
        System.out.println("Division:" +div);
        System.out.println("Modulus:" +mod);

    }
}
