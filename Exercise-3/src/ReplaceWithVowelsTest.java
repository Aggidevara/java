import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceWithVowelsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void afterRemovingVowel() {
        //arrange
        String[] expected={"nd","grmny"};
        //act
        ReplaceWithVowels vowels=new ReplaceWithVowels(2, new String[]{"india","germany"});
        String[] result=vowels.afterRemovingVowel();
        //assert

        assertEquals(expected,result);
    }
    @Test
    public void afterRemovingVowel1() {
        //arrange
        String[] expected=null;
        //act
        ReplaceWithVowels vowels=new ReplaceWithVowels(2, new String[]{"nd","grmny"});
        String[] result=vowels.afterRemovingVowel();
        //assert

        assertEquals(expected,result);
    }
}