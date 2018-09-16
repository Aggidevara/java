import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isVowelConsonant() {
        //arrange
        String[] expected={"a - vowel "};
        //act
        VowelConsonant input=new VowelConsonant();
        String[] result= input.isVowelConsonant("A");
        //assert
        assertEquals(expected,result);
    }
}