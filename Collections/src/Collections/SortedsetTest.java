package Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortedsetTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortset() {

            ArrayList list=new ArrayList();
            list.add("a");
            list.add("b");
            list.add("c");
            SortedSet set=new TreeSet();
            set.add("c");
            set.add("b");
            set.add("a");
            Sortedset test=new Sortedset();
            ArrayList res=test.sortset((TreeSet) set);
            assertEquals(list,res);
    }
}