//UnaryOperator Write a Java program to use a UnaryOperator that converts a given string to uppercase.

package Day_17.Unary_Binary;

import java.util.function.UnaryOperator;

public class Unary_Operator {
    public static void main(String[] args) {
        UnaryOperator<String> Upper=s -> s.toUpperCase();
        String input="Hello world!";
        String result = Upper.apply(input);
        System.out.println(result);

    }
}
