import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalinputTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void totalInput() {
        //arrange
        int expected=94;
        //act
        Totalinput input=new Totalinput();
        int result= input.totalInput(new int[]{21,31,42});
        //assert
        assertEquals(expected,result);
    }
}