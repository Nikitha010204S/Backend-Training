//Using Optional with Default Values Write a program that uses Optional to provide a default value
// of "Guest" when no name is provided.
package Day_17.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional_with_default {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Nikitha");
        name.add(null);
        name.add("Deva");
        name.add(null);
        for (String s : name) {
            Optional<String> name1=Optional.ofNullable(s);
            String res=name1.orElse("Guest");
            System.out.println(res);
        }
    }
}
