//Static Method Reference Write a Java program that uses a method reference to a static method
// Math::sqrt to calculate the square root of a list of numbers.
package Day_17.Method_reference;

import java.util.List;
import java.util.function.DoubleFunction;

public class Static_method {
    Static_method()
    {
        List<Integer> square_root= List.of(14,8,6,34);
        for(Integer i : square_root)
        {
            DoubleFunction<Double> func = Math::sqrt;
            System.out.println(func.apply(i));
        }
    }
    public static void main(String[] args) {
        new Static_method();
    }
}
