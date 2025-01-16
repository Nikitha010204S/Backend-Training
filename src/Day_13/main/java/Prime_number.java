//Prime Number Checker
//Write a method to check if a number is prime. Test cases should cover boundary values like 0, 1,
// negative numbers, and large primes.

package Day_13.main.java;

public class Prime_number {
    public boolean isPrime(int n) {
        if(n<=1)
            return false;
        if(n==2)
            return true;
        if(n%2==0)
            return false;
        for (int i = 3; i <=Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Prime_number p = new Prime_number();
        System.out.println(p.isPrime(10));
        System.out.println(p.isPrime(-5));
        System.out.println(p.isPrime(0));
        System.out.println(p.isPrime(7));

    }
}
