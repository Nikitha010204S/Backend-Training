package Day_13.test.java;

import Day_13.main.java.Palindrome;
import Day_13.main.java.String_reversal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Palindrome_Test {
    Palindrome palin;

    @Before
    public void setUp() throws Exception {
        palin = new Palindrome();
    }

    @Test
    public void Palindrome() {

        Boolean result=palin.ispalindrome("madam");
        assertEquals(true, result);

        result=palin.ispalindrome("a");
        assertEquals(true, result);

        result=palin.ispalindrome("");
        assertEquals(true, result);

        result=palin.ispalindrome("step on no pets");
        assertEquals(true, result);

        result=palin.ispalindrome("%&*(*&%");
        assertEquals(true, result);

    }

    @Test
    public void Non_Palindrome() {
        Boolean result=palin.ispalindrome("abcd");
        assertEquals(false, result);

        result=palin.ispalindrome("123456");
        assertEquals(false, result);

        result=palin.ispalindrome("abbA");
        assertEquals(false, result);

        result=palin.ispalindrome("Madam");
        assertEquals(false, result);

    }

    @Test
    public void Case_sensitive() {

        Boolean result=palin.ispalindrome(" Abcd");
        assertEquals(false, result);

        result=palin.ispalindrome("aBbA");
        assertEquals(false, result);

        result=palin.ispalindrome("Madam");
        assertEquals(false, result);

    }


}
