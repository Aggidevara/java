import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddandevencheckingTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void oddeven() {
        // arrange
        String expected="Jerry";
        //act
        Oddandevenchecking input=new Oddandevenchecking();
        String result= input.oddeven(26);
        //assert
        assertEquals(expected,result);
    }
}