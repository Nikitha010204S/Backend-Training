//Create a Student class with fields name and marks. Write an instance method displayStudentDetails in
// the Student class to print the student's details. Use a method reference to call this method for each student in a list.
package Day_17.Method_reference;

import java.util.ArrayList;
import java.util.List;

public class Student_name_mark {
    private String name;
    private int mark;
    Student_name_mark(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
    public void displayStudentDetails() {
        System.out.println("Name: " + name + ",  Mark: " + mark);

    }

}
class Main7
{
    public static void main(String args[])
    {
        List<Student_name_mark> list = new ArrayList<Student_name_mark>();
        list.add(new Student_name_mark("James", 82));
        list.add(new Student_name_mark("Bob", 90));
        list.add(new Student_name_mark("John", 80));
        list.forEach(Student_name_mark::displayStudentDetails);
    }
}
