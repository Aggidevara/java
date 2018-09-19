import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesOf7digitsareConsecutiveTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void series_is_Consecutive() {
        //arrange
        String expected="consecutive numbers";
        //act
        SeriesOf7digitsareConsecutive digits=new SeriesOf7digitsareConsecutive(new int[]{1,2,3,4,5,6,7});
        String result=digits.series_is_Consecutive();
        //assert
        assertEquals(expected,result);
    }
    @Test
    public void series_is_Non_Consecutive() {
        //arrange
        String expected="non consecutive numbers";
        //act
        SeriesOf7digitsareConsecutive digits=new SeriesOf7digitsareConsecutive(new int[]{1,2,3,4,5,6,6});
        String result=digits.series_is_Consecutive();
        //assert
        assertEquals(expected,result);
    }
    @Test
    public void series_is_null() {
        //arrange
        String expected=null;
        //act
        SeriesOf7digitsareConsecutive digits=new SeriesOf7digitsareConsecutive(new int[]{});
        String result=digits.series_is_Consecutive();
        //assert
        assertEquals(expected,result);
    }
}