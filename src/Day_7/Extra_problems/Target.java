//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

package Day_7.Extra_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Target {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in the array: ");
        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    list.add(new int[]{i,j});
                }
            }
        }
       for(int[] l:list)
       {
           System.out.println("["+l[0]+","+l[1]+"]");
       }
    }
}
