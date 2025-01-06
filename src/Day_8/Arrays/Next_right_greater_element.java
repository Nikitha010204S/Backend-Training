//Problem Statement:
//For each element in an array, find the next greater element to its right. If no such element exists,
// return -1 for that number.
//Example:
//Input: nums = [4, 5, 2, 10]
//Output: [5, 10, 10, -1]
//Explanation: The next greater element for 4 is 5, for 5 is 10, for 2 is 10, and for 10 there is no greater element.
package Day_8.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Next_right_greater_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(-1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    list.set(i,arr[j]);
                    break;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
