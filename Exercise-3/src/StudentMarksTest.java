import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkGradeValue() {
        //arrange
        String expected="MyException: Error:value in index - 1 should be in between 0 to 100";
        //act
        StudentMarks marks=new StudentMarks(2,new int[]{-1, 40});
        String result=marks.checkGradeValue();
        //assert
        assertEquals(expected,result);

        //arrange
        String expected1=null;
        //act
        StudentMarks marks1=new StudentMarks(2,new int[]{1, 40});
        String result1=marks1.checkGradeValue();
        //assert
        assertEquals(expected1,result1);
    }

}