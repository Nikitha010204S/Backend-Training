package Day_1;
//Create a program that reads two integers and prints whether the first number is greater than the
// second using relational operators.
//
//Use logical operators to combine multiple conditions.

import java.util.Scanner;

public class Logical_relational_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b)
        {
            System.out.println(a +" is greater than "+b);
        }
        else {
            System.out.println(a +" is less than "+b);
        }
    }
}


