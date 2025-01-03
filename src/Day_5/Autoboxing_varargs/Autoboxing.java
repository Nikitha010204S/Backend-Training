//Write a program to add a list of integers using a List<Integer> and demonstrate how autoboxing
// allows seamless addition of primitive int.

package Day_5.Autoboxing_varargs;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        int sum=0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
