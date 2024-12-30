//Create a class Utility with a static method convertToUpper(String str) that takes a string as
//input and returns it in uppercase. Test this method in the main function.

package Day_3.Static;

import java.util.Scanner;

public class Utility {
    public static String convertToUpper(String str) {
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();
        System.out.println("Your String: ");
        System.out.println(Utility.convertToUpper(str));
    }
}
