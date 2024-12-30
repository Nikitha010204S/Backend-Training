//Write a program with a class Counter that has a static variable to count the number of objects
// created. Create three objects and print the count using a static method.
package Day_3.Static;

public class Counter {
        static int counter = 0;

    public Counter()
    {
counter++;
    }
    public Counter(int n){
counter++;
    }
    public Counter(String s)
    {
counter++;
    }
    public static int getCount()
    {
        return counter;
    }
    public static void main(String args[])
    {
        Counter c=new Counter();
        Counter c1=new Counter("1");
        Counter c3=new Counter(120);
        System.out.println("Count : " +Counter.getCount());

    }

}
