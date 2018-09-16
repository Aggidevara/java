import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrequencyOfWordsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void readFileAsString() {
        String result="";
        //arrange
        String expected="i am a man i like to sleep i have a home";
        //act
        FrequencyOfWords words=new FrequencyOfWords();
        try {
         result=words.readFileAsString("/home/niit/workspace/FileDemo.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
       //assert
        assertEquals(expected,result);
    }
}