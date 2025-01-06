//Practice - Comparator

package Day_8.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student_Comparator implements Comparable<Student_Comparator> {
    private String name;
    private int age;

    public Student_Comparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student_Comparator other) {
        return this.name.compareTo(other.name);   //sort by name
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        List<Student_Comparator> students = new ArrayList<>();
        students.add(new Student_Comparator("Alice", 23));
        students.add(new Student_Comparator("Bob", 21));
        students.add(new Student_Comparator("Charlie", 22));

        Collections.sort(students);
        System.out.println("Sorted by age (Comparable): " + students);
    }
}

