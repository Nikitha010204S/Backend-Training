////Prime Number Checker
////Write a method to check if a number is prime. Test cases should cover boundary values like 0, 1,
//// negative numbers, and large primes.

package Day_13.test.java;

import Day_13.main.java.Prime_number;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Prime_number_Test {
    Prime_number prime;
    @Before
    public void setUp() throws Exception {
        prime = new Prime_number();
    }

    @Test
    public void isPrime_zero() {
        boolean res=prime.isPrime(0);
        assertEquals(false,res);

    }

    @Test
    public void isPrime_one() {
        boolean res=prime.isPrime(1);
        assertEquals(false,res);
    }

    @Test
    public void isPrime_two() {
        boolean res=prime.isPrime(2);
        assertEquals(true,res);
    }

    @Test
    public void isPrime_neg() {
        boolean res=prime.isPrime(-2);
        assertEquals(false,res);
    }

    @Test
    public void isPrime_largePrime() {
        boolean res = prime.isPrime(7919);
        assertEquals(true, res);
    }


    @Test
    public void isPrime_largeNonPrime() {
        boolean res = prime.isPrime(10000000);
        assertEquals(false, res);
    }


}
