//Calculate Average GPA
//Write a method that calculates the average GPA of a list of students using a lambda expression.
package Day_15.Average_GCPA;

import Day_15.Students_sort.Student1;
import Day_6.Clone.Student;

import java.util.ArrayList;
import java.util.List;

public class Avg_gpa {
    public Avg_gpa() {
        Runnable run=()->System.out.println("Avg_gpa of list of Students:");
        Thread t1=new Thread(run);
        t1.start();
        List<Student2> students2=new ArrayList<Student2>();
        students2.add(new Student2(1, "Anish", 3.5));
        students2.add(new Student2(2, "Bob", 7.5));
        students2.add(new Student2(3, "Ramya", 9.5));
        students2.add(new Student2(4, "Dany", 6.6));
        students2.add(new Student2(5, "Eve", 2.5));

        double[] totalGPA = {0};
        students2.forEach(student -> totalGPA[0] += student.getGPA());
        double avggpa=totalGPA[0] /= students2.size();
        System.out.println(avggpa);

    }
    public static void main(String[] args) {
        new Avg_gpa();
    }
}
