package Strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Transpose_stringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transpose() {
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        Transpose_string test=new Transpose_string();
        String res=test.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,res);
    }
    @Test
    public void transpose_null() {
        String expected=null;
        Transpose_string test=new Transpose_string();
        String res=test.transpose("");
        assertEquals(expected,res);
    }
    @Test
    public void transpose_failure() {
        String expected="aaa";
        Transpose_string test=new Transpose_string();
        String res=test.transpose("aaa");
        assertEquals(expected,res);
    }
}