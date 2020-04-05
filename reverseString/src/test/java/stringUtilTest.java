
import org.junit.Test;


import static org.junit.Assert.*;

public class stringUtilTest {

    @Test
    public void reverse_null() {
//        null/empty
        String input = null;
        String output = StringUtil.reverse(input);
        assertNull(output);
    }

    @Test
    public void reverse_empty() {
//        null/empty
        String expected = "";
        String input = "";
        String output = StringUtil.reverse(input);
        assertEquals(expected,output);
    }

    @Test
    public void reverse_same() {
//        null/empty
        String expected = "aaa";
        String input = "aaa";
        String output = StringUtil.reverse(input);

        assertTrue(expected.equals(output));
    }

    @Test
    public void reverse_normal() {
//        null/empty
        String expected = "cba";
        String input = "abc";
        String output = StringUtil.reverse(input);

        assertTrue(expected.equals(output));
    }
}