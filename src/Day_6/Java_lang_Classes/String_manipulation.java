//String - Manipulate a string by finding its length,
// converting it to uppercase, and extracting a substring.
package Day_6.Java_lang_Classes;

import java.util.Scanner;

public class String_manipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("The length of the string is: " + s.length());
        System.out.println("The uppercase of the string is: " + s.toUpperCase());
        System.out.println("The substring of the string is: " + s.substring(0, 7));
    }
}
