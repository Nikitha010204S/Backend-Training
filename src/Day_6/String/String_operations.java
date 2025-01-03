//Write a program that takes a sentence as input from the user and performs the following operations:
//Count the number of words in the sentence.
//Reverse the entire sentence.
//Replace all vowels in the sentence with the character '*'.

package Day_6.String;

import java.util.Scanner;

public class String_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String arr[]=s.split(" ");
        int no_of_words=arr.length;
        System.out.println("No.of words : "+no_of_words);
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String : "+rev);
        String replace=s.replaceAll("[aeiouAEIOU]","*");
        System.out.println("Replaced String : "+replace);
    }
}
