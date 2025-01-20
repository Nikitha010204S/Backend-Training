//Find Students with Names Starting with a Letter
//Write a method that finds all students whose names start with a specific letter.

package Day_15.Student_Starting_letter;


import java.util.ArrayList;
import java.util.List;

public class Student_Starting_letter {
    private String name;
    int age;

    Student_Starting_letter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void Search_name(List<Student_Starting_letter> s2, String ch) {
        s2.forEach(sl->
        {
            if(sl.getName().toUpperCase().charAt(0)==Character.toUpperCase(ch.charAt(0)))
            {
                System.out.println(sl.getName());
            }
        });
    }
    public static void main(String[] args) {
       List<Student_Starting_letter> s2 = new ArrayList<Student_Starting_letter>();
       s2.add(new Student_Starting_letter("John", 20));
       s2.add(new Student_Starting_letter("Prabha", 18));
       s2.add(new Student_Starting_letter("Mithuna", 17));
       s2.add(new Student_Starting_letter("Kiruthika", 18));
       s2.add(new Student_Starting_letter("Michael", 18));

     System.out.println("Name of the Student is:");
     Student_Starting_letter.Search_name(s2,"M");

     Student_Starting_letter.Search_name(s2,"J");

    }


}




