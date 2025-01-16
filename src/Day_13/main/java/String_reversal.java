//String Reversal Method
//Write a method to reverse a string. Test edge cases like an empty string, a single character,
// and a string with special characters.

package Day_13.main.java;

public class String_reversal {
    public static String  reversal(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
   public static void main(String[] args) {
        System.out.println(reversal("Hello World"));
        System.out.println(reversal(""));
        System.out.println(reversal("a"));
        System.out.println(reversal("%$abc*("));
        System.out.println(reversal("123456"));
    }
}

