//Write a program to find the largest of three numbers using the ternary operator.

package Day_2.Operators;

import java.util.Scanner;

public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a>b?a:b;
        max= c>max?c:max;
        System.out.println("Maximum : " +max);
    }

}
