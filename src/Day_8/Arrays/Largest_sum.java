//Problem Statement:
//Given an array of integers, find the largest sum of a contiguous subarray. Implement an efficient algorithm to solve this problem.
//
//Example:
//Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6
//Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.
package Day_8.Arrays;

import java.util.Scanner;

public class Largest_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max) {
                    max=sum;
                }
            }
        }
        System.out.println("Max : "+max);
    }
}
