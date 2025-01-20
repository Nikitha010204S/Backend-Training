//Find the Top Scorer in Each Department
//Write a method that groups students by department and finds the top scorer in each department using Collectors.groupingBy and maxBy.

package Day_15.Top_score;

import Day_6.Clone.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Top_score {
    private String name;
    private int top_score;
    private String department;
    Top_score( String name,int top_score, String department) {

        this.name = name;
        this.top_score = top_score;
        this.department = department;
    }

    public int getTop_score() {
        return top_score;
    }

    public void setTop_score(int top_score) {
        this.top_score = top_score;
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

   public static void main(String[] args) {
       List<Top_score> students4 = new ArrayList<Top_score>();
       students4.add(new Top_score("John", 85, "Computer Science"));
       students4.add(new Top_score("Alice", 92, "Computer Science"));
       students4.add(new Top_score("Mithuna", 90, "Electrical"));
       students4.add(new Top_score("Prabha", 80, "Electrical"));
       students4.add(new Top_score("Michael", 95, "Mechanical"));

       Map<String, Optional<Top_score>> topScorersByDepartment = students4.stream()
               .collect(Collectors.groupingBy(
                       Top_score::getDepartment,
                       Collectors.maxBy(Comparator.comparingInt(Top_score::getTop_score))
               ));


       topScorersByDepartment.forEach((department, topStudent) -> {
           System.out.println("Department: " + department);
           topStudent.ifPresent(student ->
                   System.out.println("Top Scorer: " + student.getName() + " with Score: " + student.getTop_score())
           );
       });
   }

}
