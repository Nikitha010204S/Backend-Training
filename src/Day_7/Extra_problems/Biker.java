//There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
// The biker starts his trip on point 0 with altitude equal 0.
//You are given an integer array gain of length n where gain[i] is the net gain in altitude between points
// i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
//
//Example 1:
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

package Day_7.Extra_problems;

import java.util.Scanner;

public class Biker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of gains: ");
        int gains = sc.nextInt();
        System.out.println("Enter gains: ");
        int[] gainsArray = new int[gains];
        for (int i = 0; i < gains; i++) {
            gainsArray[i] = sc.nextInt();
        }
        int max=0;
        int currentalt=0;
        for(int i=0;i<gainsArray.length;i++){
          currentalt += gainsArray[i];
         // System.out.println(currentalt);
            max=Math.max(max,currentalt);
        }
        System.out.println("Highest altitude is " +max);


    }
}
