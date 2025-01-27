//Given a list of integers, perform the following tasks using parallel streams:
//Filter numbers greater than 50.
//Map these numbers to their squares.
//Print the first 10 squared numbers.

package Day_19.Parallel_Stream;

import java.util.ArrayList;
import java.util.List;

public class Parallel_stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 25, 85, 90, 15, 6, 75, 74, 95, 100,879,474,987,565,878);
        list.stream().parallel().filter(num->num>50).map(num->num*num).limit(10).forEach(System.out::println);
    }
}
