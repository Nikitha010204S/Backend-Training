//Write a program to print all numbers from 1 to 100, skipping multiples of 5 (use continue).

package Day_2.Program_control;

import java.util.Scanner;

public class Print_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(i%5==0)
            {
                continue;
            }
            System.out.print(i+" ");

        }
    }
}
