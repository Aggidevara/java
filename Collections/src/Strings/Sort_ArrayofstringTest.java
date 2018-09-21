package Strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sort_ArrayofstringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        String[] expected={"abc","abcd"};
        Sort_Arrayofstring test=new Sort_Arrayofstring();
        String[] res=test.sort("abcd abc");
        assertEquals(expected,res);
    }
    @Test
    public void sort_null() {
        String[] expected=null;
        Sort_Arrayofstring test=new Sort_Arrayofstring();
        String[] res=test.sort("");
        assertEquals(expected,res);
    }
    @Test
    public void sort_failure() {
        String[] expected={"aaa","aaabbc"};
        Sort_Arrayofstring test=new Sort_Arrayofstring();
        String[] res=test.sort("aaabbc aaa");
        assertEquals(expected,res);
    }
}