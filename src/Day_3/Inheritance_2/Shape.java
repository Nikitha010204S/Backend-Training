//Create a class Shape with a method area(). Derive a class Rectangle with attributes length
// and breadth, and override the area() method. Further, derive a class Square from Rectangle
// and demonstrate multilevel inheritance.

package Day_3.Inheritance_2;

public class Shape {
    public void area()
    {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area()
    {
        System.out.println("Area of Rectangle :" +length*breadth);
    }
}

class Square extends Rectangle{
    int side;
    public Square(int side)
    {
        super(side,side);
    }
   @Override
           public void area()
    {
        System.out.println("Area of Square :" +length*length);
    }
}
class Main
{
    public static void main(String args[])
    {

 Rectangle r=new Rectangle(4,5);
 r.area();
 Square s=new Square(6);
 s.area();
    }
}