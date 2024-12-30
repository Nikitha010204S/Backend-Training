//Create a class Vehicle with a method start(). Derive a class Car that overrides the start() method.
// Write a program to demonstrate method overriding.
package Day_3.Inheritance_1;

public class Vehicle {
    String name;
    int year;
    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public void start()
    {
        System.out.println(this.name + " is running.");
    }
}

class Car extends Vehicle {
    public Car(String name, int year) {
        super(name, year);
    }

    @Override
    public void start() {
        System.out.println(this.name + " is running smoothly.");
    }
}

class Main1 {
        public static void main(String args[]) {
Car car = new Car("Car", 2018);
car.start();
        }
    }
