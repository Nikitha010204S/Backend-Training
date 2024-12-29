//Create a class Student with attributes like name and age. Initialize these attributes using a parameterized constructor.

package Day_2.Constructors;

public class Student_Parameterized_constructor {
    String name;
    int age;
    Student_Parameterized_constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student_Parameterized_constructor student1 = new Student_Parameterized_constructor("Sam", 20);
        Student_Parameterized_constructor student2 = new Student_Parameterized_constructor("Ram", 22);
        System.out.println();
        student1.display();
        student2.display();
    }
}
