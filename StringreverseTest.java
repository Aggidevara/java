import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringreverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reversedString() {
        //arrange
        String expected="Reversed String is swetha";
        //act
        Stringreverse input=new Stringreverse();
        String result= input.reversedString("ahtews");
        //assert
        assertEquals(expected,result);
    }
}