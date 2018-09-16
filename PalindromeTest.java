import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPalindrome() {
        //arrange
        String expected="121 is a palindrome and even sum is lessthan 25";
        //act
        Palindrome input=new Palindrome();
        String result= input.isPalindrome("121");
        //assert
        assertEquals(expected,result);
    }
}