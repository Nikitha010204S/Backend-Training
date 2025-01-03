//Math - Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.

package Day_6.Java_lang_Classes;

public class Math_ops {
    public static void main(String[] args) {
        double num1 = 16.0;
        double num2 = 4.0;
        double sqrt = Math.sqrt(num1);
        System.out.println("The sqrt of " + num1 + " is " + sqrt);
        double power=Math.pow(num2,2);
        System.out.println("The power of " + num2 + " is " + power);
        double max=Math.max(num1,num2);
        System.out.println("The max is "+ max);
    }
}
