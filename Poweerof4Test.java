import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Poweerof4Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPowerofNumber() {
        //arrange
        boolean expected=true;
        //act
        Poweerof4 input=new Poweerof4();
        boolean result= input.isPowerofNumber(16);
        //assert
        assertEquals(expected,result);
    }
}