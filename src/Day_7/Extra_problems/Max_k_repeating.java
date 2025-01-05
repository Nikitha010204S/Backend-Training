//For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
//Given strings sequence and word, return the maximum k-repeating value of word in sequence.
//
//Example 1:
//Input: sequence = "ababc", word = "ab"
//Output: 2
//Explanation: "abab" is a substring in "ababc".
//
//Example 2:
//Input: sequence = "ababc", word = "ba"
//Output: 1
//Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".

package Day_7.Extra_problems;

import java.util.Scanner;

public class Max_k_repeating {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence:");
        String seq = sc.nextLine();
        System.out.println("Enter the word:");
        String word = sc.nextLine();
        String repeatedWord = word;

        while(seq.contains(repeatedWord))
            {
                count++;
                repeatedWord+=word;
            }

        System.out.println("Count :"+count);

    }
}
