package Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ArrayOfStringsAsInputTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count() {
        Map<String, Boolean> list=new TreeMap<>();
        list.put("a",true);
        list.put("b",false);
        list.put("c",true);
        list.put("d",false);
        ArrayOfStringsAsInput test=new ArrayOfStringsAsInput();
        Map res=test.count(new String[]{"a", "b", "c", "d", "a", "c"});
        assertEquals(list,res);
    }
}