import static org.junit.Assert.*;

public class Palindrome2Test {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void isPalindrome() {
        //arrange
        boolean expected=true;
        //act
        Palindrome2 pali=new Palindrome2();
        boolean val=pali.isPalindrome("112211");
        //assert
        assertEquals(expected,val);
    }
}