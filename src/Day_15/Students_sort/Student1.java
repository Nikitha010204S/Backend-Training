//Sort a List of Students
//Write a method that takes a list of Student objects and sorts them by their GPA in descending order using a lambda expression.

package Day_15.Students_sort;

public class Student1 {

    private int id;
    private String name;
    private double  GPA;
    Student1(int id, String name, double  GPA) {
        this.id = id;
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }



}
