import codewars.FindMissingLetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMissingLetterTest {

    @Test
    public void test(){

        assertEquals('e', FindMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));

    }
}
