//Factorial Calculator
//Create a method to calculate the factorial of a number. Include test cases for zero,
// small positive numbers, and invalid inputs (e.g., negative numbers).

package Day_13.main.java;

public class Factorial {
    public String factorial(int n) {
        if (n < 0) {
            return "Factorial is not defined for negative numbers.";
        }
        if(n == 0) return "1";
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.factorial(5));
        System.out.println(f.factorial(0));
        System.out.println(f.factorial(-3));
        System.out.println(f.factorial(10));
        System.out.println(f.factorial(12));
        System.out.println(f.factorial(20));


    }
}
