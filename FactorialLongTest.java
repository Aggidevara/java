import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialLongTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void printLongFactorials() {
        //arrange
        String expected="Number should be in between 0-100";
        //act
        NumberandGrade input=new NumberandGrade();
        String result= input.numberandgrade(new int[]{121});
        //assert
        assertEquals(expected,result);
    }
}