//Problem Statement 3: Find the Maximum Element in an ArrayList
//Create a program to find the maximum element in an ArrayList of integers.
//Input Example:
//Input list: [15, 22, 8, 42, 17]
//Output Example:
//Maximum Element: 42
package Day_9.ArrayList;

import java.util.ArrayList;

import java.util.List;

public class Max_element {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(15);
        l.add(22);
        l.add(8);
        l.add(42);
        l.add(17);
        int max=l.get(0);

        int sum=0;
        for(int i=0;i<l.size();i++){
            if (l.get(i)>max)
            {
                max=l.get(i);
            }
        }
        System.out.println("Maximum Element : "+max);


    }
}
