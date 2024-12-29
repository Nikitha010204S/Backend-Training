//Implement method overloading in a class Calculator with methods to add integers, doubles,
// and arrays of numbers.

package Day_2.OOPsBasic;

public class Calculator_Polymorphism {


    public int add(int n1,int n2)
        {
         return n1+n2;
        }

    public int add(int n1,int n2,int n3)
    {
       return n1+n2+n3;
    }

    public double add(double n1,double n2)
    {
        return n1+n2;
    }

    public double add(double n1,double n2,double n3)
    {
        return n1+n2+n3;
    }

    public int add(int[] numbers)
    {
            int sum=0;
            for(int n:numbers)
            {
                sum+=n;
            }
            return sum;
    }

    public double add(double[] numbers)
    {
        double sum=0.0;
        for(double n:numbers)
        {
            sum+=n;
        }
        return sum;
    }

    public static void main(String[] args) {
Calculator_Polymorphism c=new Calculator_Polymorphism();
int sum=c.add(1,2);
System.out.println("Sum of 2 integers : " +sum);
double sum2=c.add(2,3,7);
System.out.println("Sum of 3 doubles : " +sum2);
int[] numbers={1,2,3,4};
double[] numbers2={1.0,2.0,3.0,4.0};
System.out.println("Sum of array integers : "+ c.add(numbers));
System.out.println("Sum of array doubles: "+ c.add(numbers2));
    }
}
