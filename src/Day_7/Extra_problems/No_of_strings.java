//Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
//A substring is a contiguous sequence of characters within a string.
//
//Example 1:
//Input: patterns = ["a","abc","bc","d"], word = "abc"
//Output: 3
//Explanation:
//- "a" appears as a substring in "abc".
//- "abc" appears as a substring in "abc".
//- "bc" appears as a substring in "abc".
//- "d" does not appear as a substring in "abc"

package Day_7.Extra_problems;

import java.util.Scanner;

class No_of_strings {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of strings: ");
        int n = sc.nextInt();
        String[] arr= new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println("Enter the word: ");
        String word = sc.next();
        for(String a:arr)
        {
            if(word.contains(a))
            {
                count++;
            }
        }
        System.out.println("Count :"+count);
    }
}
