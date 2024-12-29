package Day_1;
//Declare variables of all primitive types and print them.
//
//Convert a double to an int and print the result.

public class Primitive {

    public static void main(String args[])
    {
        int a=10;
        float b=20.71f;
        double c=3.14;
        boolean d=true;
        char e='n';
        long f=123456789028l;
        byte g = 127;
        short h = 32767;
        System.out.println("Integer :"+a);
        System.out.println("Float :"+b);
        System.out.println("Double :"+c);
        System.out.println("Boolean :"+d);
        System.out.println("Character :"+e);
        System.out.println("Long :"+f);
        System.out.println("Byte :"+g);
        System.out.println("Short :"+h);

        int convertint=(int)c;
        System.out.println("Converted Int :"+convertint);

    }

}
