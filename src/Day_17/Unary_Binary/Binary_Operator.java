//BinaryOperator Create a program using a BinaryOperator to find the maximum of two integers.

package Day_17.Unary_Binary;

import java.util.function.BinaryOperator;

public class Binary_Operator {
    public static void main(String[] args) {
        BinaryOperator<Integer> max=(a,b)->a>b?a:b;
        System.out.println("Maximum of 2 and 3 :"+max.apply(2, 3));
        System.out.println("Maximum of 150 and 300 :"+max.apply(150, 300));
    }
}
