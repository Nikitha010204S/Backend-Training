//Define an interface Constants with static fields like PI = 3.14.
// Create a class Circle that uses this constant to calculate the area of a circle.

package Day_3.Interface_1;

interface Constant {
    static double PI=3.14;
}

class Circle implements Constant {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea()
    {
        double area=PI*radius*radius;
        System.out.println("Area of Circle : " +area);
        return area;
    }
}
class Main6{
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        circle.calculateArea();
    }
}
