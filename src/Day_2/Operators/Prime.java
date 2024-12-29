//Create a program to check if a number is prime using logical operators.

package Day_2.Operators;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }


        boolean res=false;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0) {
            res=true;
            break;
            }
        }
        if(!res)
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
