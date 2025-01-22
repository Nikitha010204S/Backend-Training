//Use a Function<String, Integer> to map a list of strings to their lengths.
//Input: ["Hello", "World", "Java"]
//Output: [5, 5, 4]

package Day_16.Functions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Word_length {
    public static void main(String[] args) {
        String[] words={"Hello", "World", "Java"};
        String[] res;
       Function<String,Integer> length=word->word.length();
        Integer[] res1 = new Integer[words.length];
        for (int i = 0; i < words.length; i++) {
            res1[i] = length.apply(words[i]);
        }
        System.out.println(Arrays.toString(res1));
    }
}
