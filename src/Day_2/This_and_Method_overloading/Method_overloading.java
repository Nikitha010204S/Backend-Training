//Write a program that has multiple overloaded methods for calculating the area of a rectangle, circle, and triangle.
package Day_2.This_and_Method_overloading;

public class Method_overloading {

        public double rectangle(double l,double b)
        {
            return l*b;
        }

    public int rectangle(int l,int b)
    {
        return l*b;
    }

        public double circle(double r)
        {
            return 3.14*r*r;
    }
    public int circle(int r)
    {
        return (314/100)*r*r;
    }

    public double triangle(double l,double b)
    {
        return 1/2*(l*b);
    }

    public int triangle(int l,int b)
    {
        return 1/2*(l*b);
    }
    public static void main(String[] args) {
            Method_overloading obj = new Method_overloading();
            System.out.println("Area of Rectangle : "+ obj.rectangle(10.5,20.98));
            System.out.println("Area of Rectangle : "+ obj.rectangle(10,20));

            System.out.println("Area of Circle : "+ obj.circle(30.));
        System.out.println("Area of Circle : " +obj.circle(10));

        System.out.println("Area of Triangle : "+obj.triangle(20,2035.2));
        System.out.println("Area of Triangle : "+obj.triangle(11,20));





    }


}
