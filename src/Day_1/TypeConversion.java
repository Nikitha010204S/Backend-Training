package Day_1;

//Write a program that takes a float as input, converts it to int, and displays both values.
//
//Try a case where narrowing conversion loses precision (e.g., casting 123.456 to int).

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        int b=(int)a;
        System.out.println("Before Conversion:"+a);
        System.out.println("After Conversion:"+b);
    }
}
