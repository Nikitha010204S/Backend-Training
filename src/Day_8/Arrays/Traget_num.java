//Problem Statement:
//Given an array of integers and a target number, return the indices of the two numbers that add up to the target. Assume that there is exactly one solution.
//Example:
//Input: nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
//Explanation: nums[0] + nums[1] = 2 + 7 = 9.
package Day_8.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Traget_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == target){
                    list.add(new int[]{i,j});
                }
            }
        }
       for(int[] l: list){
           System.out.println("["+l[0]+","+l[1]+"]");
       }
    }
}
