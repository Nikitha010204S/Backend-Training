//Create a class Employee with attributes id, name, and salary. Use the this keyword to resolve naming conflicts
// between local variables and instance variables.

package Day_2.This_and_Method_overloading;

public class Employee_this_keyword {
    int id;
    String name;
    int salary;

    Employee_this_keyword() {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void display(int id, String name, int salary) {
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
       Employee_this_keyword emp = new Employee_this_keyword();
       emp.display(1, "Janani", 20000);
    }
}

