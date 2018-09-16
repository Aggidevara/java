import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthiterationTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void iteration() {
        //arrange
        String expected="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6";
        //act
        Nthiteration input=new Nthiteration();
        String result= input.iteration(6);
        //assert
        assertEquals(expected,result);
    }
}