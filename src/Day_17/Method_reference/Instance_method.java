//Instance Method Reference
// Create a program where a method reference is used to compare strings
// (e.g., String::compareToIgnoreCase) in a list and sort them.

package Day_17.Method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Instance_method {
    Instance_method()
    {
        List<String> str = new ArrayList<>(List.of("Hello", "World", "Java", "java", "world"));
        Collections.sort(str,String::compareToIgnoreCase);
        for (String str1 : str) {
            System.out.println(str1);
        }
    }
    public static void main(String[] args) {
        new Instance_method();
    }
}
