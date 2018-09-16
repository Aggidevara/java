import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonIncreasingorderTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void noIncreasingOrder() {
        //arrange
        String expected="sum of even  umbers is less than 15 and Non Increasing number is 54321";
        //act
        NonIncreasingorder input=new NonIncreasingorder();
        String result= input.noIncreasingOrder("12345");
        //assert
        assertEquals(expected,result);
    }
}