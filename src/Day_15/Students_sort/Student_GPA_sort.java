package Day_15.Students_sort;

import Day_6.Clone.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Day_15.Students_sort.Student1;

public class Student_GPA_sort {
    public Student_GPA_sort() {
            Runnable run=()->System.out.println("Students GPA descending sort:");
            Thread thread=new Thread(run);
            thread.start();
            List<Student1> student1=new ArrayList<Student1>();
        student1.add(new Student1(1, "Anish", 3.5));
        student1.add(new Student1(2, "Bob", 7.5));
        student1.add(new Student1(3, "Ramya", 9.5));
        student1.add(new Student1(4, "Dany", 6.6));
        student1.add(new Student1(5, "Eve", 2.5));
        Collections.sort(student1,(s1,s2)->Double.compare(s2.getGPA(),s1.getGPA()));
        for (Student1 student : student1) {
            System.out.println(student.getName() + " - " + student.getGPA());
        }
    }
    public static void main(String[] args) {
        new Student_GPA_sort();


    }
}
