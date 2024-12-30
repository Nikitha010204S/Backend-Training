//Create a class Calculator with overloaded methods add(int, int), add(double, double),
// and add(int, int, int). Test all methods.
//Method overloading
package Day_3.Polymorphism;

public class Calculator_overloading{
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
class Main3
{
    public static void main(String args[])
    {
    Calculator_overloading c=new Calculator_overloading();
        System.out.println(c.add(1,2));
        System.out.println(c.add(11,5,3));
         System.out.println(c.add(1.2,2.3));
    }
}
