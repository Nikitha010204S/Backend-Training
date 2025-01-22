//Handling Null with Optional Write a program that accepts a String input, converts it to uppercase if it's not null,
// and prints "Empty input" if the string is null.

package Day_17.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Handling_null {
    public static void main(String[] args) {
       String s1 = "abc";
       Optional<String> Upper=Optional.ofNullable(s1);
       if(Upper.isPresent())
                System.out.println(Upper.get().toUpperCase());
       else
                System.out.println("Empty input");
        }
        }

