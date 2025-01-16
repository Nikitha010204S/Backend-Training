//Palindrome Checker
//Implement a method to check if a string is a palindrome. Write test cases for valid palindromes,
// non-palindromes, and case sensitivity.

package Day_13.main.java;

public class Palindrome {
    public static boolean ispalindrome(String input) {
            int left=0;
            int right=input.length()-1;
            while(left<right) {
                     if(input.charAt(left)!=input.charAt(right)) {
                         return false;
                     }
                     left++;
                     right--;
}
return true;
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome("abcd"));
        System.out.println(ispalindrome("Malayalam"));
        System.out.println(ispalindrome("Madam"));
        System.out.println(ispalindrome("madam"));
    }
}
