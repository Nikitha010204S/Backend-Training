//Create and Use Packages:
//Create a package shapes with two classes:
//Circle with a method to calculate the area of a circle.
//Rectangle with a method to calculate the area of a rectangle.
//Write a Main class in the default package to import and use these classes.

package Day_5.Shapes;

public class Circle {
    double radius;
    public void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is  " + area);
    }
}
