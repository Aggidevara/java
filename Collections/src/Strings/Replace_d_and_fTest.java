package Strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Replace_d_and_fTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replace() {
        String expected="faity fry";
        Replace_d_and_f test=new Replace_d_and_f();
        String res=test.replace("daily dry");
        assertEquals(expected,res);
    }
    @Test
    public void replace_null() {
        String expected=null;
        Replace_d_and_f test=new Replace_d_and_f();
        String res=test.replace("");
        assertEquals(expected,res);
    }
    @Test
    public void replace_failure() {
        String expected="abc";
        Replace_d_and_f test=new Replace_d_and_f();
        String res=test.replace("abc");
        assertEquals(expected,res);
    }
}