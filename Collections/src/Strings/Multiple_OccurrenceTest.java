package Strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Multiple_OccurrenceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findOccurrence() {
        String expected="Found at:4-6 10-12 27-29";
        Multiple_Occurrence test=new Multiple_Occurrence();
        String result=test.findOccurrence("She sells seashells by the seashore","se");
        assertEquals(expected,result);
    }
    @Test
    public void findOccurrence_null() {
        String expected=null;
        Multiple_Occurrence test=new Multiple_Occurrence();
        String result=test.findOccurrence("","se");
        assertEquals(expected,result);
    }
}