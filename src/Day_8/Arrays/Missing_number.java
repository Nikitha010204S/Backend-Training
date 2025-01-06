//Given an array containing n distinct numbers in the range [0, n], find the one number that is missing from the array.
//Example:
//Input: nums = [3, 0, 1]
//Output: 2
//Explanation: The missing number is 2 because it is not in the array.

package Day_8.Arrays;

import java.util.Scanner;

public class Missing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int totalsum=(n*(n+1))/2;
        int availablesum=0;
        for (int i = 0; i < n; i++) {
            availablesum+=arr[i];
        }
        System.out.println("Missing number is : " + Math.abs(totalsum-availablesum));
    }
}
