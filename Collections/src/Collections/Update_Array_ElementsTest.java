package Collections;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Update_Array_ElementsTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void update_elements() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Kiwi");
        list.add("Grape");
        list.add("Mango");
        list.add("Berry");
        ArrayList expected=list;

        ArrayList<String> list1= new ArrayList<String>();
        list1.add("Apple");
        list1.add("Grape");
        list1.add("Melon");
        list1.add("Berry");
        Update_Array_Elements test=new Update_Array_Elements(list1);
        List result=test.update_elements(0,"Kiwi",2,"Mango");
        assertEquals(expected,result);
    }
}