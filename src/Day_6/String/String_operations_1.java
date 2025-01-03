//Takes two strings as input from the user.
//Compares them lexicographically using compareTo() method.
//Checks if the two strings are equal (case-sensitive and case-insensitive).
//Concatenates the two strings and prints the result.

package Day_6.String;

import java.util.Scanner;

public class String_operations_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String s = sc.nextLine();
        System.out.println("Enter the string2:");
        String s1 = sc.nextLine();
        int value=s.compareTo(s1);
        if(value<0)
        {
            System.out.println("The string1 comes before the string2!");
        }
        else if(value>0)
        {
            System.out.println("The string1 comes after the string2!");
        }
        else{
            System.out.println("Both string1 and string2 are equal!");
        }

        if(s.equals(s1))
        {
            System.out.println("The Strings are equal (case sensitive)!");
        }
        else{
            System.out.println("The Strings are not equal (case sensitive)!");
        }

        if(s.equalsIgnoreCase(s1))
        {
            System.out.println("The Strings are equal (case insensitive)!");
        }
        else{
            System.out.println("The Strings are not equal (case insensitive)!");
        }
        System.out.println("Concatenated string : "+s+s1);

    }
}
