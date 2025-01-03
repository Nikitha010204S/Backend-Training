package Day_5.Access_Modifier;

public class Employee extends Person {

    public Employee(String name, int age, String address, int salary) {
        super(name, age, address, salary);
    }
public void display() {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Address :"+address);
        System.out.println("Salary :"+getSalary());

}

}
