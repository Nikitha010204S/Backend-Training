//Practice problems:
//This project is about analyzing the performance of students in different departments using Java Streams.
// Here's the step-by-step explanation:


//Imagine we have students in three departments (like Computer Science, Mathematics, and Physics). Each student has:
//A name (e.g., "John"),
//Marks for 5 subjects (e.g., 85, 90, 78, etc.),
//A grade (to be calculated based on their average marks).


//We want to:
//Find the top 3 students based on their average marks.
//Assign a grade (A, B, C, D) to each student based on their average marks.
//Find the average marks for each department.
//Identify the top student in each department.
//Count how many students failed in each department (average marks < 50).

package Day_18;



import java.util.*;
import java.util.stream.Collectors;

public class Student_Streams_practice {
    private String name;
    private String department;
    private int[] marks;

    Student_Streams_practice(String name, String department, int[] marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public double getAverageMarks() {
     return Arrays.stream(marks).average().orElse(0.0);
    }
    public String getGrade()
    {
        double avgMarks = getAverageMarks();
        if(avgMarks >=90)
            return "A";
        else if(avgMarks >=80)
            return "B";
        else if (avgMarks >=70)
            return "C";
        else
            return "D";
    }
    @Override
     public String toString() {
        return "Name=" + name + ", Department=" + department +", AverageMarks=" + getAverageMarks()+", Grade=" + getGrade() ;
     }

}
class Main6
{
    public static void main(String[] args)
    {
        List<Student_Streams_practice> students = new ArrayList<Student_Streams_practice>();
        students.add(new Student_Streams_practice("Devi", "Computer Science", new int[]{85, 90, 78, 92, 88}));
        students.add(new Student_Streams_practice("John", "Mathematics", new int[]{70, 75, 80, 65, 60}));
        students.add(new Student_Streams_practice("Alice", "Physics", new int[]{40, 45, 50, 55, 60}));
        students.add(new Student_Streams_practice("Bob", "Computer Science", new int[]{95, 100, 90, 85, 80}));
        students.add(new Student_Streams_practice("Charlie", "Mathematics", new int[]{30, 35, 40, 45, 50}));
        students.add(new Student_Streams_practice("David", "Physics", new int[]{60, 65, 70, 75, 80}));
        students.add(new Student_Streams_practice("Eve", "Computer Science", new int[]{80, 85, 90, 95, 100}));
        students.add(new Student_Streams_practice("Frank", "Mathematics", new int[]{55, 60, 65, 70, 75}));
        students.add(new Student_Streams_practice("Grace", "Physics", new int[]{50, 55, 60, 65, 70}));
        students.add(new Student_Streams_practice("Hank", "Computer Science", new int[]{90, 85, 80, 75, 70}));

        System.out.println("The top 3 students based on their average marks:");
        Top3_Students(students);
        System.out.println();

        System.out.println("Grade for student based on their average marks:");
        Calculate_grade(students);
        System.out.println();

        System.out.println("Average marks for each department:");
        AverageMarks(students);
        System.out.println();

        System.out.println("Top student in each department:");
        TopStudent(students);
        System.out.println();

        System.out.println("Count of students failed in each department (average marks < 50):");
        Fail_count(students);



    }

public static void Top3_Students(List<Student_Streams_practice> students)
{
    students.stream()
            .sorted(Comparator.comparing(Student_Streams_practice::getAverageMarks).reversed())
            .limit(3)
            .forEach(System.out::println);
}

   public static void Calculate_grade(List<Student_Streams_practice> students)
   {
       students.forEach(student -> {System.out.println(student +" : "+student.getGrade());});
   }


public static void AverageMarks(List<Student_Streams_practice> students)
{
    students.stream()
            .collect(Collectors.groupingBy(Student_Streams_practice::getDepartment
            ,Collectors.averagingDouble(Student_Streams_practice::getAverageMarks)))
            .forEach((department, marks) -> {System.out.println(department +" : "+marks);});
}


   public static void TopStudent(List<Student_Streams_practice> students) {
          students.stream()
                  .collect(Collectors.groupingBy(Student_Streams_practice::getDepartment))
                  .forEach((department,studentList)->
                  {
                      Student_Streams_practice topStudent=studentList.stream().max(Comparator.comparingDouble(Student_Streams_practice::getAverageMarks)).orElse(null) ;
                      System.out.println(department+" : "+topStudent.getName()+" : "+topStudent.getGrade());
                  });

   }


    public static void Fail_count(List<Student_Streams_practice> students)
    {
        students.stream()
                .collect(Collectors.groupingBy(Student_Streams_practice::getDepartment))
        .forEach((department,studentList)->{
            long failstudent=studentList.stream().filter(student->student.getAverageMarks()<50).count();
            System.out.println(department+" : "+failstudent);
        });
    }

}

