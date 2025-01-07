//Problem Statement 1: Manage a Shopping List
//Create a program that allows the user to manage a shopping list using an ArrayList.
// Implement the following features:
//Add items to the shopping list.
//Remove an item from the list.
//Display the shopping list.
//Input Example:
//Add items: "Milk", "Eggs", "Bread", "Butter".
//Remove "Eggs".
//Output Example:
//
//Shopping List: [Milk, Bread, Butter]

package Day_9.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Shopping_list {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");
        list.add("Butter");
        list.remove("Eggs");
        System.out.println("Shopping List:" + list);

    }
}
