//String Starts with Letter
//Create a method that takes a Predicate<String> and a list of strings and filters out all strings that start
// with a particular letter (e.g., 'A').
//Input: ["Apple", "Banana", "Avocado", "Cherry"]
//Letter: 'A'
//Output: ["Apple", "Avocado"]

package Day_16.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Start_with_Letter {

        public List<String> display(List<String> list, Predicate<String> predicate) {
            List<String> list1 = new ArrayList<>();
            for(String str : list){
                if(predicate.test(str)){
                    list1.add(str);
                }
            }
            return list1;
    }
    public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Avocado");
            list.add("Cherry");
            char letter='A';
            Predicate<String> predicate = s->s.charAt(0) == letter;
            Start_with_Letter start = new Start_with_Letter();
            System.out.println(start.display(list,predicate));
    }

}
