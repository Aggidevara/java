import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateDateTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculate_day() {
        //arrange
        String expected="Mon 17/09/2018\nSun 23/09/2018 ".trim();
        //act
        CalculateDate cal=new CalculateDate();
        String result=cal.calculate_day();
        //assert
        assertEquals(expected,result);
    }
}