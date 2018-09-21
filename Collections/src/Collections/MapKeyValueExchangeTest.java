package Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapKeyValueExchangeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void exchange() {
        Map<String,String> list= new HashMap<>();
        list.put("val1"," ");
        list.put("val2","c++");
        Map<String,String> input= new HashMap<>();
        input.put("val1","c++");
        input.put("val2","java");
        MapKeyValueExchange test=new MapKeyValueExchange();
        assertEquals(list,test.exchange(input));
    }
}