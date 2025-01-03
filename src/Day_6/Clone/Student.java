//Create a class Student with fields for the name and age.
// Write a program to create a clone (copy) of a Student object using the clone() method.
package Day_6.Clone;

public class Student implements Cloneable {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        try {
            Student s1 = new Student("John", 30);
            Student s2 = (Student) s1.clone();
            System.out.println("Original : "+s1);
            System.out.println("Clone: "+s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
