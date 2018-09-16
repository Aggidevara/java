import org.junit.Test;

import static org.junit.Assert.*;

public class InputdeterminationTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void inputDetermination() {
        //arrange
        String expected="Capital letter";
        //act
        Inputdetermination input=new Inputdetermination();
        String result= input.inputDetermination("A");
        //assert
        assertEquals(expected,result);

    }

}