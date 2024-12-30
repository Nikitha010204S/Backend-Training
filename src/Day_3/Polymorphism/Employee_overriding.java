//Write a program with a base class Employee that has a method calculateSalary().
// Derive two classes Manager and Developer, and override the calculateSalary() method
// in both to display different salaries.

package Day_3.Polymorphism;

public class Employee_overriding {

    public void calculateSalary() {
        System.out.println("Employee Salary...");
    }
}
class Manager extends Employee_overriding {
     private double salary;
     private double bonus;
     Manager(double salary, double bonus) {
         this.salary = salary;
         this.bonus = bonus;
     }
     @Override
     public void calculateSalary() {
         double totalsalary = salary + bonus;
         System.out.println("Manager Salary: " + totalsalary);
     }
}

class Developer extends Employee_overriding {
    private double salary;
    private double bonus;
    Developer(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;

    }
    @Override
    public void calculateSalary() {
        double totalsalary = salary + bonus;
        System.out.println("Developer Salary: " + totalsalary);
    }
}
class Main4{
    public static void main(String[] args) {
        Manager m = new Manager(80000, 20000);
        m.calculateSalary();

        Developer d = new Developer(60000, 10000);
        d.calculateSalary();
    }
}