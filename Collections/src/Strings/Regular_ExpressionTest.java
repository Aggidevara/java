package Strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Regular_ExpressionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findharry() {
        String expected="Is Harry here ? true";
        Regular_Expression test=new Regular_Expression();
        String res=test.findharry("This is harry");
        assertEquals(expected,res);
    }
    @Test
    public void findharry_failure() {
        String expected="Is Harry here ? false";
        Regular_Expression test=new Regular_Expression();
        String res=test.findharry("This is henry");
        assertEquals(expected,res);
    }
    @Test
    public void findharry_null() {
        String expected=null;
        Regular_Expression test=new Regular_Expression();
        String res=test.findharry("");
        assertEquals(expected,res);
    }

}