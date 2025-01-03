//Create a class Person with:
//name (public)
//age (protected)
//address (default)
//salary (private)
//Create a subclass Employee in the same package to demonstrate which members are accessible.
//Create another class TestAccess in a different package to test accessibility.

package Day_5.Access_Modifier;

import java.util.Scanner;

public class Person {

        public String name;
        protected int age;
        String address;
        private int salary;
        public Person(String name, int age, String address, int salary) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.salary = salary;

    }

    public int getSalary() {
        return salary;
    }


}

