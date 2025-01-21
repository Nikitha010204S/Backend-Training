//Create a BiConsumer<Integer, Integer> that takes two numbers and prints their sum.
//Input:
//3, 5
//      Output : Sum of 3 and 5 is 8
package Day_16.Consumer;

import java.util.function.BiConsumer;

public class Sum {
public static void main(String[] args) {
    BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    };
    biConsumer.accept(3,5);
    biConsumer.accept(5,6);
}
}
