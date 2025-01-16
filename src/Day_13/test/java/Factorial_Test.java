

package Day_13.test.java;

import Day_13.main.java.Factorial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial_Test {
    Factorial fact;
    @Before
    public void setUp() throws Exception {
        fact = new Factorial();
    }

    @Test
    public void testFactorial() {
        String res=fact.factorial(5);
        assertEquals("120", res);

        res=fact.factorial(3);
        assertEquals("6", res);

        res=fact.factorial(8);
        assertEquals("40320", res);

    }

    @Test
    public void testFactorial_zero() {
        String res=fact.factorial(0);
        assertEquals("1", res);
    }

    @Test
    public void testFactorial_neg() {

        String res=fact.factorial(-5);
        assertEquals("Factorial is not defined for negative numbers.", res);
    }
    @Test
    public void testFactorial_ten() {
        String res=fact.factorial(10);
        assertEquals("3628800", res);
    }

    @Test
    public void testFactorial_twelve() {
        String res = fact.factorial(12);
        assertEquals("479001600", res);
    }
    @Test
    public void testFactorial_twenty() {
        String res = fact.factorial(20);
        assertEquals("2432902008176640000", res);
    }

}
