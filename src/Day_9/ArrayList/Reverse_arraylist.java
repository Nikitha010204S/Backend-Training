//Problem Statement 2: Reverse the ArrayList
//Create a program that reverses the order of elements in an ArrayList.
//Input Example:
//Input list: [1, 2, 3, 4, 5]
//Output Example:
//Reversed List: [5, 4, 3, 2, 1]
package Day_9.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Reverse_arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        List<Integer> revlist = new ArrayList<Integer>();
        for(int i=list.size()-1;i>=0;i--){
            revlist.add(list.get(i));
        }
        System.out.println("Reversed List :" +revlist);

    }
}
