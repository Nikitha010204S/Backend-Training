//Create a program that uses a Set to store a collection of unique names. Implement the following features:
//Add names to the set.
//Check if a name is already present in the set.
//Display all unique names in the set.
//Input Example:
//Add names: "Alice", "Bob", "Alice", "Eve", "Charlie".
//Output Example:
//Unique Names: [Alice, Bob, Eve, Charlie]

package Day_10;

import java.util.*;

public class Name_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        System.out.println("Add names : ");
        while(true)
        {
            String name=sc.nextLine();
            if(name.equals(""))
                break;
            set.add(name);
        }
        System.out.println("Enter name to check :");
        String name=sc.nextLine();
        if(set.contains(name))
        {
            System.out.println("Name is already in use");
        }
        else{
            System.out.println("Name is not already in use");
        }
        System.out.println("Unique Names :" +set);

    }
}
