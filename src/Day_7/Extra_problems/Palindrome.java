//Given a string s, return true if the s can be palindrome after deleting at most one character from it.
//
//Example 1:
//Input: s = "aba"
//Output: true
//
//Example 2:
//Input: s = "abca"
//Output: true
//Explanation: You could delete the character 'c'

package Day_7.Extra_problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(valid(str));
    }

    public static boolean valid(String str) {
        int left=0;
        int right=str.length()-1;
        while(left<right) {
            if(str.charAt(left)!=str.charAt(right)) {
                return isPalindrome(str,left+1,right) || isPalindrome(str,left,right-1);
            }
        }
        return true;
    }
    public static boolean isPalindrome(String str,int left,int right) {
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

