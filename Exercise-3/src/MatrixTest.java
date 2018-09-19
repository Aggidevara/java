import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void additionOfMatrix() {
        //arrange
        int[][] expected={{10,10},{10,10},{10,10}};
        //act
        Matrix mat=new Matrix(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
        int[][]result= mat.additionOfMatrix();
        //assert
        assertEquals(expected,result);
    }
    @Test
    public void additionOfMatrix1() {
        //arrange
        int[][] expected={{10,10},{10,10},{10,10}};
        //act
        Matrix mat=new Matrix(3,2,new int[][]{{1,2},{3,4},{5,6}},new int[][]{{9,8},{7,6},{5,4}});
        int[][]result= mat.additionOfMatrix();
        //assert
        assertEquals(expected,result);
    }
}