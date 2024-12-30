//Create an abstract class Shape with an abstract method calculateArea().
//
// Derive classes Circle and Rectangle and implement the calculateArea() method in both.

package Day_3.Abstract;

public abstract class Shape {
    public abstract void calculateArea();
}
class Circle extends Shape
{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

class Rectangle extends Shape
{
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of rectangle: " + area);
    }
}
class Main{
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.calculateArea();
        Shape rectangle = new Rectangle(5, 10);
        rectangle.calculateArea();
    }
}

