//Write a function to rotate an array of n integers to the right by k steps.
//
//
//Example:
//Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3
//Output: [5, 6, 7, 1, 2, 3, 4]
//Explanation: Rotate the array to the right by 3 steps.

package Day_8.Arrays;

import java.util.Scanner;

public class Rotate_array
{
public static void rotate_array(int[] arr,int k) {
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public static void reverse(int[] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int[] arr) {
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter value of k:");
    int k = sc.nextInt();

    System.out.println("Array after rotation is:");
    rotate_array(arr,k);
    display(arr);
}
}
