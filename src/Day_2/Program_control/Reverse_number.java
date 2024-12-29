//Create a program to reverse a given number.

package Day_2.Program_control;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }
        System.out.println(rev);

    }
}
