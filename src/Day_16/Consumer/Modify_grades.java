//Modify Student Grades
//Write a program that accepts a Consumer<Student> to increase each student's grade by 10.
// Define a Student class and modify a list of Student objects.
//Input:
//John: 70
//Alice: 60
//     Output :
//       John: 80
//  Alice: 70
package Day_16.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class Student4 {
        private String name;
        private int mark;

        Student4(String name, int mark) {
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

        @Override
        public String toString()
        {
            return name + ": " + mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }
        public void addMark(int mark) {
            this.mark += mark;
        }

}
class Modify_grades {
    public static void main(String[] args) {
        List<Student4> list = new ArrayList<>();
        list.add(new Student4("John", 70));
        list.add(new Student4("Alice", 60));
        Consumer<Student4> add = s -> s.addMark(10);
        list.forEach(add);
        for(Student4 s: list)
            System.out.println(s);
    }
}
