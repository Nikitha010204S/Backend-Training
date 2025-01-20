//  ransform a List of Names
//Write a method that takes a list of student names and transforms each name into uppercase letters with
// a prefix like "Student: " using map.

package Day_15.Uppercase;

import Day_6.Clone.Student;
import Day_15.Students_sort.Student1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student_uppercase {
    public static void main(String[] args) {
        List<String> st = new ArrayList<String>();
       st.add("Anand");
       st.add("Priya");
       st.add("Vishnu");
       st.add("Thilak");
       st.add("Sowmya");
       List<String> Transform=st.stream().map(name -> "Student: " +name.toUpperCase()).collect(Collectors.toList());
       for(String s : Transform){
           System.out.println(s);
       }

    }
}
