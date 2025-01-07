//Student Grades Management System
//You are tasked with creating a program to manage student grades using a Vector in Java.
// Implement the following functionalities:
//Add grades (as integers) to a vector dynamically.
//Print all grades in the vector.
//Calculate and display:
//The highest grade.
//The lowest grade.
//The average grade.
//Allow the user to remove a specific grade by its index.
//Input Example:
//Add grades: 78, 85, 92, 67, 88.
//Remove grade at index 3.
//Output Example:
//Grades: [78, 85, 92, 88]
//Highest Grade: 92
//Lowest Grade: 78
//Average Grade: 85.75

package Day_9.Vector;

import java.util.Vector;

public class Student_grade {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(78);
        v.add(85);
        v.add(92);
        v.add(67);
        v.add(88);
        System.out.println("Grades :" +v);
        v.remove(3);
        System.out.println("After remove :" +v);
        int high=v.get(0);
        int low=v.get(1);
        int sum=0;
        for(int n:v)
        {
            if(n>high)
                high=n;
            if(n<low)
                low=n;
            sum+=n;
        }
        System.out.println("Highest Grade :" +high);
        System.out.println("Lowest Grade :" +low);
        int len=v.size();
        double avg=(double)sum/len;
        System.out.println("Average Grade :" +(Double)avg);


    }
}
