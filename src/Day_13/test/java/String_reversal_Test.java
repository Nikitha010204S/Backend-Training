package Day_13.test.java;

import Day_13.main.java.String_reversal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class String_reversal_Test {
    String_reversal sv;

    @Before
    public void setUp() throws Exception {
        sv = new String_reversal();
    }

    @Test
    public void Normal() {
        String result = sv.reversal("Hello");
        assertEquals("olleH", result);
    }
    @Test
    public void empty() {
        String result = sv.reversal("");
        assertEquals("", result);
    }
    @Test
    public void onechar() {
        String result = sv.reversal("b");
        assertEquals("b", result);
    }

    @Test
    public void splchar() {
        String result = sv.reversal("%^&*$#");
        assertEquals("#$*&^%", result);
    }

    @Test
    public void digi() {
        String result = sv.reversal("123456");
        assertEquals("654321", result);
    }

}
