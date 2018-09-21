package Strings;

public class Count_Character_OccurrenceTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void count_character() {
        int expected=8;
        Count_Character_Occurrence test=new Count_Character_Occurrence();
        int res=test.count_character("Java is java again java",'a');
    }
    @org.junit.Test
    public void count_character_null() {
        int expected=0;
        Count_Character_Occurrence test=new Count_Character_Occurrence();
        int res=test.count_character("gbcc",'a');
    }
}