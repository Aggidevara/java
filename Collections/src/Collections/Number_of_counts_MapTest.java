package Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Number_of_counts_MapTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count() {
        Map<String,Integer> expected=new HashMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        Number_of_counts_Map test=new Number_of_counts_Map();
        Map res=test.count("one _one one___two,,three,one @three*one?two");
        assertEquals(expected,res);
    }
}