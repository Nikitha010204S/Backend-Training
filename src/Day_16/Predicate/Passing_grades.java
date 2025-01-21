//Write a function that accepts a Predicate<Student> to filter students with grades above 60. Define
// a Student class with fields like name and grade.
//Input:
//John: 75
//Alice: 55
//Mark: 88
//Output: John, Mark
package Day_16.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student4
{
    private String name;
    private int mark;
    Student4(String name, int mark)
    {
        this.name = name;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    public String toString()
    {
        return name ;
    }

    public void print(List<Student4> students,Predicate<Student4> predicate)
    {
        for(Student4 s: students)
        {
            if(predicate.test(s))
            {
                System.out.println(s.toString());
            }
        }
    }
}
class Passing_grades
{
    public static void main(String[] args) {
        List<Student4> students = new ArrayList<>();
        students.add(new Student4("John", 75));
        students.add(new Student4("Alice", 55));
        students.add(new Student4("Mark", 88));
        Predicate<Student4> predicate=s->s.getMark()>60;
        Student4 s4=new Student4("",0);
        s4.print(students,predicate);
    }
}
