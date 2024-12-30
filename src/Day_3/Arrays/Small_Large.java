//Write a program to find the largest and smallest numbers in an array.

package Day_3.Arrays;

import java.util.Scanner;

public class Small_Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max =   Integer.MIN_VALUE;
        for(int a:arr)
        {
            if(a<min)
            {
                min = a;
            }
            if(a>max)
            {
                max = a;
            }

        }


        System.out.println("Largest : "+max);
        System.out.println("Smallest : "+min);



    }
}
