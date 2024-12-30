//Create a class Person with attributes name and age. Derive a class Student that adds
// rollNumber and marks. Write methods to display both Person and Student details.

package Day_3.Inheritance_1;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollno;
    int marks;

    Student(String name, int age, int rollno, int marks) {
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }
    public void display() {
        super.display();
        System.out.println("Rollno: " + rollno);
        System.out.println("Marks: " + marks);
    }
}
class Main{
    public static void main(String[] args) {
        Student s1 = new Student("Nikitha", 20, 5, 5);
        s1.display();
    }
}


